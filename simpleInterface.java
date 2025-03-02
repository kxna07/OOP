// Defining an interface named InnersimpleInterface
// Interfaces in Java contain only abstract methods (before Java 8) 
// and must be implemented by a class.
interface InnersimpleInterface {
    int add(int a, int b);  // Abstract method for addition
    int sub(int a, int b);  // Abstract method for subtraction
}

// Implementing the interface in a class
class simpleInterface implements InnersimpleInterface {
    
    // Implementing the add method from the interface
    @Override
    public int add(int a, int b) {
        return a + b; // Returns the sum of a and b
    }

    // Implementing the sub method from the interface
    @Override
    public int sub(int a, int b) {
        return a - b; // Returns the difference of a and b
    }

    // Main method: Entry point of the program
    public static void main(String[] args) {
        simpleInterface si = new simpleInterface();  // Creating an object of simpleInterface

        // Calling the implemented add and sub methods
        System.out.println("Addition : " + si.add(10, 5));  // Output: Addition : 15
        System.out.println("Subtraction : " + si.sub(10, 5));  // Output: Subtraction : 5
    }
}
