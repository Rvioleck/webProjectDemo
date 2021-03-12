<%--
  Created by IntelliJ IDEA.
  User: Rvioleck
  Date: 2021/3/12
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ page import="com.iiikkk.readMySQL.StudentInfo" %>
<%@ page import="com.iiikkk.readMySQL.ReadStudent" %>
<%@ page import="java.util.List" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<html>
<head>
    <title>查询student表</title>
</head>
<body>
<style>
    body, table {
        text-align: center;
    }

    table {
        margin: auto;
    }
</style>
<table border="1">
    <tr>
        <td width="100">id</td>
        <td width="100">name</td>
    </tr>
    <%
        ReadStudent rs = new ReadStudent();
        List<StudentInfo> list = rs.readFirst();
        for (StudentInfo oneInfo : list)
        {%>
    <tr>
        <td width="100"><%=oneInfo.getId()%>
        </td>
        <td width="100"><%=oneInfo.getName()%>
        </td>
    </tr>
        <%}
    %>
</table>
</body>
</html>
