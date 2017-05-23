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
    <title>Messages</title>
    <link href="${pageContext.request.contextPath}/static/css/table.css" rel="stylesheet" type="text/css"/>
  </head>
  <body>

  <table>
    <tr><th>Message</th><th>Date&Time(UTC)</th></tr>
    <c:forEach var="row" items="${messages}">
    <tr>
      <td><c:out value="${row.message}"></c:out></td>
      <td><c:out value="${row.date}"></c:out></td>
    </tr>
    </c:forEach>
  </table>

  </body>
</html>
