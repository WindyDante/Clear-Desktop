package cn.wind.clear.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserLoginVO implements Serializable {
    private String id; // 用户id, 主键值
    private String username; // 用户名
    private String tk; // JWT令牌
    private Integer theme;
}
