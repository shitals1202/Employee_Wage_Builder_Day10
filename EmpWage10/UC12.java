import java.util.Random;

class EmployeeWage {

	public int wagePerHr;
	public int maxHrs;
	public int noOfWorkingDays;

	public EmployeeWage(int wagePerHr, int maxHrs, int noOfWorkingDays) {
		this.wagePerHr = wagePerHr;
		this.maxHrs = maxHrs;
		this.noOfWorkingDays = noOfWorkingDays;
	}

	public void employeeWage() {
		int empHrs = 0;
		int totalWorkingDays = 0;
		int workingHr = 0;
		int dailyEmpWage = 0;
		int empWage = 0;

		while (empHrs <= maxHrs && totalWorkingDays <= noOfWorkingDays) {
			Random r = new Random();
			int empCheck = r.nextInt(3);
			switch (empCheck) {
			case 0: {
				workingHr = 8;
				break;
			}
			case 1: {
				workingHr = 4;
				break;
			}
			case 2: {
				workingHr = 0;
				break;
			}
			}
			empHrs += workingHr;
			dailyEmpWage = workingHr * wagePerHr;
			empWage = empWage + (workingHr * wagePerHr);
			totalWorkingDays++;
			System.out.print(dailyEmpWage + " ");
		}
		System.out.println();
		System.out.println("Total Employee wage for 20 days is : " + empWage);

	}
}

class Company {
		public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation program");

		EmployeeWage company1 = new EmployeeWage(20, 100, 20);
		EmployeeWage company2 = new EmployeeWage(22, 110, 22);
		EmployeeWage company3 = new EmployeeWage(18, 95, 18);

		System.out.println();
		System.out.println("Daily EmployeeWage of Company1 is");
		company1.employeeWage();

		System.out.println();
		System.out.println("Daily EmployeeWage of Company2 is");
		company2.employeeWage();

		System.out.println();
		System.out.println("Daily EmployeeWage of Company3 is");
		company3.employeeWage();

	}

}
