import java.util.Scanner;
public class CollegeList {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    Person P = new Person();
    Student S = new Student();
    Employee E = new Employee();
    Faculty F = new Faculty();	

    System.out.println("Press E for Employee, F for Faculty, or S of Student: ");
    String letter = in.next();
    
    //EMPLOYEE
    if(letter.equalsIgnoreCase("E")){
    	System.out.println("Type employee's name, contact number, salary, and department");
    	System.out.println("Press enter after every input");
    	String empname = in.next();
    	E.setName(empname);
    	String empnum = in.next();
    	E.setContactNum(empnum);
    	double empsalary = in.nextDouble();
    	E.setSalary(empsalary);
    	String empdep = in.next();
    	E.setDepartment(empdep);
    	
    	System.out.println("--------------------------------");
    	System.out.println("Name: " + E.getName());
    	System.out.println("Contact Number: " + E.getContactNumber());
    	System.out.println("Salary: " + E.getSalary());
    	System.out.println("Department: " + E.getDepartment());
    	
    	}
    
    //STUDENT	
    else if (letter.equalsIgnoreCase("S")){
    	System.out.println("Type student's name, contact number, program, and year level");
    	System.out.println("Press enter after every input");
    	String studname = in.next();
    	S.setName(studname);
    	String studnum = in.next();
    	S.setContactNum(studnum);
    	String studprog = in.next();
    	S.setProgram(studprog);
    	int studyear = in.nextInt();
    	S.setYearLevel(studyear);
    	
    	System.out.println("--------------------------------");
    	System.out.println("Name: " + S.getName());
    	System.out.println("Contact Number: " + S.getContactNumber());
    	System.out.println("Program: " + S.getProgram());
    	System.out.println("Year Level: " + S.getYearLevel());
    	
    	}
    
    //FACULTY
    else if (letter.equalsIgnoreCase("F")){

    	System.out.println("Type employee's name, contact number, salary, department, and status");
    	System.out.println("Press enter after every input");
    	String facname = in.next();
    	F.setName(facname);
    	String facnum = in.next();
    	F.setContactNum(facnum);
    	double facsalary = in.nextDouble();
    	F.setSalary(facsalary);
    	String facdep = in.next();
    	F.setDepartment(facdep);
    	
    	System.out.println("--------------------------------");
    	System.out.println("Name: " + F.getName());
    	System.out.println("Contact Number: " + F.getContactNumber());
    	System.out.println("Salary: " + F.getSalary());
    	System.out.println("Department: " + F.getDepartment()); 
    		  		
}

    	
    	
    	}
    	
        
    }
}
