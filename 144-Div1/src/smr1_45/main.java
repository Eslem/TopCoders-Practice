/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smr1_45;

import java.util.Arrays;
import smr1_45.div1.Lottery;

/**
 *
 * @author Slem-Destop
 */
public class main {

    public static void main(String[] args) {

        String[] val = Lottery.sortByOdds(new String[]{"INDIGO: 93 8 T F",
            "ORANGE: 29 8 F T",
            "VIOLET: 76 6 F F",
            "BLUE: 100 8 T T",
            "RED: 99 8 T T",
            "GREEN: 78 6 F T",
            "YELLOW: 75 6 F F"});

        System.out.println(Arrays.toString(val));
    }

}
