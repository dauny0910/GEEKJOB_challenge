<%-- 
    Document   : challenge8-3
    Created on : 2018/02/04, 18:51:17
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
        <h1>for文3</h1>
        <%
            int symbol=0;
            for(int i=0;i<=100;i++){
                symbol=symbol+i;
                
            }
            out.print(symbol);
            
            %>
    </body>
</html>
