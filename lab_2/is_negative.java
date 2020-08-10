import java.util.Scanner;

public class is_negative{
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        num = input.nextInt();
        if (num < 0) {
            System.out.println("The number is negative");
        } else if (num > 0) {
            System.out.println("The number is postive");
        } else{
            System.out.println("The number is zero");
        }

    }
}
