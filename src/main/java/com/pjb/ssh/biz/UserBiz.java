package com.pjb.ssh.biz;

import com.pjb.ssh.entity.User;
import java.util.List;

/**
 * 用户信息业务逻辑接口
 * @author pan_junbiao
 **/
public interface UserBiz
{
    /**
     * 新增用户信息
     * @param user 用户对象
     */
    public boolean saveUser(User user);

    /**
     * 删除用户信息
     * @param userId 用户ID
     */
    public boolean deleteUser(int userId);

    /**
     * 修改用户信息
     * @param user 用户对象
     */
    public boolean updateUser(User user);

    /**
     * 获取用户信息
     * @param userId 用户ID
     */
    public User getUser(int userId);

    /**
     * 查询用户列表
     */
    public List<User> serchUserList();
}