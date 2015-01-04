/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smr1_45.div2;

/**
 *
 * @author Slem-Destop
 */
public class Time {

    public String whatTime(int seconds) {
        int hours = seconds/3600;
        int minuts = (seconds - (hours * 3600 )) / 60;
        int secondsRest = seconds - (hours*3600) - (minuts*60);
        return hours + ":" + minuts + ":" + secondsRest;
    }
}
