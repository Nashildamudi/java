import java.util.Scanner;

public class method {
    static int logic(int x, int y) {
        int z;
        if (x < y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = logic(a, b);

        System.out.println(c);

        sc.close();

    }
}