package Encapsulation;

public class EncapsTest {

	public static void main(String[] args) {
		EncapsulationDemo obj=new EncapsulationDemo();
		obj.setEmpName("Mohan,stop");
		obj.setEmpAge(32);
		obj.setEmpSSN(450.0);
		
		System.out.println("Employee name:" +obj.getEmpName());
		System.out.println("Employee Age:" +obj.getEmpAge());
		System.out.println("Employee SSN:" +obj.getEmpSSN());

	}

}
