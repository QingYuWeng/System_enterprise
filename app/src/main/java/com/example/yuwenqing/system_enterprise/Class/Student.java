package com.example.yuwenqing.system_enterprise.Class;

/**
 * Created by yuwenqing on 2017/10/12.
 */

public class Student {
    private int stu_imageId;
    private String stu_name;
    private String stu_craeer;

    public Student(int stu_imageId,String stu_name,String stu_craeer) {
        this.stu_imageId=stu_imageId;
        this.stu_name=stu_name;
        this.stu_craeer=stu_craeer;
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
}
