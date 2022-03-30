package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author shenkaiwen5
 * @version 1.0
 * @date 2022-03-30
 */
@RestController
public class FirstController {

    @Resource
    private FirstReposity reposity;


    @RequestMapping("/first")
    public Object first() {
        return reposity.findAll();
    }

    @RequestMapping("/add")
    public Object add() {
        First newFirst = new First();
        newFirst.setName("ddd");

        return reposity.save(newFirst);
    }
}
