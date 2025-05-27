<%-- 
    Document   : welcome
    Created on : May 23, 2025, 10:12:21 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.UserDTO"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            UserDTO usertest=(UserDTO)request.getAttribute("user");
            %>
            <h1>Welcome <%= usertest.getFullname() %></h1>
    </body>
</html>
