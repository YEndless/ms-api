package com.ywy.board_api.controller;

import com.ywy.board_api.Service.UserService;
import com.ywy.board_api.entity.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String getHello(){
        return "hello" ;
    }
    @GetMapping("/h")
    public String get(){
        return "ywyqqq api" ;
    }
}
