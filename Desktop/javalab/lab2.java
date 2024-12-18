import java.util.Scanner;

class lab2 {
    public static void main(String args[]) {
        int n, num, count = 0;
        boolean prime;

        // Read N from the command-line argument
        n = Integer.parseInt(args[0]);
        num = 1;

        while (count != n) {
            prime = true;

            // Check if the current number is prime
            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    prime = false;
                    break;
                }
            }

            // If prime, print the number and increment the count
            if (prime) {
                System.out.println(num);
                count++;
            }

            // Increment the number for the next check
            num++;

            // Break when N prime numbers are found
            if (count == n) {
                break;
            }
        }
    }
}



    
