package storage;

import model.Department;
import model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteDepartment implements DepartmentData{
    private ReadAndWriteDepartment(){}
    private static ReadAndWriteDepartment readAndWriteDepartment;

    public  static ReadAndWriteDepartment getInstance(){
        if (readAndWriteDepartment ==null) readAndWriteDepartment=new ReadAndWriteDepartment();
        return readAndWriteDepartment;
    }
    @Override
    public List<Department> readFile() {
        List<Department> departments= new ArrayList<>();

        try {
            FileInputStream fis = new FileInputStream("department.dat");
            ObjectInputStream ois= new ObjectInputStream(fis);
            Object obj = ois.readObject();
            departments=(List<Department>) obj;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return departments;
    }

    @Override
    public void writeFile(List<Department> departments) {
        try {
            FileOutputStream fos= new FileOutputStream("department.dat");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(departments);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
