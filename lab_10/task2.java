/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labs;

/**
 *
 * @author plank
 */
interface Shape{
    void Draw();
}
class Circle implements Shape{
    public void Draw(){
        System.out.print("This is a circle\n");
    }
}
class Square implements Shape{
    public void Draw(){
        System.out.print("This is a square\n");
    }
}
class Rectangle implements Shape{
    public void Draw()
    {
        System.out.print("This is a Rectangle\n");
    }
}
public class task2 {
    public static void main(String[] args){
         Shape circle1 = new Circle();
         circle1.Draw();
         Shape rect1 = new Rectangle();
         rect1.Draw();
         Shape sqr1 = new Square();
         sqr1.Draw();
    }
}
