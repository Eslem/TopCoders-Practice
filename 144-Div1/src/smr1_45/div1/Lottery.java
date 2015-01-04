/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smr1_45.div1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

/**
 *
 * @author Slem-Destop
 */
public class Lottery {

    public String[] sorByOdds(String[] rules) {

        int size = rules.length;

        Double[] probalities = new Double[size];
        String[] names = new String[size];
        HashMap<String, Double> map = new HashMap<String, Double>();

        TreeMap<String, Double> sorted_map = new TreeMap<String, Double>();

        for (int x = 0; x < size; x++) {
            String[] splited = rules[x].split(": ");

            names[x] = splited[0];

            String[] values = splited[1].split(" ");

            double choises = Double.parseDouble(values[0]);
            double blanks = Double.parseDouble(values[1]);

            double max = Math.pow(choises, blanks);

            double second = Double.parseDouble(values[1]);

            if (values[2].equals("F") && values[3].equals("F")) {
                probalities[x] = 1 / max;
            }
            if (values[2].equals("T") && values[3].equals("F")) {
                double toRest = max / blanks - choises / blanks;
                probalities[x] = 1 / (max - toRest);
            }
            if (values[2].equals("F") && values[3].equals("T")) {
                probalities[x] = 1 / (max - choises);
            }
            if (values[2].equals("T") && values[3].equals("T")) {
                double toRest = (max - (max / blanks - choises / blanks)) - choises;
                probalities[x] = 1 / toRest;
            }

            map.put(names[x], probalities[x]);
        }

        //System.out.println(map);
        sorted_map.putAll(map);
        System.out.println(sorted_map.descendingMap());

        return new String[]{Arrays.toString(names), Arrays.toString(probalities)};
    }

    private double getProbability(int n, int m) {
        return fact(n) / fact(m) / fact(n - m);
    }

    private double fact(int n) {
        double x = 1;
        if (n != 0) {
            for (int i = n; i > 0; i--) {
                x *= i;
            }
        }
        return x;
    }

}
