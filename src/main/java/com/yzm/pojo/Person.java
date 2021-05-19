package com.yzm.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Auther: yzm
 * @Date: 2021/5/18 - 05 - 18 - 19:40
 * @Description: com.yzm.pojo
 * @version: 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person implements Serializable {
    private String pname;
    private Integer page;
    private String gender;
    private String[] hobby;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthdate;

    private List<Pet> pets;
    private Map<String,Pet> petMap;

    private Pet pet;
}
