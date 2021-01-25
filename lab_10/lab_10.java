package labs;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author plank
 */
interface Y{
     double mull(double a, double b);
}
interface X extends Y{
    double add(double a,double b);
    double sub(double a,double b);
}
class A implements X{
    public double mull(double a,double b) {
        return a*b;
    }
    public double add(double a, double b){
        return a+b;
    }
    public double sub(double a, double b){
        return a-b; 
    }

}
public class lab_10 {
    public static void main(String[] args){
        A cal = new A();
        System.out.println("5 + 8 = "+cal.add(5, 8));
        System.out.println("15 - 6 = "+cal.sub(15, 6));
        System.out.println("5 * 8 = "+cal.mull(5, 8));
        
    }
}
