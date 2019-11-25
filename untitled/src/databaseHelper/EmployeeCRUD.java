package databaseHelper;

import main.Employee;

public class EmployeeCRUD {
    private Employee employee;
    public Employee createEmployee(int empId,String name,double salary){
        return employee=new Employee(empId,name,salary);
    }
    public int getEmployeeId(){
        return employee.getEmpId();
    }
    public String getEmployeeName(){
        return employee.getName();
    }
    public double getEmployeeSalary(){
        return employee.getSalary();
    }
    public void updateEmployeeId(int empId){
        employee.setEmpId(empId);
    }
    public void updateEmployeeName(String name){
        employee.setName(String name);
    }
    public void updateEmployeeSalary(double salary){
        employee.setSalary(salary);
    }
    public boolean deleteEmployee(Employee employee){
        //delete employee
        return false;
    }

}
