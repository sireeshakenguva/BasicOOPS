package com.bridgelabs.basic;

public class Democlass {

	
		// Execution thread
		public static void main(String[] args) { // start
		Car swift = new Car();
		swift.playMusic();

		Car centro = new Car();
		centro.playMusic(); // caller

		Calculator calculator = new Calculator(); // LIFO
		int sum = calculator.add(10, 20);
		System.out.println(sum);

		int mult = calculator.multiply(10, 20);
		System.out.println(mult);

		int mult2 = calculator.multiply(60, 20);
		System.out.println(mult2);

		Ship ship = new Ship();

		Flight indigo = new Flight(4);
		Flight indigo2 = new Flight();
		Flight indigo3 = new Flight(1, 2, 3);
		Flight indigo4 = new Flight(1, 2);

		} // end
		}

		class Calculator {

		// 1234 + 2345 =
		public int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
		}

		public int multiply(int num1, int num2) {
		int multiply = num1 * num2;
		return multiply;
		}
		}

		class Car {
		int wheels;
		int doors;
		int windows;
		int seats;


		// they cant return anything
		public void playMusic() {
		closeDoor();
		System.out.println("Play the music");
		}

		public void driveAutomatic() {
		System.out.println("Automatic");
		}

		public void openDoor() {
		System.out.println("open door");
		}

		public void closeDoor() {
		System.out.println("close door");
		}

		public void gps() {
		System.out.println("gps");
		}
		}

