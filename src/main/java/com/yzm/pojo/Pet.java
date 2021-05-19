package com.yzm.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Auther: yzm
 * @Date: 2021/5/18 - 05 - 18 - 19:56
 * @Description: com.yzm.pojo
 * @version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pet implements Serializable {
    private String name;
    private String pet;
}
