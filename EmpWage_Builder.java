public class EmpWage_Builder{
	//Constants
	public static final int IS_FULL_TIME = 1;
	public static void main(String[] args){
		//Computation
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if(empCheck == IS_FULL_TIME)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}
}
