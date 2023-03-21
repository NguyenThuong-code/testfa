package model;

import java.io.Serializable;

public class Department implements Serializable {
    private String id;
    private String nameDept;
    private Domains domains;

    public Department() {
    }

    public Department(String id, String nameDept, Domains domains) {
        this.id = id;
        this.nameDept = nameDept;
        this.domains = domains;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameDept() {
        return nameDept;
    }

    public void setNameDept(String nameDept) {
        this.nameDept = nameDept;
    }

    public Domains getDomains() {
        return domains;
    }

    public void setDomains(Domains domains) {
        this.domains = domains;
    }

    @Override
    public String toString() {
        return "model.Department{" +
                "id='" + id + '\'' +
                ", nameDept='" + nameDept + '\'' +
                ", domains=" + domains +
                '}';
    }
}
