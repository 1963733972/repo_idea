package com.example.spring_boot.Bean;/*
 * @ClassName Pet
 * @Desc TODO
 * @Author 19637
 * @Date 2021/11/15 10:14
 * @Version 1.0
 */

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Pet {
    private String sex;
    private String total;
}
