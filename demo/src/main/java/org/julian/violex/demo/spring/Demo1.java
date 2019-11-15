package org.julian.violex.demo.spring;

import org.julian.violex.demo.spring.pojo.User;
import org.springframework.context.annotation.Bean;

/**
 * Description:
 * Project: violex
 *
 * @author : Julian
 * Create Time:2019/11/15 14:06
 */
//@Component
//    @Configuration
public class Demo1 {

    @Bean
    public User user1() {
        return new User(0, "julian", "2297185615@qq.com");

    }

    @Bean
    public User user2() {
        return new User();
    }
}
