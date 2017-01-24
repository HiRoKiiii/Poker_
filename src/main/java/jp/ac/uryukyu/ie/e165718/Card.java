package jp.ac.uryukyu.ie.e165718;

import java.util.Random;
/**
 * Created by e165718 on 2017/01/23.
 */

public class Card {
    public static void print(){
        String[] suit = { "♠︎","❤︎","♦︎","♣"};
        String[] number = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] card = new String[53];
        Random rnd = new Random();
        int ran = rnd.nextInt(4);
        int ran2 = rnd.nextInt(13);
        // System.out.printf(suit[ran] + " " +number[ran2]);
        int x = 0;
        for (int i=0; i<suit.length; i++) {
            for (int n = 0; n < number.length; n++) {
                String k = suit[i] + number[n];
                card[x] = k;
                System.out.println(card[x]);
                x++;
                // System.out.println(suit[i] + " " + number[n]);
            }
        }

    }
}
