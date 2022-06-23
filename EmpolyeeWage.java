package bl.com.employeewageprogram;
/*
 * Author- Amod
 * Calculate Part time Employee Wage for month
 */
public class EmpolyeeWage {
	
	public static final int IS_PART_TIME = 1;
	public static  final int IS_FULL_TIME = 2;
	public static final int  EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS =2;
	public static void main(String[] args) {
		//variables
		
		int  empHrs=0;
		int TotalEmpWage = 0;
		int empWage = 0;
		
		//use random method check employee is present or not
		for (int day = 0;day < NUM_OF_WORKING_DAYS; day++) {
		double empCheck = Math.floor(Math.random()* 10)%3;
		if (empCheck == IS_FULL_TIME)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is not Absent");
		
		//calculate employee wage 
		switch((int)empCheck) {
		case  IS_FULL_TIME :
			empHrs = 12;
		break;
		case IS_PART_TIME :
				empHrs = 8;
		break;
		 default :
			 empHrs = 0;
		}
			
		empWage = empHrs * EMP_RATE_PER_HOUR;
		TotalEmpWage += empWage;
		System.out.println("Emp Wage : " + empWage);
		}
		System.out.println("Total Emp Wage :" + TotalEmpWage);
	}

}
