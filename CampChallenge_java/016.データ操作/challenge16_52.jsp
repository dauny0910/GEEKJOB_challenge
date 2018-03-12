<%-- 
    Document   : challenge16_52
    Created on : 2018/03/09, 23:59:36
    Author     : yuta
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            ArrayList<Integer> primeList = new ArrayList();
            //任意の数までの素数をprimeListへ追加
            int x = 10;
            for (int u = 2; u <= x; u++) {
                for (int n = 2; n <= u; n++) {
                    int r = u % n;
                    if ((r == 0) && (u != n)) {
                        break;
                    }
                    if ((r == 0) && (u == n)) {
                        primeList.add(u);
                    }
                }
            }

            request.setCharacterEncoding("UTF-8");
            int s = Integer.parseInt(request.getParameter("textBox"));
            int sCheck = s;
            int count = 0;
            out.print("「" + s + "=");
            //入力された値に対して、primeListで割っていく
            for (int i = 0; i < primeList.size(); i++) {
                while (s % primeList.get(i) == 0) {

                    if (count != 0) {
                        out.print("*");
                    }
                    out.print(primeList.get(i));
                    s = s / primeList.get(i);
                    count++;

                }
                
                if(s < primeList.get(i)){
                break;
                }
                
                int num2 = 1;
                if ((i + 1) == primeList.size()) {
                    if (s == sCheck) {
                        //素数の時
                        out.print("あまり" + s);
                        //余りがあるとき
                    } else if(s != 0) {
                        out.print("あまり" + s);
                    }
                }
            }

            out.print("」");
        %>
    </body>
</html>
