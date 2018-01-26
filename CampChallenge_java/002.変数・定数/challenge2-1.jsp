<%-- 
    Document   : challenge1-2
    Created on : 2018/01/26, 22:36:06
    Author     : yuta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <title></title>
    </head>
    <body>
        <%
        String name ="Yuta watanabe";
        String nickname ="dauny";
        nickname +="があだ名です<br>";
        name +="（=渡辺悠太）<br>";
        
        String text ="1/22からGEEK CAMPに参加しました。よろしくお願いします";
        
        out.print(name);
        out.print(nickname);
        out.print(text);
             
        %>
    </body>
</html>
