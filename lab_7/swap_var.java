import java.util.Scanner;
class swaper{
	double a,b;
	swaper(double x , double y){
		a = x;
		b = y;
	}
	void swap(swaper ob){
		double temp;
		temp = ob.a;
		ob.a = ob.b;
		ob.b = temp;
	//	return ob;
	}
}
public class swap_var{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a: ");
		double a = in.nextDouble();
		System.out.println("Enter b: ");
		double b = in.nextDouble();

		System.out.println("\nAfter Swaping:");
		swaper nums = new swaper(a,b);
	//	swaper ob;
		nums.swap(nums);
//		System.out.println("a :"+ob.a);
//		System.out.println("b :"+ob.b);
		System.out.println("a from nums: "+nums.a);
		System.out.println("b from nums: "+nums.b);	
}

}
