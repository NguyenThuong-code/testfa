import manager.ManagerDepartment;
import manager.ManagerEmployee;
import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Department> departmentList = ManagerDepartment.departmentList;
    public static ManagerDepartment md= new ManagerDepartment();
    public static List<Employee> employeeList= new ArrayList<>();
    public static  ManagerEmployee me = new ManagerEmployee();
    public static void main(String[] args) {
//        Department department = new Department("DE00001", "Financial",Domains.FIN);
//        Department department1 = new Department("DE00002", "Marketing",Domains.MAR);
//        Department department2 = new Department("DE00003", "Administration",Domains.ADM);
//md.addDepartment(department);
//md.addDepartment(department1);
//md.addDepartment(department2);
//
//Employee employee= new Employee("EM00001",Title.MR, "Thuong", Domains.ADM, "Java", 200.0, department2);
//        Employee employee1= new Employee("EM00002",Title.Ms, "Ha", Domains.FIN, "Script", 209.0, department);
//        Employee employee2= new Employee("EM00003",Title.Mrs, "Trung", Domains.MAR, "Node", 207.0, department1);
//me.addNewEmployee(employee);
//me.addNewEmployee(employee1);
//me.addNewEmployee(employee2);
//        Department department1 = new Department("DE00002", "Marketing",Domains.MAR);
//        Employee employee3= new Employee("EM00004",Title.Mrs, "Tung", Domains.MAR, "Node", 206.0, department1);
//        me.addNewEmployee(employee3);
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("Application to Manage Restaurant!");
            System.out.println("Enter a:To work with Department");
            System.out.println("Enter b:To work with Employee");
            System.out.println("Enter c:To exit!");
            String line = sc.nextLine();
            switch (line) {
                case "a": {
                    System.out.println("Enter 1:To Create Department:");
                    System.out.println("Enter 2:To Search Department in List:");
                    System.out.println("Enter 3:To add Department in list");
                    String type1 = sc.nextLine();
                    switch (type1) {
                        case "1": {
                            System.out.println("Enter Department ID:");
                            String idDep= sc.nextLine();
                            System.out.println("Enter Department Name:");
                            String nameDept=sc.nextLine();
                            System.out.println("Enter domain");
                            String dom= sc.nextLine();
                            Domains domains= Domains.valueOf(dom);
                            Department department= FactoryId.getDepartment(idDep, nameDept, domains);
                            md.addDepartment(department);
                            break;
                        }
                        case "2": {
                            System.out.println("Enter Department Name to Search:");

                            String nameDept=sc.nextLine();
                            md.searchDepartmentByName(nameDept);
                            break;
                        }
                        case "3": {

                            break;
                        }

                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case "b": {
                    System.out.println("Enter 1:To Create Employee");
                    System.out.println("Enter 2:Remove Employee ");
                    System.out.println("Enter 3:Display Employee");

                    String type2 = sc.nextLine();
                    switch (type2) {
                        case "1": {
                            System.out.println("Enter Id Employee");
                            String empID = sc.nextLine();
                            System.out.println("Enter Title");
                            String tit = sc.nextLine();
                            Title title = Title.valueOf(tit);
                            System.out.println("Enter Fullname ");
                            String fullName = sc.nextLine();
                            System.out.println("Enter Domain");
                            String dom = sc.nextLine();
                            Domains domains = Domains.valueOf(dom);
                            System.out.println("Enter position:");
                            String position = sc.nextLine();
                            System.out.println("Enter Salary");
                            Double salary = sc.nextDouble();
                            System.out.println("Enter ID department");
                            String dep = sc.nextLine();
                            Department department = null;
                            Employee employee = null;
                            for (int i = 0; i < departmentList.size(); i++) {
                                if (departmentList.get(i).getId().equalsIgnoreCase(dep)) {
                                    department = departmentList.get(i);
                                }
                                employee = FactoryId.getEmployee(empID, title, fullName, domains, position, salary, department);
                                me.addNewEmployee(employee);
                                break;
                            }
                        }
                        case "2": {
                            System.out.println("Enter Id Employee");
                            String empID= sc.nextLine();
                            me.deleteEmployeeById(empID);
                            break;
                        }
                        case "3": {
                            me.displayEmployee();
                            break;

                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;

                }
                default:
                    System.out.println("Invalid");
                    continue;
            }
        }
    }
}

