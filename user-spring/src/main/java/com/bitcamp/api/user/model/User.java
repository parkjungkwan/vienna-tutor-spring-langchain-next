package com.bitcamp.api.user.model;

import com.bitcamp.api.article.model.Article;
import com.bitcamp.api.common.model.BaseEntity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name = "users")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Builder
@AllArgsConstructor
@Setter
@ToString(exclude = {"id"})
public class User extends BaseEntity{
    @Id
    @Column(name = "user_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;
    private String password;
    private String name;
    private String phone;
    private Long addressId;
    private String job;


    @OneToMany(mappedBy = "writer", fetch = FetchType.LAZY)
    private List<Article> articles;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber=" + phone +
                ", address='" + addressId + '\'' +
                ", job='" + job + '\'' +
   
                '}' + '\n';
    }

    public void setPassword(String password) {
        this.password = password;
    }
}