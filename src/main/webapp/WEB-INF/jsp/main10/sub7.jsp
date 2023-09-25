<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2023-09-25
  Time: 오전 9:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>el에서 사용할 수 있는 연산자</h3>
<h4>산술 연산자</h4>
<h4>+,-,*,/,%</h4>
<hr>
<h5>+</h5>
<p> a: 3 b :5 c : 8 d : 9</p>
<p>${a} + ${b} = ${a+b}</p>
<p>${c} + ${d} = ${c+d}</p>

<h5>-</h5>
<p>${a} - ${b} = ${a - b}</p>
<p>${c} - ${d} = ${c - d}</p>
<h5>* :곱하기</h5>
<p>${a} - ${b} = ${a * b}</p>
<h5>/ : 나누기</h5>
<p>${a} - ${b} = ${a / b}</p>
<p>${c} - ${d} = ${c / d}</p>
<p>${a} - ${b} = ${a div b}</p>
<p>${c} - ${d} = ${c div d}</p>

<h5>% : 나머지 연산(modulo,reaminder)</h5>
<p>${b} % ${a} = ${b%a}/p>
<p>${c} % ${a} = ${c%a}/p>
<p>${d} % ${a} = ${d%a}/p>
<p>${b} % ${a} = ${b mod a}/p>
<p>${c} % ${a} = ${c mod a}/p>
<p>${d} % ${a} = ${d mod a}/p>

<h5>()< : 우선순위 높음</h5>
<p>${a * b - c}</p>
<p>${a * (b - c)}</p>
<p>${(a * b) - c}</p>

<hr>
<c:forEach begin="2" end="9" var="i">
        <c:forEach begin="1" end="9" var="j">
        <p>${i} X ${j} = ${j*i}</p>
        </c:forEach>
    </p>

</c:forEach>

<hr>
<c:forEach begin="0" end="7" var="i">
    <c:forEach begin="1" end="9" var="j">
        <p>${9-i} X ${j} = ${(9-i)*j}</p>

    </c:forEach>
    </p>

</c:forEach>


</body>
</html>
