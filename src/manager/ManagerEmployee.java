package manager;

import model.Employee;
import storage.EmployeeData;
import storage.ReadAndWriteEmployee;

import java.util.ArrayList;
import java.util.List;

public class ManagerEmployee {
    private static EmployeeData employeeData= ReadAndWriteEmployee.getInstance();
    public static List<Employee> employeeList;
    static {
        employeeList= employeeData.readFile();
    }
    public void deleteEmployeeById(String id){
        employeeList.remove(id);
    }
    public void displayEmployee(){
        for (Employee e: employeeList
             ) {
            System.out.println(e.toString());
        }
    }
    public void addNewEmployeeNoDept(Employee employee){
        employee.setDepartment(null);
        employeeList.add(employee);
        employeeData.writeFile(employeeList);
    }
    public void addNewEmployee(Employee employee){
        employeeList.add(employee);
        employeeData.writeFile(employeeList);
    }
}
