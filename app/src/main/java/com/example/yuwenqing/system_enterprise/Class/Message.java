package com.example.yuwenqing.system_enterprise.Class;

import java.io.Serializable;

/**
 * Created by yuwenqing on 2017/10/11.
 */

public class Message implements Serializable{
    private int userIcon;
    private String name;
    private String message;
    private String date;
    private int type;

    public static final int TYPE_RECEIVED=0;
    public static final int TYPE_SEND=1;


    public Message(int userIcon,String name,String message,String date,int type) {
        this.userIcon=userIcon;
        this.name=name;
        this.message=message;
        this.date=date;
        this.type=type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserIcon(int userIcon) {
        this.userIcon = userIcon;
    }

    public int getUserIcon() {
        return userIcon;
    }

    public String getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }

    public String getName() {
        return name;
    }
}
