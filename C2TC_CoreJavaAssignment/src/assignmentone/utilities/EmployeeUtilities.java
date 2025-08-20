package assignmentone.utilities;

import assignmentone.employees.Employee;

/**
 * Utility class to perform operations on Employee objects.
 * Demonstrates access modifiers and usage of employees package.
 */
public class EmployeeUtilities {

    /**
     * Prints details of any employee.
     * @param emp Employee object
     */
    public static void printEmployeeDetails(Employee emp) {
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("----------------------------------");
    }

    /**
     * Adds bonus amount to an employee's salary.
     * @param emp Employee object
     * @param bonus Bonus amount
     */
    public static void giveBonus(Employee emp, double bonus) {
        double newSalary = emp.getSalary() + bonus;
        emp.setSalary(newSalary);
        System.out.println("Bonus of " + bonus + " added. New Salary: " + emp.getSalary());
    }
}
