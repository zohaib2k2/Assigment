import java.util.Scanner;

class Measurement{
	double kms,meters,millimeters;
	Measurement(double kms,double meters, double millimeters){
		this.kms = kms;
		this.meters = meters;
		this.millimeters = millimeters;
	}
	double roundKms(){
		return Math.round(this.kms);
	}
	double roundMeters(){
		return Math.round(this.meters);
	}
	double roundMillimeters(){
		return Math.round(this.millimeters);
	}

}
public class RoundOff{
	public static void main(String[] args){
		System.out.println("Roundin off..");
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the meaurement in kilometers : ");
		double km = in.nextDouble();
		System.out.print("Enter the meaurement in meters : ");
		double m = in.nextDouble();
		System.out.print("Enter the meaurement in millimeters : ");
		double milli = in.nextDouble();
		System.out.println();
		Measurement scale = new Measurement(km,m,milli);
		System.out.println("The rounded measurement in kms is : "+scale.roundKms());
		System.out.println("The rounded measurement in meters is : "+scale.roundMeters());
		System.out.println("The rounded measurement in kms is : "+scale.roundMillimeters());
	}

}
