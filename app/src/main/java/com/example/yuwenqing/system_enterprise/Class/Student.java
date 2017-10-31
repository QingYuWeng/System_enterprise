package com.example.yuwenqing.system_enterprise.Class;

/**
 * Created by yuwenqing on 2017/10/12.
 */

public class Student {
    private int stu_imageId;
    private String stu_name;
    private String stu_craeer;
    private String stu_from;
    private String Phone_num;
    private int age;
    private String Mail;

    public Student(int stu_imageId,String stu_name,String stu_craeer,String stu_from,String phone_num,String Mail) {
        this.stu_imageId=stu_imageId;
        this.stu_name=stu_name;
        this.stu_craeer=stu_craeer;
        this.stu_from=stu_from;
        this.Phone_num=phone_num;
        this.Mail=Mail;
    }

    public int getStu_imageId() {
        return stu_imageId;
    }

    public String getStu_craeer() {
        return stu_craeer;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_craeer(String stu_craeer) {
        this.stu_craeer = stu_craeer;
    }

    public void setStu_imageId(int stu_imageId) {
        this.stu_imageId = stu_imageId;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public void setStu_from(String stu_from) {
        this.stu_from = stu_from;
    }

    public String getStu_from() {
        return stu_from;
    }

    public String getPhone_num() {
        return Phone_num;
    }

    public void setPhone_num(String phone_num) {
        Phone_num = phone_num;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }
}
