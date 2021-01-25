/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author plank
 */
import java.util.Scanner;
public class failsafe_calculator {
    public static void main(String[] args){
        System.out.print("Simple Calculator\n".toUpperCase());
        System.out.print("=================\n");
        Scanner stdin = new Scanner(System.in);
        
        double n1,n2;
        int operator;
        System.out.print("Enter first number : ");
        n1 = stdin.nextDouble();
        System.out.print("Enter second number :");
        n2 = stdin.nextDouble();
        System.out.println("Option Numbers:");
        System.out.println("Addition : 1");
        System.out.println("Substraction 2:");
        System.out.println("Multiplication 3:");
        System.out.println("divide 4:");
        
        System.out.print("Enter the operation ");
        operator = stdin.nextInt();
        switch(operator){
            case 1:
                System.out.println("performing addition\n");
                System.out.printf("%f + %f = %f\n",n1,n2,(n1+n2));
                break;
            case 2:
                System.out.print("Performing substraction\n");
                System.out.printf("%f - %d = %f",n1,n2,(n1-n2));
                break;
            case 3:
                System.out.print("performing multiplication\n");
                System.out.printf("%f * %f = %f\n",n1,n2,(n1*n2));
                break;
            case 4:
                int ans;
                try{
                    ans = (int)(n1)/((int)(n2));
                    System.out.println("performing divition\n");
                    System.out.printf("%f / %f = %f\n",n1,n2,n1/n2);
                } catch(java.lang.ArithmeticException err){
                    System.out.println("can't divide by zero\n");
                }
                break;
        }
    }
}
