<%-- 
■クエリストリング 
例）http://localhost:8080/_some_project_/_some_file_.jsp?total=1500&count=10&type=2 
・_some_project_ ... 自身のプロジェクト名に書き換えてください 
・_some_file_.jsp ... 自身で作成したファイル名等に書き換えてください（ JSP ではなくサーブレットによって処理を記述しても構いません） 
・total ... 購入した商品の総額を表す 
・count ... 購入した商品の数量を表す 
・type ... 商品種別を表す 
（type の数値は， 1 が「雑貨」，2 が「生鮮食品」， 3 が「その他」と対応します） 

■処理内容 
1. type の値を元に，商品種別の日本語情報を表示してください。 
2. 商品の単価を求め，画面に表示してください。 
3. 商品購入総額に応じてポイントを計算し，その値を画面に表示してください。なお，ポイントの計算は，商品購入総額を基準にして，以下の要領で行います。 
3000 円未満 ... 0% 
3000 円以上で5000円未満 ... 購入総額の 4% 
5000 円以上 ... 購入総額の 5%
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>受け取った情報を処理する</title>
    </head>
    <body>
        <%
            request.setCharacterEncoding("UTF-8");
            //out.print(request.getParameter("type") + "が、" + request.getParameter("count") + "です<br>");

            int i = Integer.parseInt(request.getParameter("type"));
            int ii = Integer.parseInt(request.getParameter("count"));
            String g = "";

            switch (i) {
                case 1:
                    i = 500;
                    g = "雑貨";
                    int num = i * ii;

                    if (num < 3000) {
                        out.print(g + "を" + ii + "点購入したので、合計" + num + "円です。");

                    } else if (num < 5000) {
                        double poi = num * 0.04;
                        out.print(g + "を" + ii + "点購入したので、合計" + num + "円です。ポイントが" + poi + "点つきます");
                    } else {
                        double poi = num * 0.05;
                        out.print(g + "を" + ii + "点購入したので、合計" + num + "円です。ポイントが" + poi + "点つきます");
                    }
                    break;

                case 2:
                    i = 700;
                    g = "生鮮食品";
                    num = i * ii;

                    if (num < 3000) {
                        out.print(g + "を" + ii + "点購入したので、合計" + num + "円です。");

                    } else if (num < 5000) {
                        double poi = num * 0.04;
                        out.print(g + "を" + ii + "点購入したので、合計" + num + "円です。ポイントが" + poi + "点つきます");
                    } else {
                        double poi = num * 0.05;
                        out.print(g + "を" + ii + "点購入したので、合計" + num + "円です。ポイントが" + poi + "点つきます");
                    }
                    break;

                case 3:
                    i = 1000;
                    g = "その他";
                    num = i * ii;

                    if (num < 3000) {
                        out.print(g + "を" + ii + "点購入したので、合計" + num + "円です。");

                    } else if (num < 5000) {
                        double poi = num * 0.04;
                        out.print(g + "を" + ii + "点購入したので、合計" + num + "円です。ポイントが" + poi + "点つきます");
                    } else {
                        double poi = num * 0.05;
                        out.print(g + "を" + ii + "点購入したので、合計" + num + "円です。ポイントが" + poi + "点つきます");
                    }
                    break;
            }


        %>
    </body>
</html>
