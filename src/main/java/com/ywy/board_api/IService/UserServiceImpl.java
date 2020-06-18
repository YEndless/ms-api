package com.ywy.board_api.IService;

import com.ywy.board_api.Service.UserService;
import com.ywy.board_api.dao.UserRepository;
import com.ywy.board_api.entity.User;
import com.ywy.board_api.util.ResponseUtil;
import com.ywy.board_api.vo.LoginUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserRepository userRepository ;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User save(User user) {
        return userRepository.save(user) ;
    }

    @Override
    public User get(int id) {
        return userRepository.findById(id).get();
    }

    @Override
    public void delete(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public void deleteByUId(int userId) {

    }

    @Override
    public List<User> getUser(int userId) {
        return null;
    }

    @Override
    public void search(int id) {

    }

    @Override
    public ResponseUtil userLogin(LoginUser loginUser) {
        User user = userRepository.findUserByAccount(loginUser.getAccount());
        //有效
        if (user != null) {
            //判断密码是否正确
            if (loginUser.getPass().equals(user.getPassword())) {
                return new ResponseUtil(1, "登陆成功", user);
            } else {
                return new ResponseUtil(0, "密码错误");
            }
        } else {
            return new ResponseUtil(0, "账号错误");
        }
    }

}
