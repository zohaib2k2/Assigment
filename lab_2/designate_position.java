
import java.util.Scanner;
public class designate_position{
    public static void main(String[] args) {
        int salery;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter salery of employe in Rs: ");
        salery = input.nextInt();
        if (salery >= 25000 && salery <= 35999) {
            System.out.println("Your postition is Research Assistant");
        } else if(salery > 36000 && salery <= 50999 ){
            System.out.println("you postition is Junior Lecturer");
        } else if(salery > 51000 && salery <= 65999 ){
            System.out.println("you postition is Lecturer");
        } else if(salery > 66000 && salery <= 80999 ){
            System.out.println("you postition is Assistant Professor");
        } else {
            System.out.println("We can't find your postition");
        }
    }
}
