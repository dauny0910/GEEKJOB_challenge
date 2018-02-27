/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
/**
 *
 * @author yuta
 * 2015年1月1日 0時0分0秒と2015年12月31日 23時59分59秒の差（ミリ秒）を表示してください。
 */
public class challenge15_4 {
    public static void main(String[] args){
        Calendar gantan = Calendar.getInstance();
        Calendar saimatu = Calendar.getInstance();
    
        gantan.set(2015,0,1,0,0,0);
        saimatu.set(2015,11,31,23,59,59);
        
        Date gantanD = gantan.getTime();
        Date saimatuD = saimatu.getTime();
        System.out.println(gantanD.getTime());
        System.out.println(saimatuD.getTime());
        
        long sabun = saimatuD.getTime() - gantanD.getTime() ;
        System.out.println(sabun);
    }
    
}
