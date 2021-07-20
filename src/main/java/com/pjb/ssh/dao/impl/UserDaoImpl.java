package com.pjb.ssh.dao.impl;

import com.pjb.ssh.dao.UserDao;
import com.pjb.ssh.entity.User;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import java.util.List;

/**
 * 用户信息数据库访问类
 * @author pan_junbiao
 **/
public class UserDaoImpl extends HibernateDaoSupport implements UserDao
{
    /**
     * 新增用户信息
     * @param user 用户对象
     */
    @Override
    public boolean save(User user)
    {
        boolean result = false;
        try
        {
            super.getHibernateTemplate().save(user);
            result = true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            result = false;
        }
        return result;
    }

    /**
     * 删除用户信息
     * @param user 用户对象
     */
    @Override
    public boolean delete(User user)
    {
        boolean result = false;
        try
        {
            super.getHibernateTemplate().delete(user);
            result = true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            result = false;
        }
        return result;
    }

    /**
     * 修改用户信息
     * @param user 用户对象
     */
    @Override
    public boolean update(User user)
    {
        boolean result = false;
        try
        {
            super.getHibernateTemplate().update(user);
            result = true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            result = false;
        }
        return result;
    }

    /**
     * 获取用户信息
     * @param id 用户ID
     */
    @Override
    public User get(int id)
    {
        User result = null;
        try
        {
            if (id <= 0)
            {
                return null;
            }

            result = super.getHibernateTemplate().get(User.class, id);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            result = null;
        }
        return result;
    }

    /**
     * 查询方法
     * @param hql HQL语句
     */
    @Override
    public List find(String hql)
    {
        return super.getHibernateTemplate().find(hql);
    }
}