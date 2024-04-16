package com.bitcamp.api.common.component;

import com.bitcamp.api.user.model.UserDto;
import com.bitcamp.api.user.repository.UserRepository;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

import java.sql.SQLException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

import javax.crypto.SecretKey;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class JwtProvider  {
    @Value("${jwt.iss}")
    private String issuer;

    private final SecretKey secretKey;
    Instant expiredDate = Instant.now().plus(1, ChronoUnit.DAYS);


    public JwtProvider(@Value("${jwt.secret}") String secretKey) {
        this.secretKey = Keys.hmacShaKeyFor(Decoders.BASE64URL.decode(secretKey));
    }


    public String createToken(UserDto dto) {

        String token = Jwts.builder()
        .issuer(issuer)
        .signWith(secretKey)
        .expiration(Date.from(expiredDate))
        .subject("bitcamp")
        .claim("username", dto.getUsername())
        .claim("job", dto.getJob())
        .claim("userId", dto.getId())
        .compact();
        ;

        log.info("로그인 성공으로 발급된 토큰 : "+token);

        return token;
    }

  
    
    
}
