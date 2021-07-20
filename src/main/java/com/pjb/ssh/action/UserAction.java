package com.pjb.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.pjb.ssh.biz.UserBiz;
import com.pjb.ssh.entity.User;
import com.pjb.ssh.model.UserModel;
import com.pjb.ssh.util.UtilHelper;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 用户Action类
 * @author pan_junbiao
 **/
public class UserAction extends ActionSupport implements ModelDriven<UserModel>, ServletRequestAware, ServletResponseAware
{
    private static final long serialVersionUID = 1L;
    private HttpServletRequest request; //Request对象
    private HttpServletResponse response; //Response对象
    UserBiz userBiz = null; //用户信息业务逻辑类
    UserModel userModel = null; //用户信息模型类

    public UserAction()
    {
        userModel = new UserModel();
    }

    // 获取Request对象
    @Override
    public void setServletRequest(HttpServletRequest var1)
    {
        this.request = var1;
    }

    // 获取Response对象
    @Override
    public void setServletResponse(HttpServletResponse arg0)
    {
        this.response = arg0;
    }

    @Override
    public UserModel getModel()
    {
        return userModel;
    }

    public UserBiz getUserBiz()
    {
        return userBiz;
    }

    public void setUserBiz(UserBiz userBiz)
    {
        this.userBiz = userBiz;
    }

    public UserModel getUserModel()
    {
        return userModel;
    }

    public void setUserModel(UserModel userModel)
    {
        this.userModel = userModel;
    }

    /**
     * 用户注册页面
     */
    public String userRegisterView()
    {
        return INPUT;
    }

    /**
     * 执行新增用户操作
     */
    public String addUser()
    {
        String resultView = ERROR;

        //参数验证
        if (userModel.getUserName() == null || userModel.getUserName().equals(""))
        {
            return ERROR;
        }

        //将Model对象转换为实体对象
        User user = new User();
        user.setUserName(userModel.getUserName());
        user.setBlogUrl(userModel.getBlogUrl());
        user.setSex(userModel.getSex());
        user.setProvinceName(userModel.getProvinceName());
        user.setHobby(UtilHelper.arrToStr(userModel.getHobbyArray(), ";"));
        user.setRemark(userModel.getRemark());

        //调用业务逻辑层方法，执行新增操作
        boolean resultExecute = userBiz.saveUser(user);

        //返回结果页面
        resultView = resultExecute ? SUCCESS : ERROR;
        return resultView;
    }

    /**
     * 获取用户信息
     */
    public String userDetailView()
    {
        //获取用户ID参数
        int userId = Integer.parseInt(request.getParameter("userId"));

        //获取用户信息
        User user = userBiz.getUser(userId);
        if(user==null)
        {
            return ERROR;
        }

        //用户实体对象转换为Model对象
        userModel.setId(user.getId());
        userModel.setUserName(user.getUserName());
        userModel.setBlogUrl(user.getBlogUrl());
        userModel.setSex(user.getSex());
        userModel.setProvinceName(user.getProvinceName());
        userModel.setHobbyStr(user.getHobby());
        userModel.setRemark(user.getRemark());

        return "detail";
    }
}