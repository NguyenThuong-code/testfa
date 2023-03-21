package model;

import model.Employee;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FactoryId implements Serializable {
    private static  final String ID_EMPLOYEE="^EM[0-9]{5}$";
    private static  final String ID_DEPARTMENT="^DE[0-9]{5}$";
    public static  boolean validateIdEmployee(String em){
        Pattern pattern=Pattern.compile(ID_EMPLOYEE);
        Matcher matcher= pattern.matcher(em);
        return matcher.matches();
    }
    public static  boolean validateIdDepartment(String de){
        Pattern pattern=Pattern.compile(ID_DEPARTMENT);
        Matcher matcher= pattern.matcher(de);
        return matcher.matches();
    }
    public static Department getDepartment(String id, String nameDept, Domains domains){
        Department department;
        if (validateIdDepartment(id)){
           department=new Department();
        }else {
            throw new IllegalArgumentException("The Id model.Department not match!");
        }
        department.setNameDept(nameDept);
        department.setDomains(domains);
        return department;
    }
    public static Employee getEmployee(String id, Title title, String fullName, Domains domains, String position, Double monthSalary, Department department){
        Employee employee;
        if (validateIdEmployee(id)){
            employee=new Employee();
        }else {
            throw new IllegalArgumentException("The Id model.Employee not match!");
        }
        employee.setTitle(title);
        employee.setFullName(fullName);
        employee.setDomains(domains);
        employee.setPosition(position);
        employee.setMonthSalary(monthSalary);
        employee.setDepartment(department);
        return  employee;
    }
}
