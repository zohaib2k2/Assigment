import java.util.Scanner;
public class BMI{
    public static void main(String[] args){
        double pounds,inches; // for input vars
        double kgs,feets,bmi; // for output vars
        Scanner stdin = new Scanner(System.in);
        
        System.out.print("Enter your weight in pounds: ");
        pounds = stdin.nextDouble();
        System.out.print("Enter your height in inches: ");
        inches = stdin.nextDouble();
        
        // calculations
        kgs = pounds * 0.45359237;
        feets = inches * 0.0254;
        bmi = kgs/Math.pow(feets,2);
        
        System.out.println("your bmi"+bmi);
        
        if(bmi < 18.5){
            System.out.println("You are under weight");
        }
        else if(18.5 <= bmi && bmi < 25.0){
            System.out.println("Normal body index");
        }
        else if(25.0 <= bmi && bmi < 30.0){
            System.out.println("You are over weight");
        }
        else if(30.0 <= bmi){
            System.out.println("oh no you are over weight");
        }
    }
}