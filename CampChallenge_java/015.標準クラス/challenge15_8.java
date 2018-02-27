/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *自己紹介の記述されたテキストファイルを作成してください。
 * ファイルの作成は，File クラスなどを利用することによって行ってください。
 * @author yuta
 */
public class challenge15_8 {
    public static void main(String[] args){
        try {
            File fp = new File("ProfText");
            FileWriter fw = new FileWriter(fp);
            fw.write("私の名前は渡辺です。");
            
            fw.close();
            
            
            FileWriter tuiki = new FileWriter(fp,true);
            
            String newLine = System.lineSeparator();
            
            
            tuiki.write(newLine + "これは二行目");
            
            tuiki.close();
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(challenge15_8.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    
}
