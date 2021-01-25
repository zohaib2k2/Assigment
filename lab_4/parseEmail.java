import java.util.Scanner;

public class parseEmail{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a email: ");
		String in_email = sc.nextLine();
		String[] parts = in_email.split("@");
		String user = parts[0];
		String host = parts[1].split("\\.")[0];
		String domain = parts[1].split("\\.")[1];
		System.out.println("User name :"+user);
		System.out.println("host : "+host);
		System.out.println("Domain : "+domain);
		
	}
}
