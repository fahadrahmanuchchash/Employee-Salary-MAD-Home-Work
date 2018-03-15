package employee.salary;

public class HourlyPaidEmployee extends Employee implements HourlyPaidSalary {

	public HourlyPaidEmployee(String name, String id, int workHour, double hourlyRate) {
		super(name, id);
		this.workHour = workHour;
		this.hourlyRate = hourlyRate;
		
	}
	
	private int workHour;
	private double hourlyRate;
	@Override
	public double getHourlyPaidSalary() {
		
		double totalHourlyRate = workHour*hourlyRate;
		
		
		return totalHourlyRate;
	}

	@Override
	public double totalSalary() {
		
		return getHourlyPaidSalary();
	}

	@Override
	public String toString() {
		return "Employee Name: "+getName()+"\n"+"Employee ID: "+getId()+"\n"+"Employee's Total Salary: "+totalSalary();
	}
	
	

}
