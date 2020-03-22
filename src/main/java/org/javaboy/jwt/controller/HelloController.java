package org.javaboy.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author daniel
 * @version 1.0.0
 * @date 2020/3/22 18:10
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello jwt";
    }

    @GetMapping("/admin")
    public String admin(){
        return "hello admin";
    }
}
