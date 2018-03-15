package employee.salary;

public class BasePaidEmployee extends Employee implements BasePaidSalary{
	
	
	
	
	public BasePaidEmployee(String name, String id, double baseSalary) {
		super(name, id);
		this.baseSalary = baseSalary;
	}

	private double baseSalary;
	

	@Override
	public double getBaseSalary() {
		
		return baseSalary;
	}



	@Override
	public double totalSalary() {
		
		return getBaseSalary();
		
	}
	
	
	public String toString(){
		return "Employee Name: "+getName()+"\n"+"Employee ID: "+getId()+"\n"+"Employee's Total Salary: "+totalSalary() ;
		
	}




	
	

}
