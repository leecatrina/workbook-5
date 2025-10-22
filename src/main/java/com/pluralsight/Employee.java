package com.pluralsight;

public class Employee {
   private int  employeeID;
   private String name;
   private String department;
   private double payRate;
   private double hoursWorked;
   private double startTime; //track when they punch in

    public Employee(int employeeID, String name, String department, double payRate, double hoursWorked) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
    // DERIVED getters - calculate values
    public double getRegularHours() {
        if (hoursWorked <= 40) {
            return hoursWorked;  // All hours are regular
        } else {
            return 40.0;  // Cap at 40
        }
    }

    public double getOvertimeHours() {
        if (hoursWorked > 40) {
            return hoursWorked - 40;  // Hours over 40
        } else {
            return 0.0;  // No overtime
        }
    }

    public double getTotalPay() {
        double regularPay = getRegularHours() * payRate;
        double overtimePay = getOvertimeHours() * payRate * 1.5;  // Overtime is 1.5x
        return regularPay + overtimePay;
    }
    // NEW METHODS
    public void punchIn(double time) {
        startTime = time;  // Save when they started
    }

    public void punchOut(double time) {
        double hoursThisShift = time - startTime;  // Calculate shift length
        hoursWorked += hoursThisShift;  // Add to total hours
    }
}
