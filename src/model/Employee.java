package model;

import java.io.Serializable;

public class Employee implements Serializable {
    private String id;
    private Title title;
    private String fullName;
    private Domains domains;
    private String position;
    private Double monthSalary;
    private Department department;

    public Employee() {
    }

    public Employee(String id, Title title, String fullName, Domains domains, String position, Double monthSalary, Department department) {
        this.id = id;
        this.title = title;
        this.fullName = fullName;
        this.domains = domains;
        this.position = position;
        this.monthSalary = monthSalary;
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Domains getDomains() {
        return domains;
    }

    public void setDomains(Domains domains) {
        this.domains = domains;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(Double monthSalary) {
        this.monthSalary = monthSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "model.Employee{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", fullName='" + fullName + '\'' +
                ", domains=" + domains +
                ", position='" + position + '\'' +
                ", monthSalary=" + monthSalary +
                ", department=" + department +
                '}';
    }
}
