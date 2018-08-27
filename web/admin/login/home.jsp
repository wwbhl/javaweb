<%--
  Created by IntelliJ IDEA.
  User: baohailong
  Date: 2018/8/27
  Time: 4:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商城</title>
    <style>
        body
        {
            SCROLLBAR-ARROW-COLOR: #ffffff;
            SCROLLBAR-BASE-COLOR:#dee3f7;
        }
    </style>
</head>
<%--<body>--%>
<frameset row="103,*,43" frameborder=0 border="0" framespacing="0">
    <frame src="${pageContext.request.contextPath}/admin/login/top.jsp" name="topFrame" scrolling="NO" noresize>
    <frameset cols="159,*" frameborder="0" border="0" framespacing="0">
        <frame src="${pageContext.request.contextPath}/admin/login/left.jsp" name="leftFrame" noresize scrolling="YES">
        <frame src="${pageContext.request.contextPath}/admin/login/welcome.jsp" name="mainFrame">
    </frameset>
    <frame src="${pageContext.request.contextPath}/admin/login/bottom.jsp" name="bottomFrame" scrolling="NO" noresize>
</frameset>
<%--</body>--%>
</html>
