import java.util.Scanner;
class powerLaw{
    double current,volts,power;
    powerLaw(double current,double volts){
        this.current = current;
        this.volts = volts;     
    }
    double    getPower(){
        return (this.current * this.volts);         
    }
}
public class power_law{
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter current : ");
        double i = stdin.nextDouble();
        System.out.print("Enter volts :");
        double v = stdin.nextDouble();
        powerLaw p1 = new powerLaw(i,v);
        System.out.println("The power is : "+ p1.getPower());

    }        
}
