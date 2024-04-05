package com.bitcamp.api.common.component;

import org.springframework.stereotype.Component;

import lombok.*;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PropertiesVo {
    private Boolean enabled;
    private String location;
    private String maxFileSize;
    private String maxRequestSize;
    private String fileSizeThreshold;
    
}
