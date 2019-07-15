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

    public Employee findEmployee(CheckEmployee tester) {
        for (Employee e: empList) {
            if (tester.test(e)) {
                return e;
            }
        }

        return null;
    }

    public ArrayList<Employee> findEmployees(CheckEmployee tester) {

        // creating TEMPORARY array list of type Employee
        ArrayList<Employee> tempEmpList = new ArrayList<>();

        // loop through employees in empList
        for (Employee e: empList) {

            // if LAMBDA EXPRESSION is TRUE
            if (tester.test(e)) {

                // ADD to the newly created TEMPORARY array list
                tempEmpList.add(e);
            }
        }

        return tempEmpList;
    }
}

