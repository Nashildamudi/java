import java.util.Arrays;
public class overload {

    static void change(int [] arr) {
       arr[0] = 98;
    }
    public static void main(String[] args) {
        
        int [] marks = {10, 50, 45, 74, 89, 65};

        change(marks);

        System.out.println(marks);


    }
}
