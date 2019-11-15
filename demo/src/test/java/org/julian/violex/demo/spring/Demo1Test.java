package org.julian.violex.demo.spring;

import lombok.extern.slf4j.Slf4j;
import org.julian.violex.demo.spring.pojo.User;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Slf4j
@Import(Demo1.class)
@SpringBootTest
@ExtendWith(SpringExtension.class)
class Demo1Test {
    @Autowired
    @Qualifier(value = "user1")
    User user;

    @org.junit.jupiter.api.Test
    void user1() {
        log.info(user.toString());
    }

    @org.junit.jupiter.api.Test
    void user2() {
    }
}