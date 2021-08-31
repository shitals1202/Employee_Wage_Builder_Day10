EmployeeWage company2 = new EmployeeWage(22, 110, 22);
		EmployeeWage company3 = new EmployeeWage(18, 95, 18);

		System.out.println("Employee Wage of Comapny1 is : " + company1.employeeWage());
		System.out.println("Employee Wage of Comapny2 is : " + company2.employeeWage());
		System.out.println("Employee Wage of Comapny3 is : " + company3.employeeWage());
		// Putting all the employee wages of multiple companies in array
		int[] array = new int[3];
		array[0] = company1.employeeWage();
		array[1] = company2.employeeWage();
		array[2] = company3.employeeWage();
		System.out.println("EmployeeWage of Companies is");
		for (int i = 0; i < 3; i++) {
			System.out.print(array[i] + " ");

		}

	}
