package sMs;

/**
 * - teachers' attributes
 *     - id
 *     - name
 *     - salary
 */

public class Teacher {
    private int id;
    private String name;
    private int salary;

    /**
     * This constructor creates a new eacher object
     * @param id, id of the teacher
     * @param name, name of the teacher
     * @param salary, salary of the teacher, unique to the teacher, just like the id and the name
     *                But we would have a setter for the salary because the teacher's salary might increase and thus change unlike name and id.
     *                so no getter for name and id, just a setter for salary
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     *
     * @return the id of the teacher
     */
    public int getId() {
        return id; //or this.id
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    /**
     * set the salary
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
