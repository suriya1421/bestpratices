package com.chainsys.bestPratices.coupled;

public class TestCar {

	public static void main(String[] args) {
     Car car=new Car();
     car.startCar();
     SteelWheel[] carWheels=car.getWheels();
     int length=carWheels.length;
     for(int i=0;i<length;i++) {
    	 System.out.println(carWheels[i].location);
     }
     
	}

}
