<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>网上书城注册页面</title>
  </head>
  <body>
  <form action="RegisterServlet" method="post">
  <table border="1">
    <tr></tr>
    用户注册<br>
    <td>用户名</td>
    <td><input type="text" name="username" placeholder="输入用户名" value="${uf.username}"></td>
    密&nbsp&nbsp&nbsp&nbsp码&nbsp&nbsp&nbsp&nbsp：<input type="password" name="password" placeholder="输入密码"><br>
    确认密码：<input type="password" name="repassword" placeholder="确认密码"><br>
    邮&nbsp&nbsp&nbsp&nbsp箱&nbsp&nbsp&nbsp&nbsp：<input type="text" name="repassword" placeholder="邮箱，格式 xxx@xx.xxx"><br>
    生&nbsp&nbsp&nbsp&nbsp日&nbsp&nbsp&nbsp&nbsp：<input type="text" name="repassword" placeholder="生日，格式 xxxx-xx-xx"><br>
    <input type="submit" value="注册">
  </table>
  </form>
  </body>
</html>