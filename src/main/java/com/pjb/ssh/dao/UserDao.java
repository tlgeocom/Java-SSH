package com.pjb.ssh.dao;

import com.pjb.ssh.entity.User;
import java.util.List;

/**
 * 用户信息数据库访问接口
 * @author pan_junbiao
 **/
public interface UserDao
{
    /**
     * 新增用户信息
     * @param user 用户对象
     */
    public boolean save(User user);

    /**
     * 删除用户信息
     * @param user 用户对象
     */
    public boolean delete(User user);

    /**
     * 修改用户信息
     * @param user 用户对象
     */
    public boolean update(User user);

    /**
     * 获取用户信息
     * @param id 用户ID
     */
    public User get(int id);

    /**
     * 查询方法
     * @param hql HQL语句
     */
    public List find(String hql);
}