package staff.management;

import staff.Employee;

public class Director extends Employee {

    private String deptName;
    private double budget;

    public Director(String name, String nINumber, double salary, String deptName, double budget) {
        super(name, nINumber, salary);
        this.deptName = deptName;
        this.budget = budget;
    }

    public String getDeptName() {
        return deptName;
    }

    public void raiseSalary(double increase) {
        if (increase >= 0) {
            this.salary += increase;
        }
    }

    public double getBudget() {
        return budget;
    }

    public double payBonus(double salary) {
        return salary *= 1.02;
    }
}
