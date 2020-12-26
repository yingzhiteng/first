package com.atguigu.first;

import com.atguigu.first.Mapper.UserMapper;
import com.atguigu.first.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class FirstApplicationTests {

    @Autowired
    UserMapper userMapper;
    @Test
    void contextLoads() {
        String a = "1";
        System.out.println(a);
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }

}
