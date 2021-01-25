import java.util.Scanner;

public class isPalindrome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word: ");
		boolean is_pal_flag = true;

		String word = sc.nextLine();
		int i,j;
		for(i = 0, j = word.length()-1; i < word.length() ;i++,j--){
			if(word.charAt(i) != word.charAt(jq)){
				System.out.println("No its not palindrome");
				is_pal_flag = false;
				break;
			}
		}
		if(is_pal_flag == true){
			System.out.println("Yes it its a palindrome");
		}	
	}
}

