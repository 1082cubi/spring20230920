<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-25
  Time: 오전 11:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${param.dan >= 2  and (param.dan <= 9)}" var="okDan">
    <c:forEach begin="1" end="9" var="i">
        <p>${param.dan}x${i} = ${param.dan*i }</p>
    </c:forEach>
</c:if>
<c:if test="n${not okDan}">
    <h3>구구단의 수를 2~9 사이를 값으로 입력해주세요.</h3>
</c:if>
</body>
</html>
