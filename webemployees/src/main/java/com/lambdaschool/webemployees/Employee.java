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
}
