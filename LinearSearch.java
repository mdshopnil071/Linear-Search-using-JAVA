public class LinearSearch { // Declaring a public class named LinearSearch

    public static int getLargest(int numbers[]) { // Method that takes an integer array and returns the largest number

        int largest = Integer.MIN_VALUE; // Initialize 'largest' with the smallest possible integer value
        int smallest = Integer.MAX_VALUE; // Initialize 'smallest' with the largest possible integer value

        // Loop through each element of the array
        for (int i = 0; i < numbers.length; i++) {

            // If current element is greater than 'largest', update 'largest'
            if (largest < numbers[i]) {
                largest = numbers[i];
            }

            // If current element is smaller than 'smallest', update 'smallest'
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }

        // Print the smallest value in the array
        System.out.println("Smallest value is: " + smallest);

        // Return the largest value
        return largest;
    }

    public static void main(String args[]) { // Main method: the starting point of the program

        // Declare and initialize an integer array
        int numbers[] = {23, 45, 64, 199, 34, -9, 0};

        // Call the getLargest function and print the largest value
        System.out.println("Largest value is: " + getLargest(numbers));
    }
}
