package javaFundamentals;
import java.util.*;

public class TM01_Proj1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter Emp No. : ");
		int empID = input.nextInt();
		TM01_Proj1 emp = new TM01_Proj1();
		System.out.println("Employee ID : " +empID);
		System.out.println("Employee Name : " +emp.name(empID));
		System.out.println("Employee Department : " +emp.dept(empID));
		System.out.println("Employee Designation : " +emp.designation(empID));
		System.out.println("Employee Salary : " +emp.salary(empID));
					
	}
	
	public String name(int id) {
		return empName[index(id)];		
	}
	
	public String dept(int id) {
		return dept[index(id)];
	}
	
	public String designation(int id) {
		char ch = desigCode(id);
		switch(ch) {
		case 'e': return "Engineer";
        case 'c': return "Consultant";
        case 'k': return "Clerk";
        case 'r': return "Receptionist";
        case 'm': return "Manager"; 
		}
		return null;
	}
			
	public int salary(int id) {
		int index = index(id);
		int totalSalary;
		totalSalary = (basic[index] + hrs[index] + DA(index) - it[index]);
		return totalSalary;
		
	}
	
	private int index(int id) {
		int index = 0;
		for(int i=0; i<empID.length; i++) {
			if(id == empID[i]) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	private char desigCode(int id) {
		return desCode[index(id)];
	}
	
	private int DA(int i) {
		char ch = desigCode(i);
		switch(ch) {
		case 'e': return 20000;
        case 'c': return 32000;
        case 'k': return 12000;
        case 'r': return 15000;
        case 'm': return 40000;
		}
		return 0;
	}
	
	private int[] empID = {1001, 1002, 1003, 1004, 1005, 1006, 1007};
	private String[] empName = {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};
	private String[] dept = {"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};
	private char[] desCode = {'e', 'c', 'k', 'r', 'm', 'e', 'c'};
	private int[] basic = {20000, 30000, 10000, 12000, 50000, 23000, 29000};
	private int[] hrs = {8000, 12000, 8000, 6000, 20000, 9000, 12000};
	private int[] it = {3000, 9000, 1000, 2000, 20000, 4400, 10000};
}
