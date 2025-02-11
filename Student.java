class Student {
    // Attributes (Instance variables)
    String name;
    int age;
    String course;

    // Constructor
   // @SuppressWarnings("static-access")
    Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    
    // Method to display student details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

