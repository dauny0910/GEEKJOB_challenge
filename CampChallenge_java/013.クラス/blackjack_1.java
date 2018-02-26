
import java.util.ArrayList;
import java.util.Collections;

/*ブラックジャック
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
abstract class Human {

    ArrayList<Integer> myCards = new ArrayList<Integer>();

    abstract public int open();

    abstract public void setCard(ArrayList<Integer> cardNum);

    abstract public boolean checkSum();

}

class User extends Human {

    public int open() {
        int sum = 0;
        for (int i = 0; i < myCards.size(); i++) {
            int sum1 = myCards.get(i);
            sum = sum + sum1;
        }
        return sum;
    }

    public void setCard(ArrayList<Integer> cardNum) {
        for (int i = 0; i < cardNum.size(); i++) {
            myCards.add(cardNum.get(i));
        }
    }

    public boolean checkSum() {
        if (open() < 17) {
            return true;
        } else {
            return false;
        }
    }

}

class Dealer extends Human {

    ArrayList<Integer> Cards = new ArrayList<Integer>();

    public Dealer() {

        for (int num = 0; num < 4; num++) {
            for (int i = 0; i < 9; i++) {
                Cards.add(i);
            }
            for (int num2 = 0; num2 < 4; num2++) {
                Cards.add(10);
            }
        }
    }

    public int open() {
        int sum = 0;

        for (int i = 0; i < myCards.size(); i++) {
            int sum1 = myCards.get(i);
            sum = sum + sum1;
        }
        return sum;
    }

    public void setCard(ArrayList<Integer> cardNum) {
        for (int i = 0; i < cardNum.size(); i++) {
            myCards.add(cardNum.get(i));
        }
    }

    public boolean checkSum() {
        if (open() <= 17) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Integer> deal() {

        ArrayList<Integer> atarasi = new ArrayList<Integer>();
        Collections.shuffle(Cards);

        atarasi.add(Cards.get(0));
        atarasi.add(Cards.get(1));

        Cards.remove(0);
        Cards.remove(1);

        return atarasi;
    }

    public ArrayList<Integer> hit() {
        ArrayList<Integer> atari = new ArrayList<Integer>();
        Collections.shuffle(Cards);
        atari.add(Cards.get(0));
        Cards.remove(0);
        return atari;

    }
}

/**
 *
 * @author yuta
 */
public class blackjack_1 {

    public static void main(String[] arg) {

        Dealer battle = new Dealer();
        User challenge = new User();

        battle.setCard(battle.deal());
        challenge.setCard(battle.deal());

//        for(;;){
//        
//        
//        }
//        while(true){
//            
//            
//            if(){
//                
//            }
//        }
        for (boolean hantei = true; hantei == true;) {
            //forのさいごのところがおかしい
            challenge.open();
            hantei = challenge.checkSum();
            if (hantei == true) {
                challenge.setCard(battle.hit());
            }
        }

        for (boolean hantei = true; hantei == true;) {
            battle.open();
            hantei = battle.checkSum();
            if (hantei == true) {
                battle.setCard(battle.hit());
            }
        }

        if (challenge.open() > 21) {
            System.out.print(challenge.open() + "であなたはバーストしました。あなたの負けです");
        } else if (challenge.open() <= 21 & battle.open() > 22) {
            System.out.print("ディーラーは" + battle.open() + "です。ディーラーがバーストしたので" + challenge.open() + "で、あなたの勝ちです");
        } else if (challenge.open() > battle.open()) {
            System.out.print("あなたは" + challenge.open() + "で、ディーラーは" + battle.open() + "なので、あなたの勝ちです");
        } else if (challenge.open() == battle.open()) {
            System.out.print("あなたは" + challenge.open() + "で、ディーラーも" + battle.open() + "なので、今回は引き分けです");
        } else {
            System.out.print("あなたは" + challenge.open() + "で、ディーラーは" + battle.open() + "なので、あなたの負けです");
        }

    }
}
