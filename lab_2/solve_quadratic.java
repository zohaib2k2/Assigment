
// A program to solve quadratic iquation
import java.util.Scanner;
public class solve_quadratic{
    public static void main(String[] args) {
        double a,b,c;
        double deter;
        double root1,root2;
        Scanner stdin = new Scanner(System.in);


        System.out.print("A program to solve quadratic equation\n\n");
        System.out.print("Enter value of a: ");
        a = stdin.nextDouble();
        System.out.print("Enter value of b: ");
        b = stdin.nextDouble();
        System.out.print("Enter value of c: ");
        c = stdin.nextDouble();

        deter = Math.pow(b,2) - 4*a*c;
        if (deter > 0) {
            root1 = (-b + Math.sqrt(deter)) / 2 * a;
            root2 = (-b - Math.sqrt(deter)) / 2 * a;
            System.out.println("There are two roots solution for this equation"+
                                " x1 = "+root1+" x2 = "+root2+"");
        } else if(deter < 0){
            System.out.println("Thare are no real solution");
        } else {
            root1 = (-b + Math.sqrt(deter)) / 2 * a;
            System.out.println("There is one real solution x1 ="+root1);
        }
    }
}
