package com.bitcamp.api.user.service;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.util.ReflectionTestUtils;
import com.bitcamp.api.common.component.Messenger;
import com.bitcamp.api.user.model.User;
import com.bitcamp.api.user.model.UserDto;
import com.bitcamp.api.user.repository.UserRepository;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import com.fasterxml.jackson.databind.ObjectMapper;


@ExtendWith(MockitoExtension.class)
public class UserServiceImplTest {
    @InjectMocks
    private UserServiceImpl service;
    @Mock
    private UserRepository repository;
    @Spy
    private ObjectMapper objectMapper;
    @BeforeEach
    void setup() {
       this.service = new UserServiceImpl(repository, null);
    }
    // @Test
    // public void 사용자_저장()throws Exception {
       
    //     UserDto dto =UserDto.builder().id(1L).name("홍길동").build();
    //     when(service.save((dto))).thenReturn(Messenger.builder().message("SUCCESS").build());
    //     assertThat(service.count().getMessage()).isEqualTo("0");
    //     // assertThat(service.findById(1L).get().getName()).isEqualTo("홍길동");
    //     // verify(repository, times(1)).findById(1L);
    //     // verify(repository, never()).findAll();
    //     // verifyNoInteractions(repository);
    // }
    @Test
    public void 사용자_검색()throws Exception {
       
        Optional<User> user = Optional.of(User.builder().id(1L).name("홍길동").build());
        when(repository.findById(anyLong())).thenReturn(user);
        assertThat(service.findById(1L).get().getName()).isEqualTo("홍길동");
        // verify(repository, times(1)).findById(1L);
        // verify(repository, never()).findAll();
        // verifyNoInteractions(repository);
    }
    @Test
    public void 사용자_전체_검색()throws Exception {
       
        List<User> users = getList();
        BDDMockito.given(repository.findAll()).willReturn(users);
        List<UserDto> list = service.findAll();
        assertThat(list.size())
        .isEqualTo(3);
        
        // verify(repository, times(1)).findById(1L);
        // verify(repository, never()).findAll();
        // verifyNoInteractions(repository);
    }

    private List<User> getList() {
        return Arrays.asList(
                User.builder().id(1L).username("yoo").name("유관순").build(),
                User.builder().id(2L).username("kim").name("김구").build(),
                User.builder().id(3L).username("lee").name("이화림").build()
        );
    }
    private User dtoToEntity(UserDto dto){
        return User.builder()
            .id(dto.getId())
            .username(dto.getUsername())
            .name(dto.getName())
            .build();
    }

    @DisplayName("토큰 발급에 성공한다.")
        @Test
        void _willSuccess() {

            // given
            // Date issueDate = new Date(System.currentTimeMillis());
            // JwtPayload targetPayload = new JwtPayload("test@email.com", issueDate);

            // // when
            // String accessToken = jwtProvider.createAccessToken(targetPayload);

            // // then
            // Assertions.assertThat(accessToken).isNotNull();

            // Jws<Claims> claimsJws = Jwts.parser().verifyWith(secretKey).build()
            //     .parseSignedClaims(accessToken);

            // Assertions.assertThat(claimsJws.getPayload().getIssuer()).isEqualTo(applicationName);
            // Assertions.assertThat(claimsJws.getPayload().getIssuedAt()).isEqualTo(roundOffMillis(issueDate));
            // Assertions.assertThat(claimsJws.getPayload().getExpiration()).isEqualTo(new Date(issueDate.getTime() + accessExpiration));
        }


}
