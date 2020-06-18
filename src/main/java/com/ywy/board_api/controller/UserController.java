package com.ywy.board_api.controller;


import com.ywy.board_api.Service.ArticleService;
import com.ywy.board_api.Service.UserService;
import com.ywy.board_api.entity.User;
import com.ywy.board_api.util.ResponseUtil;
import com.ywy.board_api.vo.LoginUser;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
@CrossOrigin(origins = "*")
public class UserController {
    @Resource
    private UserService userService ;

    @GetMapping("/all")
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable int id){
        return userService.get(id) ;
    }

    @RequestMapping("/save")
    public User save(User user){
        return userService.save(user) ;
    }

    @RequestMapping (value = "/delete",method = RequestMethod.DELETE)
    public void delete(@RequestParam Integer id){
        userService.delete(id);
    }

    @GetMapping("/deleteByUId")
    public void deleteByUserId(int userId){
        userService.deleteByUId(userId);
    }


    @RequestMapping(value = "/search/{id}",method = RequestMethod.GET)
    public void search(@PathVariable int id){
        userService.search(id);
    }

    @RequestMapping(value = "/sign_in", method = RequestMethod.POST)
    public ResponseUtil signIn(@RequestBody LoginUser loginUser) {
        System.out.println(loginUser);
        System.out.println("1111");

        return userService.userLogin(loginUser);
    }
}
