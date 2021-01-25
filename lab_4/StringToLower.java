import java.util.Scanner;

public class StringToLower{
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter a string either in upper case or with some upper case:\n");
		String up_str = stdin.nextLine();
		String low_str = up_str.toLowerCase();
		System.out.print("The string becomes:\n");
		System.out.println(low_str);
	}
}
// thats all folks
