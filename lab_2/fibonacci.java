
public class fibonacci{
    public static void main(String[] args) {
        int a =0;
        int b =1;

        int index;
        for (index =0;index < 11 ;index++ ) {
            System.out.print(a+" "+b+" ");
            a = a + b;
            b = a + b;
        }
        System.out.println();
    }
}
