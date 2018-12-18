<%--
  Created by IntelliJ IDEA.
  User: wangzhen
  Date: 2018/12/18
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>查询商品列表</title>
</head>
<body>
<form action="/test.action" method="post" >
    <table width="100%" border="1" >
        <tr><input type="submit" value="查询"/></tr>
    </table>
</form>
<table>
    <tr>
        <td>商品名称</td>
        <td>商品价格</td>
        <td>商品描述</td>
    </tr>
    <c:forEach items="${itemsList }" var="item" >
        <tr>
            <td>${item.name }</td>
            <td>${item.prize }</td>
            <td>${item.desc }</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
