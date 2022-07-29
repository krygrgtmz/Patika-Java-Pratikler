package com.PayrollCalculator;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Koray Gerigitmez", 900, 20, 2020);
        e1.printEmployee();

        Employee e2 = new Employee("Hande Türkmen", 8000, 45, 2011);
        e2.printEmployee();

        Employee e3 = new Employee("Elif Aksakal", 30000, 50, 2000);
        e3.printEmployee();

    }
}
