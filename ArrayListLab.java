import java.util.*;

public class ArrayListLab {

    public static void main(String[] args) {

        int limit = 20; //the limit of values a person can add

        Scanner scanner = new Scanner(System.in); //scanner to let user input values

        System.out.println("Enter up to " + limit + " double values (type 'done' when finished):"); //prompt for user to input values

        Double[] numberArray = new Double[limit]; //creates an array to keep values in
        int count = 0;

        //loop to allow the user to enter more values until limit or until 'done' is entered
        while (count < limit) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            try {
                double nextDouble = Double.parseDouble(input);
                numberArray[count++] = nextDouble;
            } catch (NumberFormatException e) {
                //throws this error when invalid value entered
                System.out.println("Invalid input! Please enter a valid double value or 'done' to finish.");
            }
        }

        System.out.println("\nEntered double values:");
        //prints only entered values and no nulls
        System.out.println(Arrays.toString(Arrays.copyOfRange(numberArray, 0, count)));

        scanner.close();
    }
}
