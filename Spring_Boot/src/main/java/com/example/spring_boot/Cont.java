package com.example.spring_boot;/*
 * @ClassName Cont
 * @Desc TODO
 * @Author 19637
 * @Date 2021/11/15 18:48
 * @Version 1.0
 */

import com.example.spring_boot.Bean.User;
import org.apache.catalina.Host;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class Cont {
    @ResponseBody
    @RequestMapping(value="re")
    public User get(){
        User user = new User();
        user.setAge(18);
        user.setName("16");
        return user;
    }
}
