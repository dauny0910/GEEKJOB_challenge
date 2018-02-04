<%-- 
    Document   : challenge9-1
    Created on : 2018/02/05, 0:34:28
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
        <h1>while文</h1>
        <%
            int num=1000;
            int count=0;
            
            while(num>100){
                num=num/2;
                count++;
                
            }
            out.println(num);
            out.println(count);
            %>
                    
    </body>
</html>
