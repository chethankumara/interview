package Encapsulation;

public class EncapsulationDemo {
	private double ssn;
	private String empName;
	private int empAge;
	
	//Getter and setter method
	public double getEmpSSN(){
		return ssn;
	}
	public String getEmpName(){
		return empName;
	}
	public int getEmpAge(){
		return empAge;
	}
	public void setEmpAge(int newValue){
		empAge=newValue;
	}
	public void setEmpName(String newValue){
		empName=newValue;
	}
	public void setEmpSSN(double newValue){
		ssn=newValue;
	}

}
