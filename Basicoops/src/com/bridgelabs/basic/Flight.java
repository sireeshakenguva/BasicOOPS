package com.bridgelabs.basic;

public class Flight {

	
	int wings;
		int wheels;
		int doors;
		int engines;

		public Flight() {

		}

		// to create an object of this class, we need to pass some value
		public Flight(int numberOfEngine) {
		engines = numberOfEngine;
		wings = 2;
		wheels = 8;
		doors = 6;
		}

		public Flight(int numberOfEngine, int wheels) {
		engines = numberOfEngine;
		wings = 2;
		this.wheels = wheels;
		doors = 6;
		}

		public Flight(int numberOfEngine, int wheels, int wings) {
		engines = numberOfEngine;
		this.wings = wings;
		this.wheels = wheels;
		doors = 6;
		}
		}


