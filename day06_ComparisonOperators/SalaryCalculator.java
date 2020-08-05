package day06_ComparisonOperators;
// write a program that can calculate the taxt, and salary after tax based on the hourly rate & tax rates

public class SalaryCalculator {
    public static void main(String[] args) {
        double rate = 50;
        double stateTaxRate = 0.04;
        double federalTaxRate = 0.2;
        int weeklyHours = 40;

        double salary =rate * weeklyHours * 48;
        double totalTax = salary *(stateTaxRate+federalTaxRate);
        double salaryAfterTax = salary - totalTax;

        System.out.println("Salary before tax: "+salary+" USD");
        System.out.println("Total Tax: "+totalTax+" USD");
        System.out.println("Take home salary: "+ salaryAfterTax+ " USD");




    }
}
