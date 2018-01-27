<%-- 
    Document   : challenge5-3
    Created on : 2018/01/27, 15:19:17
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
        <h1>switch文2</h1>
        <%
            char type1 = 'あ';
            char type2 ='A';
            
            switch(type1){
                case 'あ' :
                    out.print("日本語");
                    break;
                case 'a' :
                    out.print("英語");
                    break;
                default :
                    break;
                    

            }

            %>        
    </body>
</html>
