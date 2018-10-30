/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/9/">Lab 9 Description</a>
 */
public class Employee {

    /** Name of employee. */
    private String name;
    /** Name of employee's manager. */
    private String manager;

    /**
     * Constructor for initialization.
     * @param name name to set to employee
     * @param manager name of manager to set to employee
     */
    public Employee(final String name, final String manager) {
        this.name = name;
        this.manager = manager;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     * @param name set to name
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Getter for manager.
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Setter for manager.
     * @param manager set to manager
     */
    public void setManager(final String manager) {
        this.manager = manager;
    }
}
