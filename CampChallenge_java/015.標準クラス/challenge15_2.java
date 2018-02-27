import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuta
 * 
 * 現在の日時を「1988年5月21日 1時23分45秒」といった形式で表現してください。
 */
public class challenge15_2 {
     public static void main(String[] args){
         
        Date now = new Date();
        SimpleDateFormat days = new SimpleDateFormat("yyyy年MM月dd日　HH時mm分ss秒");
        
        String todayD = days.format(now);
        System.out.print(todayD);
        
        
        
//        Calendar today = Calendar.getInstance();
//        today.setTime(d);
//        
//        System.out.print(today.getTime());
//        
//        Date date = new Date();
//        Calendar cal = Calendar.getInstance();
//        cal.setTime(date);
//         
     }    
}
     
