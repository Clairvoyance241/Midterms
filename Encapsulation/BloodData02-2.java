
class BloodData {

    private String bloodType;
    private String rhFactor;
    
    public BloodData(){
    	bloodType = "O";
    	rhFactor = "+";
    }
    
    //SETTER
    void setBloodType(String bloodType){
        this.bloodType = bloodType;
    }
    
    void setRhFactor(String rhFactor){
        this.rhFactor = rhFactor;
    }
    
    //GETTER
    String bloodType(){
        return bloodType;
    }
    
    String rhFactor(){
        return rhFactor;
    }
    
    
    	
    public void display(){
    	System.out.println(bloodType + rhFactor + " is added to the blood bank.");
    	}	
    
}