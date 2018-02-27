/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuta
 * 文字列型の変数を宣言して，"きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます" をその値としてください。 
宣言した変数について，「I」を「い」に，「U」を「う」に置換した文字列を表示してください。
 */
public class challenge15_7 {
    public static void main(String[] args){
        String words = "きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます";
        words = words.replace("I","い");
        words = words.replace("U", "う");
        System.out.print(words);
    }
    
}
