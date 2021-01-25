import java.util.Scanner;
public class strcmp{
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter string 1: ");
		String str1 = stdin.nextLine();
		System.out.print("Enter string 2: ");
		String str2 = stdin.nextLine();

		int cmp = str1.compareTo(str2);
		if(cmp == 0){
			System.out.println("Both string are equal");
		} else if(cmp < 0){
			System.out.println("String 1 is less then string 2");
		} else{
			System.out.println("String 1 is greater then string 2");
		}
		System.out.println("\n\nchars at 3 and 4");
		System.out.println(str1.charAt(3));
		System.out.println(str1.charAt(4));
		

	}
}
