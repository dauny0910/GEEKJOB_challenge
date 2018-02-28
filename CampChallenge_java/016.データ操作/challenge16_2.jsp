<%-- 
    Document   : challenge16_1
    Created on : 2018/02/28, 17:45:01
    Author     : yuta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>処理の画面だお</title>
    </head>
    <body>
        <%
            request.setCharacterEncoding("UTF-8");
            out.print(request.getParameter("txtName"));
            out.print(request.getParameter("rdoButtn"));
            out.print(request.getParameter("hobText"));
            %>
    </body>
</html>
