<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-10-10
  Time: 오후 3:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>공급자명</h3>
<form action="/main24/sub2">
    <div>
        공급자명
        <input type="text" name="supplierName">
    </div>
    <div>
        계약명
        <input type="text" name="contactName">
    </div>
    <div>
        주소
        <input type="text" name="address">
    </div>
    <div>
        도시
        <input type="text" name="City">
    <div>
        우편번호
        <input type="text" name="PostalCode">
    </div>
    </div>
    <div>
        국가
        <input type="text" name="Country">
    </div>
    <div>
        전화번호
        <input type="text" name="Phone">
    </div>
    <div>
        <input type="submit" value="등록">
    </div>
</form>
</body>
</html>
