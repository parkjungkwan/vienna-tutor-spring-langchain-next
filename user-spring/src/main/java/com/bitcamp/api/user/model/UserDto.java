package com.bitcamp.api.user.model;

import org.springframework.stereotype.Component;
import lombok.*;

@Component
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private Long id;
    private String username;
    private String password;
    private String name;
    private String phone;
    private Long addressId;
    private String job;

    
}
