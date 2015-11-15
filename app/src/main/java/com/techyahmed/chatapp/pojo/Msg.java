package com.techyahmed.chatapp.pojo;

/**
 * Created by engrmahmed14@gmail.com on 11/15/15.
 */
public class Msg {

    private int _id;
    private String sender;
    private String msg;

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
