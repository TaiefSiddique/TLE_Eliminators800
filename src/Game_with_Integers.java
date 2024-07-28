import java.util.Scanner;

public class Game_with_Integers {
    public static void main(String[] args) {
        int t=0;
        Scanner ss=new Scanner(System.in);
        t=ss.nextInt();
        while(t>0){
            int n;
            n=ss.nextInt();
            if(n%3==0) System.out.println("Second");
            else System.out.println("First");
            t--;
        }
    }
}
