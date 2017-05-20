<%--
  Created by IntelliJ IDEA.
  User: papillon
  Date: 4/2/2017
  Time: 10:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>Index</title>
  </head>
  <body>

  <c:forEach var="row" items="${messages}">
    <c:out value="${row}"></c:out><br>
  </c:forEach>

  </body>
</html>
