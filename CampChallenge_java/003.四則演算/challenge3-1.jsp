<%-- 
    Document   : challenge3-1
    Created on : 2018/01/27, 9:25:35
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

        final int num1 = 110;
        final int num2 =109;
        int num3 =1;
        int num4 = num1+num3;
        out.print("これは最初の計算です<br>");
        out.print(num4);
        
        num4++;
        out.print("<br>num5の計算がここから始まります<br>");
        int num5 =0;
        out.print(num5);
        
        out.print(num5++);
        
        out.print(++num5);
        out.print(num5);
        out.print("<br>num5の計算がここで終了します<br>");
        int num6 =num1*num2;
        out.print(num1+num2+num3*num4/num6+num5);
        
        

       %>
        
       <% 
           final int base = 100;
           int num7=200;
           int num8=base*num7;
           out.print(++num8);
           
           %>
           
           
    </body>
</html>
