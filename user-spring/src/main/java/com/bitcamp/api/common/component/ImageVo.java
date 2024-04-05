package com.bitcamp.api.common.component;
import org.springframework.stereotype.Component;
import lombok.*;


@Component
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ImageVo {
    private long imageId;
    String name;
    Long lastModified;
    Long lastModifiedDate;
    String type;
    String webkitRelativePath;
    Long size;
    
}
