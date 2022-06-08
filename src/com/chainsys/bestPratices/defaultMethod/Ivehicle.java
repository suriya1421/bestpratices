package com.chainsys.bestPratices.defaultMethod;

public interface Ivehicle {
          void start();
          default void move() {
              System.out.println("vehicle is moving");
          }
}
   class Car implements Ivehicle
   {
       @Override
       public void start() {
           System.out.println("car is moving");
       }
   }
   class Bike implements Ivehicle
   {
       @Override
       public void start() {
           System.out.println("bike is moving");
       }
   }