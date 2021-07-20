<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>用户注册</title>
    <meta name="author" content="pan_junbiao的博客">
    <style>
        .txtBox{
            padding: 3px;
            width: 300px;
            font-size: 16px;
        }
    </style>
</head>
<body>
<h2>用户注册</h2>
<s:form action="userAction!addUser" method="POST">
    <s:textfield name="userName" label="用户名称" cssClass="txtBox" required="true" requiredPosition="left" value="pan_junbiao的博客"></s:textfield>
    <s:textfield name="blogUrl" label="博客地址" cssClass="txtBox" required="true" requiredPosition="left" value="https://blog.csdn.net/pan_junbiao"></s:textfield>
    <s:radio name="sex" list="#{1:'男',2:'女'}" label="性别" required="true" requiredPosition="left"></s:radio>
    <s:select name="provinceName" list="{'','广东省','广西省','山东省','河南省' }" label="省份" required="true" requiredPosition="left"></s:select>
    <s:checkboxlist name="hobbyArray" list="{'篮球','足球','羽毛球','乒乓球','游泳'}" label="兴趣爱好"></s:checkboxlist>
    <s:textarea name="remark" cols="40" rows="5" cssStyle="font-size: 16px" label="备注"></s:textarea>
    <s:submit value="注册"></s:submit>
    <s:reset value="重置"></s:reset>
</s:form>
</body>
</html>