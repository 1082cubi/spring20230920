<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-10-06
  Time: 오후 3:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
    <style>
        .active {
            background-color:darkblue;
            color : #eeeeee;
        }
    </style>
</head>
<body>

<h4>고객 목록</h4>
<table>
    <tr>
        <th>ID</th>
        <th>NAME</th>
    </tr>

    <c:forEach items="${customerList}" var="customer">
        <tr>
            <td>${customer.id}</td>
            <td>${customer.name}</td>
        </tr>
    </c:forEach>
</table>
<div>
    <a href="/mein22/sub3?p=${prevPageNumber}">이전</a>
    <c:forEach begin="${leftPageNumber}" end="${lastPageNumber}" var="pageNumber">

        <a
                <c:if test="${pageNumber == currentpage}">
                      class="active"
                </c:if>
                    href="/main22/sub3?p=${pageNumber}">${pageNumber}</a> |

    </c:forEach>
    <a href="/main22/sub3?p=${nextPageNumber}">다음</a>

</div>


</body>
</html>
