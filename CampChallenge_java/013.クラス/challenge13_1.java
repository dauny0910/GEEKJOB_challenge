/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



 class Userprof{
    public String name;
    public int id;
    
    public void setpuls(String word, int number){
        this.name = word;
        this.id = number;
        }
    public void sethyouji(){
        System.out.print(this.name);
        System.out.print(this.id);   
        }
    }

public class challenge13_1 {
    public static void main(String[] arg){
        Userprof user1 = new Userprof();
        user1.setpuls("namako",2);
        user1.sethyouji();
        }
    }

    

    
