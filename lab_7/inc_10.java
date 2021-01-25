import java.util.Scanner;
class incrementor{
    static int start,step,times;
    static int term;    
    incrementor(int start,int step, int times){
        this.start = start;
        this.step = step;
        this.times = times;        
    }
    static void increment(incrementor incobj){
        term = incobj.start;
        for(int i = 0; i < incobj.times; i++){
            System.out.print(term+" ");
            term+=incobj.step;
        }
        System.out.println();
    }

}
public class inc_10{
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int start = stdin.nextInt();
        incrementor as1 = new incrementor(start,10,5);
        incrementor.increment(as1);
    }
}
