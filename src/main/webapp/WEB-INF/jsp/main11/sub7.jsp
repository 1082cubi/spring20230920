<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-25
  Time: 오후 2:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--/main/sub7?show=true --%>
<%--table 형식의 데이터 출력--%>

<%--/main11/sub7--%>
<%--파라미터를 입력해주세요.--%>
<c:if test="${empty people}">

    <h1>데이터가 없습니다.</h1>

</c:if>

<c:if test="${not empty people}">

    <table>
    <tr>
    <th>ID</th>
    <th>FIRST NAME</th>
    <th>LAST NAME</th>
    <th>CLASS</th>
    <th>PHONE</th>
    </tr>
    <c:forEach items="${people}" var="item">
        <tr>
            <td>${item.id}</td>
            <td>${item.firstName}</td>
            <td>${item.lastName}</td>
            <td>${item.className}</td>
            <td>${item.phoneNumber}</td>
        </tr>
    </c:forEach>
    </table>
</c:if>
</body>
</html>
