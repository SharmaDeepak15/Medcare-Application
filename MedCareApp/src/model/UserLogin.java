/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author deepaksharma
 */
public class UserLogin {

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public void setUser_active_flag(String user_active_flag) {
        this.user_active_flag = user_active_flag;
    }
    
    private String user_name;
    private String user_password;
    private String user_active_flag;

    public String getUser_name() {
        return user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public String getUser_active_flag() {
        return user_active_flag;
    }
    
}
