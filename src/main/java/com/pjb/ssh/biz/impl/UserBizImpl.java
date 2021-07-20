package com.pjb.ssh.biz.impl;

import com.pjb.ssh.dao.UserDao;
import com.pjb.ssh.biz.UserBiz;
import com.pjb.ssh.entity.User;
import java.util.List;

/**
 * 用户信息业务逻辑类
 * @author pan_junbiao
 **/
public class UserBizImpl implements UserBiz
{
    private UserDao userDao = null; //用户信息数据库访问类

    public UserDao getUserDao()
    {
        return userDao;
    }

    public void setUserDao(UserDao userDao)
    {
        this.userDao = userDao;
    }

    /**
     * 新增用户信息
     * @param user 用户对象
     */
    @Override
    public boolean saveUser(User user)
    {
        boolean result = false;

        //参数验证
        if(user==null)
        {
            return false;
        }

        //新增用户信息
        result = userDao.save(user);
        return result;
    }

    /**
     * 删除用户信息
     * @param userId 用户ID
     */
    @Override
    public boolean deleteUser(int userId)
    {
        boolean result = false;
        if (userId <= 0)
        {
            return false;
        }
        //获取用户对象
        User user = userDao.get(userId);
        if (user == null)
        {
            return false;
        }
        //删除用户对象
        result = userDao.delete(user);
        return result;
    }

    /**
     * 修改用户信息
     * @param user 用户对象
     */
    @Override
    public boolean updateUser(User user)
    {
        return userDao.update(user);
    }

    /**
     * 获取用户信息
     * @param userId 用户ID
     */
    @Override
    public User getUser(int userId)
    {
        return userDao.get(userId);
    }

    /**
     * 查询用户列表
     */
    @Override
    public List<User> serchUserList()
    {
        String hql = "FROM User user";
        return userDao.find(hql);
    }
}