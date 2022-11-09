import java.util.Scanner;
public class RunBloodData {
        
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	String input1, input2;
    	String data;
    	
    	
    	BloodData bd = new BloodData();
    	
    	System.out.print("Enter blood type of patient: ");
    	input1 = sc.nextLine();
    	bd.setBloodType(input1);
    	    	
    	System.out.print("Enter the Rhesus Factor(+ or -): ");
    	input2 = sc.nextLine();
    	bd.setRhFactor(input2);
    	
    	data = input1 + input2;
    	
    	bd.setRhFactor(input2);

    	
    	if (data.isEmpty()){
    		bd = new BloodData();
    		bd.display();
    		}
    		
    	else if (data.equals("A+")|| data.equals("A-")|| data.equals("B+")|| data.equals("B-")|| data.equals("AB+")
    		|| data.equals("AB-")|| data.equals("O+")|| data.equals("O-")){
    			
    		System.out.println(data  + " is added to the blood bank.");
    		}
    		
    	else{
    		System.out.println("Invalid Input!");
    		}		
    	sc.close();
        
    }
}
