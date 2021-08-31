import java.util.ArrayList;
import java.util.Random;

//interface class
@@ -156,9 +157,15 @@ public static void main(String[] args) {
		Company2 company2 = new Company2(22, 110, 22);
		Company3 company3 = new Company3(18, 95, 18);

		System.out.println("Employee Wage of Company1 is : " + company1.employeeWage());
		System.out.println("Employee Wage of Company2 is : " + company2.employeeWage());
		System.out.println("Employee Wage of Company3 is : " + company3.employeeWage());
		// Creating Arraylist of companies
		ArrayList<Integer> companies = new ArrayList<>();
		companies.add(company1.employeeWage());
		companies.add(company2.employeeWage());
		companies.add(company3.employeeWage());
		System.out.println("EmployeeWage of Companies is");
		for (int j = 0; j < companies.size(); j++) 
		System.out.print(companies.get(j) + " ");
		}

	}
