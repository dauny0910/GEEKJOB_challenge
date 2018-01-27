<%-- 
    Document   : challenge5-1
    Created on : 2018/01/27, 11:35:55
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
        <h1>変数の宣言と表示（if文）</h1>
        <%
        int num1 = 0;
        if(num1==1){
            out.print("１です！");
        }else if(num1==2) {
            out.print("プログラミングキャンプ！");
            
        }else{
            out.print("その他です！");
        }
        %>
        <%--
            int num2=2;
            int num3=3;
            int base = num3*num2;
            
                   
            if(num2+num1==3){
                out.print("パターン青");
            }else if(base>5){
                    out.print("使徒です！");
                    }
                    
            else{
                    out.print("瞬間、心、重ねて");
                    }
            --%>
    </body>
</html>
