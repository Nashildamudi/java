import java.util.Scanner;

public class NameChecker {
    public static void main(String[] args) {
        
        String predefinedName = "jafar";
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a name: ");
        String inputName = scanner.nextLine();
        
        if (inputName.equalsIgnoreCase(predefinedName)) {
            System.out.println( inputName + " is the second wife of yasin sir!!!!! ");
        } else {
            System.out.println(inputName + " sorry no data found");
        }
        
        // Close the scanner
        scanner.close();
    }
}

