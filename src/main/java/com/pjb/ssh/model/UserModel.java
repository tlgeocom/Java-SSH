package com.pjb.ssh.model;

/**
 * 用户信息模型类
 * @author pan_junbiao
 **/
public class UserModel
{
    private int id; //用户编号
    private String userName; //用户姓名
    private String blogUrl; //博客地址
    private int sex; //性别（1：男；2：女；）
    private String provinceName; //省份
    private String[] hobbyArray; //兴趣爱好（数组）
    private String hobbyStr; //兴趣爱好（字符串）
    private String remark; //备注

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

    public String[] getHobbyArray()
    {
        return hobbyArray;
    }

    public void setHobbyArray(String[] hobbyArray)
    {
        this.hobbyArray = hobbyArray;
    }

    public String getHobbyStr()
    {
        return hobbyStr;
    }

    public void setHobbyStr(String hobbyStr)
    {
        this.hobbyStr = hobbyStr;
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