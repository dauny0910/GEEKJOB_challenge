/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *課題「ファイルの書き出しと保存」で作成したテキストファイルを読み込み，その内容を画面に表示してください。。
 * @author yuta
 */
public class challenge15_9 {
    public static void main(String[] args){
        try {
            File fp = new File("ProfText");
            
            FileWriter fw = new FileWriter(fp);
            fw.write("私の名前は渡辺です。");
            
            fw.close();

            
            FileWriter tuiki = new FileWriter(fp,true);
            
            String newLine = System.lineSeparator();
            
            
            tuiki.write(newLine + "安食で生まれました");
            tuiki.write(newLine + "成田らへんです");
            
            tuiki.close();
            
            FileReader yomu = new FileReader(fp);
            BufferedReader yomuyomu = new BufferedReader(yomu);
            
                String line = yomuyomu.readLine();
                
                while (line != null) {
                    System.out.println(line);
                    line = yomuyomu.readLine();
                    //readLine()の動き方がよくわからない。なぜ次の行に移っているのか。
                    //一回ループするごとに行を移動するのか。それなら一度に全ての行を見ても良さそうなものだが。
                    //つまり引数的なもので行番号を加算していくとかではない状態なので、ループするたびに行を移動する理由がわからない。
                }
                
                while(null != yomuyomu.readLine()){
                    System.out.print(yomuyomu.readLine());
                    //上記の理由により、ループするごとにであればこれでも良さそうなものだが、これもこれで謎な表示の仕方をする。
                    //無限ループになるわけでもなく、最初の行が表示されるわけでもなく、最後だけ。何故
                    
                }
                
                
                String ln;
                while((ln = yomuyomu.readLine() )!= null){
                    System.out.println(ln);
                }
                
                
                
                String[] fluits ={"apple", "banana", "orange"};
                
                for(String fluit : fluits){
                    System.out.println(fluit);
                }
                      
                 
            
            
            yomuyomu.close();
            
        } catch (IOException ex) {
            Logger.getLogger(challenge15_8.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    
}
