package com.bitcamp.api.user;

import java.util.List;

import com.bitcamp.api.account.Account;
import com.bitcamp.api.article.Article;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;

@Entity(name="users")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})
public class User {

    @Id
    @Column(name="id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String name;
    private String phone;
    private Long addressId;
    private String job;
    private double height;
    private double weight;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    @OneToMany(mappedBy = "writer")
    private List<Article> article;

    @Builder(builderMethodName = "builder")
    public User(Long id,String username, String password,
                String name, String phone,
                String job,
                double height, double weight) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.phone = phone;
        this.job = job;
        this.height = height;
        this.weight = weight;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   

    @Override
    public String toString() {
        return "User{\n" +
                "username='" + username + '\n' +
                ", password='" + password + '\n' +
                ", name='" + name + '\n' +
                ", phoneNumber='" + phone + '\n' +
                ", job='" + job + '\n' +
                '}';
    }
}
