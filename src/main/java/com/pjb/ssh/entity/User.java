package com.pjb.ssh.entity;

/**
 * 用户信息持久化类
 * @author pan_junbiao
 **/
public class User
{
    private int id;        //用户编号
    private String userName;   //用户姓名
    private String blogUrl;   //博客地址
    private int sex; //性别（1：男；2：女；）
    private String provinceName; //省份
    private String hobby; //兴趣爱好
    private String remark; //备注

    //默认的构造方法
    public User() {
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getBlogUrl()
    {
        return blogUrl;
    }

    public void setBlogUrl(String blogUrl)
    {
        this.blogUrl = blogUrl;
    }

    public int getSex()
    {
        return sex;
    }

    public void setSex(int sex)
    {
        this.sex = sex;
    }

    public String getProvinceName()
    {
        return provinceName;
    }

    public void setProvinceName(String provinceName)
    {
        this.provinceName = provinceName;
    }

    public String getHobby()
    {
        return hobby;
    }

    public void setHobby(String hobby)
    {
        this.hobby = hobby;
    }

    public String getRemark()
    {
        return remark;
    }

    public void setRemark(String remark)
    {
        this.remark = remark;
    }
}