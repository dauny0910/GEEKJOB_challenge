/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random;
import java.util.Date;
import java.text.SimpleDateFormat;

        
/**
 *Java の標準クラスについて，これまでに扱っていないものを自身で調査し，その標準クラスを利用した処理を記述してください。 
その際，「ファイル操作編」の単元で学習した内容を利用して，以下の内容が記載されたログファイルを作成してください。 

1. 処理の内容（例：文字列の置換） 
2. 処理を開始する旨と，その時刻（例：2000-01-01 12:00 開始） 
3. 処理を終了する旨と，その時刻（例：2000-04-04 11:00 終了） 
※ なお，ログファイルとは，一定の記録（Log）が記述されたファイルの一般的な名称です（特定のファイル形式を指すものではありません）。
 * @author yuta
 */
public class challenge15_10 {
    public static void main(String[] args){
        try {
        Date d = new Date();
        SimpleDateFormat henkan = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            File Log = new File("LogD");
            FileWriter startTime = new FileWriter(Log);
            startTime.write("開始" + henkan.format(d));
        startTime.close();
        
            Random random = new Random();
            
                int[] List = {1,2,3,4,5,6,7,8,9,};
            
                int num1 = 0;
                int num2 = 0;
                int num3 = 0;
                int num4 = 0;

                while((num1-num2 > 3) == true){
                num1 = random.nextInt(List.length);
                num2 = random.nextInt(List.length);
                num3 = num1*num2;
                }
            
            System.out.print(num3);
            
        FileWriter endTime = new FileWriter(Log,true);
        endTime.write(" 終了"+ henkan.format(d));
            
        endTime.close();

        
        } catch (IOException ex) {
            Logger.getLogger(challenge15_10.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
