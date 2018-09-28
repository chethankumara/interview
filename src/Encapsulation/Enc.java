package Encapsulation;

public class Enc {

	public static void main(String[] args) {
		Car car=new Car();
		car.setName("Porsche");
		car.setTopSpeedMPH1(173.0d);
		
		System.out.println(car.getName() +"top speed in MPH is " +car.getTopSpeedMPH());
		System.out.println(car.getName() +"top speed in MPH is " +car.getTopSpeedMPH());

	}

}
