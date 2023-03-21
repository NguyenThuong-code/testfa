package manager;

import model.Department;
import storage.DepartmentData;
import storage.ReadAndWriteDepartment;

import java.util.ArrayList;
import java.util.List;

public class ManagerDepartment {
    private static DepartmentData departmentData= ReadAndWriteDepartment.getInstance();
    public static List<Department> departmentList;
    static {
        departmentList= departmentData.readFile();
    }
    public void searchDepartmentByName(String name){
        for (int i = 0; i < departmentList.size(); i++) {
           if (departmentList.get(i).getNameDept().equalsIgnoreCase(name)){
               System.out.println(departmentList.get(i).toString());
           }
        }
    }
    public void addDepartment(Department department){
departmentList.add(department);
departmentData.writeFile(departmentList);
    }

}
