<%-- 
    Document   : challenge7-1
    Created on : 2018/01/28, 21:13:34
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
        <h1>連想配列の作成</h1>
        <%@ page import="java.util.HashMap" %>
        <%
            HashMap<String,String>prof =
                    new HashMap<String,String>();
            prof.put("1","AAA");
            prof.put("hello", "value");
            prof.put("soeda","33");
            prof.put("20","20");
            
            out.println(prof.size());
            out.print(prof.get("1"));
            
            
            %>
    </body>
</html>
