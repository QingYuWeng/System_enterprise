package com.example.yuwenqing.system_enterprise;

/**
 * Created by yuwenqing on 2017/10/11.
 */

public class Message {
    private int userIcon;
    private String name;
    private String message;
    private String date;

    public Message(int userIcon,String name,String message,String date) {
        this.userIcon=userIcon;
        this.name=name;
        this.message=message;
        this.date=date;
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
