package employee.salary;
import java.util.Scanner;

public class StartUp {

	private static Scanner input1;

	public static void main(String[] args) {
		
		/*for user input
		String name = null;
		String id = null;
		double baseSalary = 0.0;
		double hourlyRate = 0.0;
		int totalHour = 0;
		double commissionRate = 0;
		int quantity = 0;
		*/
		
		
		while (doRepeat() == 1 ){
			
			doRepeat();
		}
		
		
	}
	
	public static int doRepeat(){
		
		input1 = new Scanner(System.in);

		
		System.out.println("for Base Paid Employee's total salary Enter 1\n\n"
							+ "for hourly Paid Employee's salary Enter 2\n\n"
							+ "for Commissionly paid Employee's total salary Enter 3\n\n"
							+"for Base and Commissionly paid Employee's total salary Enter 4\n\n"
							+"for Hourly and Commissionly paid Employee's total salary Enter 5\n\n"
							+"Enter your Employment Type:");
							
		int optionNumber = input1.nextInt();
		
		if(optionNumber==1){
			Employee basePaid1 = new BasePaidEmployee("Uchchash", "198125", 10000);
			System.out.println(basePaid1+"\n\n");
		}else if(optionNumber == 2){
			Employee hourlyPaid1 = new HourlyPaidEmployee("Aftab", "197150", 270, 80);
			System.out.println(hourlyPaid1+"\n\n");
		}else if(optionNumber == 3){
			Employee commissionlyPaid1 = new CommissionlyPaidEmployee("Rahib", "195624", 60, 200);
			System.out.println(commissionlyPaid1+"\n\n");
		}else if(optionNumber == 4){
			Employee baseCommissionlyPaid1 = new Base_And_Commissioned_Employee("Arif", "198545", 60, 200, 15000);
			System.out.println(baseCommissionlyPaid1+"\n\n");
		}
		
		return 1;
		
		
	  }
	
	
	
	}
