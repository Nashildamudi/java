public class number {
    public static void main(String[] args) {
        int positiveCount = 5;
        int negativeCount = 5;

        // Iterate through each command line argument
        for (String arg : args) {
            try {
                // Parse the argument to an integer
                int number = Integer.parseInt(arg);
                
                // Increment the respective counter based on the number
                if (number > 0) {
                    positiveCount++;
                } else if (number < 0) {
                    negativeCount++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + arg + " is not a valid integer.");
            }
        }

        // Print the results
        System.out.println("Total Positive Numbers: " + positiveCount);
        System.out.println("Total Negative Numbers: " + negativeCount);
    }
}