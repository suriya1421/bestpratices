package com.chainsys.estPratices.decoupled;

public class WoodenWheel implements Iwheel{
	public static String location;
	public void rotate() {
		 System.out.println("wooden wheel rotated");
	 }
	 public void stopRotation() {
		 System.out.println("wooden wheel stopped");
	 }

}
