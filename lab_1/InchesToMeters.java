import java.util.Scanner;

public class InchesToMeters{
    public static void main(String[] args){
        double inches,meters;
        Scanner stdin = new Scanner(System.in);
        
        System.out.print("Enter a value for inches: ");
        inches = stdin.nextDouble();
        System.out.println(inches +" inch is "+(inches*0.0254));
        
    }
}