abstract class Shape{
    double x = 0.0;
    double y = 0.0;
    abstract void show();
    public void movex(double ax){
        this.x += ax;
    }
    public void movey(double ay){
        this.y += ay;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
}    


// A class the defines a geometrical point on a 2D graph
class Point extends Shape{
    double x;
    double y;
    Point(double x, double y) {
        super();
        this.x = x;
        this.y = y;
        this.setX(x);
        this.setY(y);
    }
    Point() {
            super();
            this.x = 0;
            this.y = 0;
    }
    //return distance from origin
    double distanceTo() {
        return Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y, 2));
    }

    /*
     * return distance from cooridinate x and y
     **/
    double distanceTo(double x, double y) {
        return Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
    }
    /*
     * return true if the point object is at same coordiante as (a,b)
     **/    
    boolean isAtSamePoint(double a, double b) {
        return (this.x == a) && (this.y == b);
    }
    /*
     * reUA
1
turn true if the point object coordinate is equal to object p1 cooridate
     **/
    boolean isAtSamePoint(Point p1) {
        return (this.x == p1.x) && (this.y == p1.y);
    }
    /*
jdk     * Show the cooridinates of the object points
     **/    
    void show(){
        System.out.print("The point is ("+this.x+","+this.y+")\n");
    }
}

class Line extends Point {

    Point p1;
    Point p2;
    /* This constructor takes two Point objects */
    Line(Point p1, Point p2) {
        super(p1.x, p1.y);
        this.p1 = p1;
        this.p2 = p2;
    }
    /*
     * returns the slope of the line
     **/
    double slope() {
        return (this.p2.y - this.p1.y) / (this.p2.x - this.p2.x);
    }
    /*
     * return the length of the line
     **/
    double megnitude() {
        return Math.hypot((this.p1.x - this.p2.x),(this.p1.y - this.p2.y));
    }

    /*
     * return if the line is parallel or not 
     **/
    boolean isParallel(Line l1) {
        return (this.slope() == l1.slope());
    }
    /*
     * returns if the line is perpendicular or not
     **/
    boolean isParpendicular(Line l1) {
        return (this.slope() * l1.slope() == -1);
    }
    /*
     * show the ends points of the line
     **/
    public void show() {
        System.out.print("\nThis is a line\n");
        System.out.print("ends of a this line is point A(" + this.p1.x + "," + this.p1.y + ")");
        System.out.print(" and B(" + this.p2.x + "," + this.p2.y + ")\n");
    }
}

 class Circle extends Point {

    double radius;
    Point center;
//	double a;
//	double b	

    Circle(Point p1, double radius) {
        super(p1.x, p1.y);
        this.radius = radius;
        center = p1;
    }
    /*
     * return true if the c1 is concentric
     **/
    boolean isConcentric(Circle c1) {
        return isAtSamePoint(c1.x, c1.y);
    }

    public void show() {
        System.out.print("\nThe shape is circle");
        System.out.print("This center of circle is (" + center.x
                + "," + center.y + ")" + " with radius " + this.radius+"\n");
    }
}

 class Rectangle extends Shape {
    Point p1;
    Point p2;
    Line diagonal;
    Rectangle(Point p1,Point p2){
        super();
        diagonal = new Line(p1,p2);
        this.p1 = p1;
        this.p2 = p2;
        this.setX((p1.x + p2.x)/2);
        this.setY((p2.y + p2.y)/2);
        
    }
    public void show(){
        System.out.print("\nThe end points of the recetangle diagonal line are"
                + " : \n");

        this.p1.show();
        this.p2.show();
    }
}

public class geometry {

    public static void main(String[] args) {
        Shape[] shapes = {  
            new Point(3,5), 
            new Rectangle(new Point(5.0,4.0),new Point(10.0,5.0)),
            new Circle(new Point(0.0,0.0),9),
            new Line(new Point(-10.3,9.5), new Point(6.8,9.1)),
            new Circle(new Point(5,3),29),
            new Rectangle(new Point(3.14,-4.2),new Point(8.5,3.5)),
            new Line(new Point(10.0,4.5),new Point(13.4,4.1))
        };
        for(int i = 0; i < shapes.length; i++){
            shapes[(int)(Math.random()*shapes.length)].show();
        }
        
    }
}
