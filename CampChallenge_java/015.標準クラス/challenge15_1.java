/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//課題「2016年1月1日 0時0分0秒」の情報を持つタイムスタンプ（ミリ秒）を生成し，画面に表示してください。
import java.util.Date;



/**
 *
 * @author yuta
 */
public class challenge15_1 {
    public static void main(String[] args){
        Date pastD = new Date(46*365*24*60*60*1000);
        System.out.print(pastD.getTime());
    
    }
}
