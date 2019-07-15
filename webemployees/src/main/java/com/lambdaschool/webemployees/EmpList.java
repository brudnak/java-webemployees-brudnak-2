package com.lambdaschool.webemployees;

import java.util.ArrayList;

public class EmpList {

    // creating array list named empList
    public ArrayList<Employee> empList = new ArrayList<>();

    // constructor
    public EmpList() {

        // Initializing data onto the array list empList
        empList.add(new Employee("Steve", "Green", 45000, true, 1, 1));
        empList.add(new Employee("Sam", "Ford", 80000, true, 1, 1));
        empList.add(new Employee("John", "Jones ", 75000, true, 1, 1));
    }

}

