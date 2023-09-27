<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-27
  Time: 오전 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>여전히 유지</h1>
<ul>
    <c:forEach items="${food}" var="item">
        <li>${item}</li>
    </c:forEach>
</ul>
    <a href="/main15/sub7">다시 선택하기</a>
</body>
</html>
