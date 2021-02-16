	
	public class AirConditioner
	{
		private String productName;
		private boolean isOn;
		private int temperature;
		
		//public AirConditioner(String name){
			// name = productName; }
	
			public void setProductName(String acName){
	
			productName = acName;	}
		

			public String getProductName(){
	
			return productName;	}
		
		
			public void setOn(boolean acOn){
			isOn = acOn;
			System.out.println("Status: ON");	}
		
		
			public boolean isOn(){
			return isOn;	}
	
			

			public void setTemperature(int temp){
		
			temperature = temp;	}
	
		
			public int getTemperature(){
			return temperature;}
				
			public void increaseTemperature(int incTemp){
			//if (incTemp > 30)
			temperature = incTemp ;
			}
		
			public void decreaseTemperature(int decTemp){
			//if(decTemp < 16)
			
			temperature = decTemp;	}
		




		}	