<%-- 
    Document   : challenge5-2
    Created on : 2018/01/27, 15:04:51
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
        <h1>switch文1</h1>
        <%
            int num1 = 1;
            num1++;
            int num3 = 21;
            int num4 = num3%7;
            int num5 = num1-num4+num3;
            
            switch(num5){
                case 1 :
                    out.print("one");
                    break;
                case 2 :
                    out.print("two");
                    break;
                default :
                    out.print("想定外");
                    break;
            }
            
            %>        
                    
                                
                        
            
            
                    
                    
                   
    </body>
</html>
