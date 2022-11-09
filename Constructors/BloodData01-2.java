
 class BloodData {
	static String bloodType;
	static String rhFactor;
	
		public void BloodData(){
			bloodType = "O";
			rhFactor = "+";
			} 
				
		public void BloodData(String bt, String rh){
			bloodType = bt;
			rhFactor = rh;
			}
	
	    public void display(){
	    	System.out.println(BloodType + rhFactor + "is added to the blood bank");
	    	}
}