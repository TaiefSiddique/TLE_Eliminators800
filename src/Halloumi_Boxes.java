import java.util.Scanner;

public class Halloumi_Boxes {
    public static void main(String[] args) {
        int t=0;
        Scanner ss=new Scanner(System.in);
        t=ss.nextInt();
        while(t>0){
            int n,k;
            n=ss.nextInt();
            k=ss.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=ss.nextInt();
            }
            int d=0;
            for(int i=n-1;i>=0;i--){
                while(i>0 && a[i]<a[i-1]){
                    d++;
                    i--;
                }
            }
            if(d>k) System.out.println("NO");
            else System.out.println("YES");
            t--;
        }
    }
}
