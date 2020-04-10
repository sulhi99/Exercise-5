import java.util.Scanner;
public class payrollDemo
{ 
   public static void main(String[] args)
   {
     Employee emp = new Employee();
     emp.input();
     Payroll pay = new Payroll(emp.grossPay, emp.stateTax, emp.federalTax);
     pay.calculateNetPay();
     pay.printOutput();
   }
}
   // employee ID number, gross pay, state tax and federal tax
  class Employee
  {   
    int employeeID;
    double grossPay, stateTax, federalTax;
    
    public void input()
    {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter your Employee ID Number :");
     employeeID = sc.nextInt();
     System.out.print("Enter your Gross Pay : RM ");
     grossPay = sc.nextDouble();
     System.out.print("Enter your State Tax : RM ");
     stateTax = sc.nextDouble();
     System.out.print("Enter your Federal Tax : RM ");
     federalTax = sc.nextDouble();
    }
  }
  
  class Payroll
  {
  
   private double grossPay, stateTax, federalTax, netPay;
   
   public Payroll(double grossPay, double stateTax, double federalTax)
   {
   
     this.grossPay = grossPay;
     this.stateTax = stateTax;
     this.federalTax = federalTax;
     
   }
   
   public double calculateNetPay()
   {
   
     return netPay = grossPay - stateTax - federalTax; 
     
   }
 
   public void printOutput()
   {
     
     System.out.printf("%nNet Pay is : RM %.2f", calculateNetPay());
     
   }
     
 } // end class payroll

 