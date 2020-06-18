package com.ywy.board_api.Service;

import com.ywy.board_api.entity.User;
import com.ywy.board_api.util.ResponseUtil;
import com.ywy.board_api.vo.LoginUser;

import java.util.List;

public interface UserService {
    List<User> findAll() ;

    User save(User user) ;

    User get(int id) ;

    void delete(int id) ;

    void deleteByUId(int userId) ;

    List<User> getUser(int userId) ;

    void search(int id) ;

    ResponseUtil userLogin(LoginUser loginUser);

}
