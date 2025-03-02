// Defining the first interface named addInterface
// This interface contains a method declaration for addition
interface addInterface {
    int add(int a, int b);  // Abstract method for addition
}

// Defining the second interface named subInterface
// This interface contains a method declaration for subtraction
interface subInterface {
    int sub(int a, int b);  // Abstract method for subtraction
}

// Implementing multiple interfaces in a single class
// Java allows multiple inheritance through interfaces
public class multipleInterface implements addInterface, subInterface {

    // Implementing the add method from addInterface
    @Override
    public int add(int a, int b) {
        return a + b; // Returns the sum of a and b
    }

    // Implementing the sub method from subInterface
    @Override
    public int sub(int a, int b) {
        return a - b; // Returns the difference of a and b
    }

    // Main method: Entry point of the program
    public static void main(String[] args) {
        // Creating an object of multipleInterface class
        multipleInterface obj = new multipleInterface();

        // Calling the implemented methods and displaying the results
        System.out.println("Addition: " + obj.add(5, 3));      // Output: Addition: 8
        System.out.println("Subtraction: " + obj.sub(5, 3));  // Output: Subtraction: 2
    }
}
