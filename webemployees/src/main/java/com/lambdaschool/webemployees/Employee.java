package com.lambdaschool.webemployees;

import java.util.concurrent.atomic.AtomicLong;

public class Employee {

    //fields
    private static final AtomicLong counter = new AtomicLong();
    private long id;
    private String fname;
    private String lname;
    private double salary;
    private boolean has401K;
    private int companyID;
    private int healthPlanID;

    // constructor
    public Employee(String fname, String lname, double salary, boolean has401K, int companyID, int healthPlanID) {
        this.id = counter.incrementAndGet();
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
        this.has401K = has401K;
        this.companyID = companyID;
        this.healthPlanID = healthPlanID;
    }

    // clone constructor
    public Employee(Employee toClone) {
        this.id = toClone.getId();
        this.fname = toClone.getFname();
        this.lname = toClone.getLname();
        this.salary = toClone.getSalary();
        this.has401K = toClone.isHas401K();
        this.companyID = toClone.getCompanyID();
        this.healthPlanID = toClone.getHealthPlanID();
    }

    // start of - GETTERS & SETTERS
    public long getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isHas401K() {
        return has401K;
    }

    public void setHas401K(boolean has401K) {
        this.has401K = has401K;
    }

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    public int getHealthPlanID() {
        return healthPlanID;
    }

    public void setHealthPlanID(int healthPlanID) {
        this.healthPlanID = healthPlanID;
    }
    // end of - GETTERS & SETTERS

    // TO STRING
    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", fname='" + fname + '\'' + ", lname='" + lname + '\'' + ", salary=" + salary + ", has401K=" + has401K + ", companyID=" + companyID + ", healthPlanID=" + healthPlanID + '}';
    }
}
