package employee.salary;

public class CommissionlyPaidEmployee extends Employee implements CommissionlyPaidSalary {

	
	
	public CommissionlyPaidEmployee(String name, String id, int quantity, double commissionRate) {
		super(name, id);
		this.quantity = quantity;
		this.commissionRate = commissionRate;
	}
	private int quantity;
	private double commissionRate;
	
	
	
	@Override
	public double getCommissionlyPaidSalary() {
		double commissionlyPaidSalary = quantity*commissionRate;
		return commissionlyPaidSalary;
	}
	@Override
	public double totalSalary() {
		
		return getCommissionlyPaidSalary();
	}
	
	public String toString(){
		return "Employee Name: "+getName()+"\n"+"Employee ID: "+getId()+"\n"+"Employee's Total Salary: "+totalSalary();
		
		
	}

}
