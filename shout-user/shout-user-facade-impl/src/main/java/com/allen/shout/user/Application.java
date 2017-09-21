package com.allen.shout.user;

import com.allen.shout.user.core.domain.UserBase;
import com.allen.shout.user.infra.repository.mapper.UserBaseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class Application {

    @Autowired(required=false)
    private UserBaseMapper userBaseMapper;

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @RequestMapping("/hello")
    public UserBase hello(){
        return userBaseMapper.selectById("1");
    }
}
