import java.util.*;

public class tryExample {


    public static void main(String[] args) {

        int age;
        String name;

        Scanner obj = new Scanner(System.in);
       
        System.out.println("entet your name");
        name = obj.nextLine();

        System.out.println("entet your age");
        age = obj.nextInt();

        if(age >= 18) {
            System.out.println(name + "you are an adult");
        } else {
            System.out.println(name + "your not an adult");
        }
    }

}
