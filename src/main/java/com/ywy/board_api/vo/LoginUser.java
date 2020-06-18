package com.ywy.board_api.vo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginUser {
    private String account ;
    private String pass ;

    public LoginUser(String account ,String pass ){
        this.account = account ;
        this.pass = pass ;
    }

    public LoginUser( ){
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
