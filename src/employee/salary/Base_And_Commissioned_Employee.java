package employee.salary;

public class Base_And_Commissioned_Employee extends CommissionlyPaidEmployee implements BasePaidSalary {
	
	
	
	public Base_And_Commissioned_Employee(String name, String id, int quantity, double commissionRate, double baseSalary) {
		super(name, id, quantity, commissionRate);
		this.baseSalary = baseSalary;
	}
	private double baseSalary;
	@Override
	public double getBaseSalary() {
		
		return baseSalary;
	}
	@Override
	public double totalSalary() {
		
		return super.totalSalary()+getBaseSalary();
	}
	@Override
	public String toString() {
		return "Employee Name: "+getName()+"\n"+"Employee ID: "+getId()+"\n"+"Employee's Total Salary: "+totalSalary();
	}
	
	
	

}
