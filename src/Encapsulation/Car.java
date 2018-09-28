package Encapsulation;

public class Car {
	private String name;
	private double topspeed;
	
	public Car()
	{
		
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	
	public double getTopSpeedMPH(){
		return topspeed;
	}
	public void setTopSpeedMPH(double speedMPH){
		topspeed=speedMPH;
	}
	public double setTopSpeedMPH1(double speedMPH){
		return topspeed*1.609344;
		
	}
}
