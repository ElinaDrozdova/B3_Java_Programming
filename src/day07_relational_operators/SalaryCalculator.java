package day07_relational_operators;

public class SalaryCalculator {
    public static void main(String[] args) {
double salary = 100000;
double stateTaxRate = 0.08; //8%
        double federalTaxRate = 0.21; //21%
        double stateTax,  federalTax, totalTax, salaryAfterTax;

        stateTax = salary * stateTaxRate;
        federalTax = salary * federalTaxRate;
        totalTax = stateTax + federalTax;
        salaryAfterTax = salary - totalTax;

        String taxReport = "State tax rate: " + stateTax + ", Federal tax rate: " + federalTaxRate + " , salary before tax: " + salary + " Tax amount: " + stateTax + " is for state tax and tax amount $" + federalTax + " is for federal tax/ After all these taxes, your total tax is $" + totalTax + " and your after tax salary is $" + salaryAfterTax;

        System.out.println(taxReport);
    }
}