<%-- 
    Document   : challenge8-1
    Created on : 2018/01/28, 22:33:10
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
        <h1>for文1</h1>
        <%
            long total=8;
            for (int i = 1; i < 20; i++){
              total=total*8;             
            } 
            
            out.println(total);
            %>
            
            
            
                
    </body>
</html>
