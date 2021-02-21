	public class Television{
		
		public Television(String tvName){
		televisionName = tvName;	}
		
		      

		private String televisionName;
		private int televisionVolume;
		private int televisionChannel;
		private boolean isOn;

	public void setOn(boolean tvOn){
		isOn = tvOn;  }

	public boolean isOn(){
		return isOn; }

	public void setTelevisionName(String tvName){
		televisionName = tvName; }

	public String getTelevisionName(){
		return televisionName; }

	public void setTelevisionVolume(int teleVolume){
		televisionVolume = teleVolume; 
		 }

	public int getTelevisionVolume(){
		return televisionVolume; }
	
	public int increaseTelevisionVolume(){
		
		return televisionVolume; }

	public int decreaseTelevisionVolume(){
		 
		return televisionVolume;      }

	public void setTelevisionChannel(int teleChannel){
		televisionChannel = teleChannel; }

	public int getTelevisionChannel(){
		return televisionChannel; }

	public int increaseTelevisionChannel(){
		
		return televisionChannel; }

	public int decreaseTelevisionChannel(){
		
		return televisionChannel; }

	
	}