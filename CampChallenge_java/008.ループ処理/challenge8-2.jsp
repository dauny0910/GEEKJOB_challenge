<%-- 
    Document   : challenge8-3
    Created on : 2018/01/29, 13:05:21
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
        <h1>for文2</h1>
        <%
           String type1 ="A";
            for(int i=0;i<30;i++){
           type1=type1+"A";
                  
            }
            out.println(type1);
            out.print("Fack");

            
            %>
            
    </body>
</html>
