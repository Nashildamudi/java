import java.util.*;
public class pattrerns1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
    
        System.out.println("enter the n");
        int n = obj.nextInt();

        System.out.println("enter the m");
        int m = obj.nextInt();

        for(int i=1; i<=n; i++) {

            for(int j=1; j<=m; j++) {
                 
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
