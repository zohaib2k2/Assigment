/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author plank
 */

    public class task2 {

        public static void main(String[] args) {
            Scanner num = new Scanner(System.in);
            char grade;
            int scr;
            try {
                System.out.print("Enter your score: ");
                scr = num.nextInt();
                if (scr > 100) {
                    throw new IllegalArgumentException("out of range ");
                } else if (scr < 0){
                    throw new java.lang.IllegalStateException("Score can't be "
                            + "negative");
                } else if (scr >= 90) {
                    grade = 'A';
                    System.out.println("Your Grade " + grade);
                } else if (scr >= 80) {
                    grade = 'B';
                    System.out.println("Your Grade " + grade);
                } else if (scr >= 70) {
                    grade = 'C';
                    System.out.println("Your Grade " + grade);
                } else if (scr >= 60) {
                    grade = 'D';
                    System.out.println("Your Grade " + grade);
                } else {
                    grade = 'F';
                    System.out.println("mubarak ho ap fail hogy ho " + grade);
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Something went wrong." + e);
            } catch(java.lang.IllegalStateException e){
                System.out.println(e);
            }
        }
    }

