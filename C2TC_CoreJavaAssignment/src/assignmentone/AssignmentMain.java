package assignmentone;

import assignmentone.employees.Manager;
import assignmentone.employees.Developer;
import assignmentone.utilities.EmployeeUtilities;

/**
 * Main class to demonstrate Employee Management System.
 */
public class AssignmentMain {
    public static void main(String[] args) {
        // Create Manager
        Manager manager = new Manager("Ravi", 101, 80000, 10);

        // Create Developer
        Developer developer = new Developer("Priya", 202, 60000, "Java");

        // Print details using utilities
        System.out.println("=== Manager Details ===");
        EmployeeUtilities.printEmployeeDetails(manager);
        System.out.println("Team Size: " + manager.getTeamSize());

        System.out.println("\n=== Developer Details ===");
        EmployeeUtilities.printEmployeeDetails(developer);
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());

        // Give bonus
        System.out.println("\n=== Giving Bonus ===");
        EmployeeUtilities.giveBonus(manager, 5000);
        EmployeeUtilities.giveBonus(developer, 3000);
    }
}
