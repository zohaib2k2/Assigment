/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_1;

/**
 *
 * @author DeathEater
 */
import java.util.Scanner;
public class DaysToMonths {
    public static void main(String[] args){
        int idays,remdays,months;
        Scanner stdin = new Scanner(System.in);
        
        System.out.print("Enter number of days: ");
        idays = stdin.nextInt();
        months = idays / 30;
        remdays = idays % 30;
        System.out.println(idays+" days are "+months+" and "+remdays+" days.");
    }
}
