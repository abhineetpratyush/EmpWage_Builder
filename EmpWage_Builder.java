public class EmpWage_Builder{
	//Constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static void main(String[] args){
		//Variables
		int empHrs = 0;
		int empWage = 0;
		//Computation
		//check remainder with 3 because 0,1 or 2 possible
		int empCheck = (int) Math.floor(Math.random() * 10) % 3; 
		switch(empCheck){
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
		}
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: " + empWage);
	}
}
