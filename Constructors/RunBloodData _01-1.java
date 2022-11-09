import java.util.Scanner;
public class RunBloodData {
        

    public static void main(String[] args) {
       Scanner in= new Scanner(System.in);
     
       System.out.println("Enter blood type of patient: ");
       String bt = in.nextLine();
       
       System.out.println("Enter the Rhesus factor (+ or -):");
       String rh = in.nextLine();
       
       if(bt.equals(" ") && rh.equals(" ")){
       	BloodData bd = new BloodData();
       	bd.display();
       	}
       	
       else if(bt == ("A")|| bt == ("B") || bt == ("AB") || rh == ("+") || rh == ("-")){
       	BloodData bd = new BloodData(String bt,String rh);
       	bd.display();
       	}
       	
       else{
       	System.out.println("Invalid");
       	}
       
    }
}
