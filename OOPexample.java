public class OOPexample{
    public static void main(String args[]){
        Student s1=new Student("Bob",27,"cse");
        
        //===USE BELOW STATEMENTS OR THE FUNC=====
        
        //System.out.printf("Name for student is : %s\n",s1.name);
        //System.out.printf("Age of student is : %d\n",s1.age);
        //System.out.printf("Course in which student is enrolled: %s\n",s1.course);

        s1.displayDetails();
    }
}