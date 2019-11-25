package main;

public class Employee {
    private int empId;
    private double salary;
    private String name;̥

    public Employee() {
        this.empId = 0;
        this.name = "Fluffy";̥
        this.salary = 10_000_000.0;
    }

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return this.getEmpId()+":"+this.getName()+":"+this.getSalary();
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
