package chapter5;

class SalaryManager {
	public double getMonthlySalary(int yearSalary) {
		double monthlySalary = yearSalary / 12.0;
		System.out.println(monthlySalary);
		
		double worktax = calculateTax(monthlySalary);
		double nenkin = calculateNationalPension(monthlySalary);
		double hoken = calculateHealthInsurance(monthlySalary);
		
		double total = worktax + nenkin + hoken;
		
		System.out.println(worktax);
		System.out.println(nenkin);
		System.out.println(hoken);
		
		monthlySalary -= total;
		
		return monthlySalary;
	}
	public double calculateTax(double monthSalary) {
		double workTax = monthSalary * (12.5 / 100);
		return workTax;
	}
	public double calculateNationalPension(double monthSalary) {
		double nenkin = monthSalary * (8.1 / 100);
		return nenkin;
	}
	public double calculateHealthInsurance(double monthSalary) {
		double hoken = monthSalary * (13.5 / 100);
		return hoken;
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalaryManager person = new SalaryManager();
		System.out.println("MonthlySalary: " + person.getMonthlySalary(20000000));

	}

}
