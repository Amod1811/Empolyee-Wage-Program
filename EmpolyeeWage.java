package bl.com.employeewageprogram;
/*
 * Author- Amod
 * Part time Employee&Wage Calculate
 */
public class EmpolyeeWage {

	public static void main(String[] args) {
		//variables
		int IS_FULL_TIME =1;
		int IS_PART_TIME = 2;
		int  empHrs=8;
		int Wsa =0;
		int EMP_RATE_PER_HOUR = 20;
		int empWage = 20;
		
		//use random method check employee is present or not
		double empCheck = Math.floor(Math.random()* 10)%3;
		if (empCheck == IS_FULL_TIME)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is not Absent");
		
		//calculate employee wage 
		if (empCheck == IS_FULL_TIME)
			empHrs = 12;
		else if (empCheck == IS_PART_TIME)
			empHrs = 8;
		else
			empHrs = 0;
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage : " + empWage);
				
				
				
				
				
				
				
				

	}

}
