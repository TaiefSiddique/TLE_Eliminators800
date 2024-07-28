import java.util.*;

public class Line_Trip  {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int t = ss.nextInt();
        while(t-- > 0){
            int n = ss.nextInt();
            int x = ss.nextInt();
            int[] a = new int[n + 2];
            a[0] = 0;  // Start point
            a[n + 1] = x;  // End point
            for(int i = 1; i <= n; i++){
                a[i] = ss.nextInt();
            }

            int maxD = 0;
            for(int i = 1; i <= n + 1; i++){
                maxD = Math.max(maxD, a[i] - a[i - 1]);
            }

            System.out.println(maxD);
        }
        ss.close();
    }
}
