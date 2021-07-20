<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>用户详情</title>
    <meta name="author" content="pan_junbiao的博客">
</head>
<body>
<h2>用户详情</h2>
<ul>
    <li>用户名称：<s:property value="userName"/></li>
    <li>博客地址：<s:property value="blogUrl"/></li>
    <li>性别：<s:if test="sex==1">男</s:if><s:else>女</s:else></li>
    <li>省份：<s:property value="provinceName"/></li>
    <li>爱好：<s:property value="hobbyStr"/></li>
    <li>描述：<s:property value="remark"/></li>
</ul>
</body>
</html>