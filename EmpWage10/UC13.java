@@ -14,11 +14,10 @@ public EmployeeWage(int wagePerHr, int maxHrs, int noOfWorkingDays) {
		this.noOfWorkingDays = noOfWorkingDays;
	}

	public void employeeWage() {
	public int employeeWage() {
		int empHrs = 0;
		int totalWorkingDays = 0;
		int workingHr = 0;
		int dailyEmpWage = 0;
		int empWage = 0;

		while (empHrs <= maxHrs && totalWorkingDays <= noOfWorkingDays) {
@@ -39,13 +38,13 @@ public void employeeWage() {
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

		return empWage;

	}
}
@@ -60,16 +59,12 @@ public static void main(String[] args) {
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
		System.out.println("Total Employee Wage of Company1 is : " + company1.employeeWage());

		System.out.println("Total Employee Wage of Company2 is : " + company2.employeeWage());


		System.out.println("Total Employee Wage of Company3 is : " + company3.employeeWage());

	}
