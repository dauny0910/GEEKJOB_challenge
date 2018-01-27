<%-- 
    Document   : challenge4-1
    Created on : 2018/01/27, 10:58:03
    Author     : yuta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
        String Lname = "groove";
        String cons = "-";
        String Fname = "gear";
        
        out.println(Lname+cons+Fname);
        out.print(Lname);
        out.print(cons);
        out.print(Fname);
        %>
    </body>
</html>
