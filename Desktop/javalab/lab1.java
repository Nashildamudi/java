import java.util.Scanner;

public class lab1 {
    public static void main(String[] args) {
        double radius, area, circumfarence;
        final double pi = 3.142;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the radius");
        radius = obj.nextFloat();
        area = pi * (radius*radius);
        circumfarence = 2 * pi * radius;
        System.out.println("area of the circle is"+ area);
        System.out.println("circumfarance of circle is"+ circumfarence);

    }
}
