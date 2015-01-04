/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smr1_45.div2;

import smr1_45.div1.*;

/**
 *
 * @author Slem-Destop
 */
public class BinaryCode {

    public String[] decode(String message) {
        int size = message.length();
        int[] number = new int[size];
        for (int x = 0; x < size; x++) {
            number[x] = Character.getNumericValue(message.charAt(x));
        }

        return new String[]{
            getString(number, 0), getString(number, 1)
        };
    }

    public String getString(int[] number, int initialValue) {
        int[] ifZero = new int[number.length];        

        ifZero[0] = initialValue;
        ifZero[1] = number[0] - ifZero[0];
        String decoded =""+ifZero[0]+ifZero[1];

        for (int x = 2; x < number.length; x++) {
            ifZero[x] = number[x - 1] - ifZero[x - 1] - ifZero[x - 2];

            if (ifZero[x] > 1) {
                return "NONE";
            }else{
                decoded+=ifZero[x];
            }
        }
        return decoded;
    }

}
