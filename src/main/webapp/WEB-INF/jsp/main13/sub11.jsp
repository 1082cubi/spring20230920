<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-26
  Time: 오후 2:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>textarea</h1>
<form action="/main13/sub12">
    <div>
        <lebel for="input1">이름</lebel>
        <input type="text" id="input1" name="name">
    </div>
    <div>
        <lebel for="input2">주소</lebel>
        <input type="text" id="input2" name="address">
    </div>
    <div>
        <label for="textarea1">자기소개</label>
        <textarea name="description" id="textarea1" cols="30" rows="10"></textarea>
    </div>
</form>
</body>
</html>
