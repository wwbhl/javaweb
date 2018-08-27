<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>网上书城注册页面</title>
  </head>
  <body>
  <form action="${pageContext.request.contextPath}/RegisterServlet" method="post">
  <table border="1">

    用户注册<br>
     <tr>
        <td>用户名：</td>
        <td>
          <input type="text" name="username" placeholder="输入用户名" value="${uf.username}">
          <font color="red">${uf.err['username']}</font>
        </td>
    </tr>
    <tr>
        <td>密码：</td>
        <td>
          <input type="password" name="password" placeholder="输入密码" value="${uf.password}">
        <font color="red">${uf.err['password'] }</font>
        </td>
    </tr>
    <tr>
        <td>确认密码</td>
        <td>
          <input type="password" name="repassword" placeholder="确认密码" value="${ur.repassword}">
          <font color="red">${uf.err['repassowrd']}</font>
        </td>
    </tr>
    <tr>
         <td>邮箱：</td>
         <td>
           <input type="text" name="email" placeholder="邮箱，格式 xxx@xx.xxx" value="${uf.email}">
           <font color="red">${uf.err['email']}</font>
         </td>
    </tr>
    <tr>
      <td>生日：</td>
      <td>
        <input type="text" name="birthday" placeholder="生日，格式 xxxx-xx-xx" value="${uf.birthday}">
        <font color="red">${uf.err['birthday']}</font>
      </td>
    </tr>
    <tr>
      <td colspan="2" style="text-align: center">
      <input type="submit" value="注册">
      </td>
    </tr>
  </table>
  </form>
  </body>
</html>