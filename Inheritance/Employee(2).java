
public class Employee extends Person {

    double salary;
    String department;
    
     // SALARY
    void setSalary(double s){
    	this.salary = s;
    	}
    	
    double getSalary(){
    	return salary;
    	}	
    
    //DEPARTMENT
    void setDepartment(String d){
    	this.department = d;
    	}
    	
    String getDepartment(){
    	return department;
    	}	
    
    
}