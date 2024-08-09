/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bostonmarathon;

/**
 *
 * @author KARL COMPUTERS
 */
public class BostonMarathon {

    public static void main(String[] args) { 
        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};
        
        int fastestTime = Integer.MAX_VALUE;
        int secondFastestTime = Integer.MAX_VALUE;
        String fastestRunner = "";
        String secondFastestRunner = "";
        
        for (int i = 0; i < times.length; i++) {
            if (times[i] < fastestTime) {
                secondFastestTime = fastestTime;
                secondFastestRunner = fastestRunner;
                fastestTime = times[i];
                fastestRunner = names[i];
            } else if (times[i] < secondFastestTime) {
                secondFastestTime = times[i];
                secondFastestRunner = names[i];
            }
        }
        
        System.out.println("Fastest runner: " + fastestRunner + " with a time of " + fastestTime + " minutes.");
        System.out.println("Second fastest runner: " + secondFastestRunner + " with a time of " + secondFastestTime + " minutes.");
    }
}
        
    

