<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-22
  Time: 오후 3:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
    <style>
        .box {
            border: 0px solid green;
            margin: 5px auto;
            width: 70%;
            height: 100px;
            text-align: center;
            display: flex;
            justify-content: space-evenly;

        }
        .box:first-child {
            font-size: 1.5rem;
            font-weight: bolder;
        }

        .box > div {
            border: 0px solid red;
            height: 100px;
            width: 18%;
        }
    </style>
</head>
<body>

<c:forEach items="${moving}" var="i">
    <div class="box">
        <div>${i.id}</div>
        <div>${i.firstName}</div>
        <div>${i.lastName}</div>
        <div>${i.className}</div>
        <div>${i.phoneNumber}</div>
    </div>
</c:forEach>

</body>
</html>
