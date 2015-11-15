package com.techyahmed.chatapp.pojo;

/**
 * Created by engrmahmed14@gmail.com on 11/15/15.
 */
public class User {



    private int _userid;
    private String name ;
    private String number ;
    private String status;

    public int get_userid() {
        return _userid;
    }

    public void set_userid(int _userid) {
        this._userid = _userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
