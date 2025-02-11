
    public class staticAll {
        public static void main(String[] args) {
            Counter c1 = new Counter();
            Counter c2 = new Counter();
            Counter c3 = new Counter();
    
            c3.displayCount(); // Output: Count: 3 (shared among all instances)
        }
    }

