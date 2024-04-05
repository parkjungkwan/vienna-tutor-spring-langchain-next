package com.bitcamp.api.common.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(value={})
@Getter
public class BaseEntity {

    @CreatedDate
    @Column(name="reg_date", updatable= false)
    private LocalDateTime regDate;


    @LastModifiedDate
    @Column(name="mod_date")
    private LocalDateTime modDate;

    
}
