public class Counter {
    static int count = 0; // Static variable

    Counter() {
        count++; // Increment count whenever a new object is created
    }

    void displayCount() {
        System.out.println("Count: " + count);
    }
}



