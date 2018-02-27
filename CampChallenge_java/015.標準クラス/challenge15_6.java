/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuta
 * 変数を宣言し，自分のメールアドレス（架空のものでも構いません）をその値としてください。
 * その後，String クラスのメソッドを利用して，メールアドレスの「@」以降の文字数を画面に表示してください。

 */
public class challenge15_6 {
    public static void main(String[] args){
        String mail = "y.solanin@gmail.com";
        int num = mail.indexOf("@");
        System.out.print(mail.substring(0,num));
        
    }
}
