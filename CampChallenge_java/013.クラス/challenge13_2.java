/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
class Hoge extends Userprof {
    public void setDel(){
        this.name=null;
        this.id=0;
    }   
}

/**
 *
 * @author yuta
 */
public class challenge13_2 {
    public static void main(String[] arg){
        Hoge miss = new Hoge();    
        miss.setDel();
        miss.sethyouji();
    }
}

