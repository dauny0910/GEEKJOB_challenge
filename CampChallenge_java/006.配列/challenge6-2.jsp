<%-- 
    Document   : challenge6-1
    Created on : 2018/01/28, 18:04:38
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
        <h1>配列の作成</h1>
        <%@ page import="java.util.ArrayList" %>
        <%
            ArrayList<String> data1 = new ArrayList<String>();
            
            data1.add("10");
            data1.add("100");
            data1.add("soeda");
            data1.add("hayashi");
            data1.add("-20");
            data1.add("118");
            data1.add("END");
           
            data1.set(2,"33");
            
            // out.println(data1.size());
            out.print(data1.get(2));
            
            
            
            
            %>

            
            
            
           

           
    </body>
</html>
