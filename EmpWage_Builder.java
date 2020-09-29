public class EmpWage_Builder{
	//Constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;
	private int totalEmpWage;

	public EmpWage_Builder(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}
	
	public void computeEmpWage(){
		//Variables
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		//Computation
		while(totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays){
			totalWorkingDays++;
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
			totalEmpHrs += empHrs;
			System.out.println("Day#: " +  totalWorkingDays + " Emp Hr: " + empHrs);
		}			
		totalEmpWage = totalEmpHrs * empRatePerHour;
	}

	@Override
	public String toString(){
		return "Total Emp Wage for Company: " + company + " is: " + totalEmpWage;
	}
	
	public static void main(String[] args){
		EmpWage_Builder dMart = new EmpWage_Builder("DMart", 20, 2, 10);
		EmpWage_Builder reliance = new EmpWage_Builder("Reliance", 10, 4, 20);
		dMart.computeEmpWage();
		System.out.println(dMart);
		reliance.computeEmpWage();
		System.out.println(reliance);
	}
}
