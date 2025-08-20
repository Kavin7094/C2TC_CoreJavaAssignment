package assignmentone.employees;

/**
 * Manager class extends Employee.
 * Has additional attribute: teamSize.
 */
public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int employeeId, double salary, int teamSize) {
        super(name, employeeId, salary); // Call parent constructor
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
}
