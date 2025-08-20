package assignmenttwo;

/**
 * Main class to test Student and Commission classes
 */
public class Assignment_2_Demo {
    public static void main(String[] args) {
        // Creating Student object (constructor message will print)
        Student s1 = new Student();

        // Creating Commission object
        Commission c1 = new Commission();
        c1.acceptDetails();
        c1.calculateCommission();
    }
}
