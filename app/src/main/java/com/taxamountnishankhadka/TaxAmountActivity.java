package com.taxamountnishankhadka;

public class TaxAmountActivity {
    private float salary;
    private float taxamount;
    private float amount;
    private float firsttax;
    private float secondtax;

    public TaxAmountActivity(Float amount)
    {
        this.amount = amount;
    }
    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }


    public float totaltaxamt1() {
        salary = amount * 12;
        taxamount = (float) (this.salary * 0.01);
        return (taxamount);
    }

    public float totaltaxamt2() {
        salary = amount * 12;
        firsttax = (float) (200000 * 0.01);
        taxamount = (float) (firsttax + ((this.salary - 200000) * (0.15)));
        return (taxamount);
    }

    public float totaltaxamt3() {
        salary = amount * 12;
        firsttax = (float) (200000 * 0.01);
        secondtax = (float) (firsttax + (150000 * 0.15));
        taxamount = (float) (secondtax + ((this.salary - 350000) * 0.25));
        return (taxamount);
    }
}
