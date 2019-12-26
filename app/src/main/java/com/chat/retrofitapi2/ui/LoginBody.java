package com.chat.retrofitapi2.ui;


//{
//        "context":"mobile",
//        "pwd":"1234567",
//        "username":"kim"
//        }
public class LoginBody {

    private String context;
    private String pwd;
    private String username;

    public LoginBody(String context, String pwd, String username) {
        this.context = context;
        this.pwd = pwd;
        this.username = username;
    }
}
