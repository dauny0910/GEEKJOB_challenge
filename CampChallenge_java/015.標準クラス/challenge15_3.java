/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

「2016年11月4日 10時0分0秒」の情報を持つタイムスタンプ（ミリ秒）を生成し，画面に表示してください。
その後，さらにこの情報を「2016-11-04 10:00:00」の形式で画面に表示してください。
 */
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;





/**
 *
 * @author yuta
 */
public class challenge15_3 {
    public static void main(String[] args){
        
        Calendar someday = Calendar.getInstance();
        SimpleDateFormat output = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
    
        someday.set(2016,10,4,10,0,0);
        Date past =someday.getTime();
        
        System.out.println(past.getTime());
        System.out.println(output.format(past));
    
    }
}
