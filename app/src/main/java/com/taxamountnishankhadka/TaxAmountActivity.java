package com.taxamountnishankhadka;

public class TaxAmountActivity {
    private double salary,taxamount;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getTaxamount() {
        return taxamount;
    }

    public void setTaxamount(double taxamount) {
        this.taxamount = taxamount;
    }

    public double taxCalculate() {
        if (salary <= 200000) {
            taxamount = (salary * 1) / 100;

        } else if (salary > 200000 && salary <= 350000) {
            double sal;
            sal = 200000 - salary;
            if (sal == 0) {
                taxamount = (salary * 1) / 100;

            } else {
                taxamount = ((200000 * 1) / 100 ) + ((sal * 15)/100);
            }
        }

        return taxamount;
    }
}
