<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-10-11
  Time: 오전 11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3>직원 정보 변경</h3>
<form action="/main25/sub7">
    변경할 직원 번호
    <input type="number" name="id">
    <button>조회</button>
</form>
<hr>
<form action="/main25/sub7" method="post">
    <div>
        직원번호
        <input type="number" name="id" value="${employees.employeeId}" readonly>
    </div>
    <div>
        Last Name
        <input type="text" name="lastName" value="${employees.lastName}">
    </div>
    <div>
        First Name
        <input type="text" name="firstName" value="${employees.firstName}">
    </div>
    <div>
        Birth Date
        <input type="date" name="birthDate" value="${employees.birthDate}">

    </div>
    <div>
        Photo
        <input type="text" name="photo" value="${employees.photo}">
    </div>
    <div>
        Notes
        <textarea name="notes" id="" cols="30" rows="10">${employees.notes}</textarea>
    </div>
    <div>
        <button>수정</button>
    </div>
</form>

</body>
</html>
