package storage;

import model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteEmployee implements EmployeeData{
    private ReadAndWriteEmployee(){}
    private static ReadAndWriteEmployee readAndWriteEmployee;

    public  static ReadAndWriteEmployee getInstance(){
        if (readAndWriteEmployee ==null) readAndWriteEmployee=new ReadAndWriteEmployee();
        return readAndWriteEmployee;
    }
    @Override
    public List<Employee> readFile() {
        List<Employee> employees= new ArrayList<>();

        try {
            FileInputStream fis = new FileInputStream("employee.dat");
            ObjectInputStream ois= new ObjectInputStream(fis);
            Object obj = ois.readObject();
            employees=(List<Employee>) obj;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return employees;
    }

    @Override
    public void writeFile(List<Employee> employees) {
        try {
            FileOutputStream fos= new FileOutputStream("employee.dat");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(employees);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
