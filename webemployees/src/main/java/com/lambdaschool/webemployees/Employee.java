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
}
