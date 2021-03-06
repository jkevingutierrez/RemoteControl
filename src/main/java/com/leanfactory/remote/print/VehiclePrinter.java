package com.leanfactory.remote.print;

import com.leanfactory.remote.core.Vehicle;

public class VehiclePrinter extends Printer<Vehicle> {

	@Override
	public void print(Vehicle vehicle) {
		System.out.println("\n* Posición actual del vehículo: (" + vehicle.getX() + ", " + vehicle.getY() + ").");

		for (int i = vehicle.getBoard().getM(); i >= 0; i--) {
			for (int j = 0; j <= vehicle.getBoard().getM(); j++) {
				if (vehicle.getX() == j && vehicle.getY() == i) {
					System.out.print("  x  ");
				} else {
					System.out.print("  o  ");
				}
			}
			System.out.println("");
			if (i > 0) {
				System.out.println("");
			}
		}

		System.out.println("(0,0)");
		System.out.println("");

	}

}
