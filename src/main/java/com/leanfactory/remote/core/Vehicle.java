package com.leanfactory.remote.core;

public class Vehicle {

	private int x;
	private int y;

	private int maxX;
	private int maxY;

	public Vehicle(int maxX, int maxY) {
		if (maxX > 0 && maxY > 0) {
			this.maxX = maxX;
			this.maxY = maxY;
			System.out.println("* Se ha creado un nuevo vehículo *");
		} else {
			throw new IllegalArgumentException("The x and y upper limit should be greater than 0");
		}
	}

	public boolean moveX(int x) {
		try {
			this.setX(x);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean moveY(int y) {
		try {
			this.setY(y);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean move(int x, int y) {
		try {
			this.setX(x);
			this.setY(y);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		if (x >= 0 && x <= this.getMaxX()) {
			this.x = x;
			printPosition();
		} else {
			throw new IllegalArgumentException("Out of bound");
		}
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		if (y >= 0 && y <= this.getMaxY()) {
			this.y = y;
			printPosition();
		} else {
			throw new IllegalArgumentException("Out of bound");
		}
	}

	public int getMaxX() {
		return maxX;
	}

	public void setMaxX(int maxX) {
		if (maxX > 0) {
			this.maxX = maxX;
		} else {
			throw new IllegalArgumentException("The X upper limit should be greater than 0");
		}
	}

	public int getMaxY() {
		return maxY;
	}

	public void setMaxY(int maxY) {
		if (maxY > 0) {
			this.maxY = maxY;
		} else {
			throw new IllegalArgumentException("The Y upper limit should be greater than 0");
		}
	}

	private void printPosition() {
		System.out.println("* Posición actual del vehículo: (" + this.x + ", " + this.y + ").");

		for (int i = getMaxY(); i >= 0; i--) {
			for (int j = 0; j <= getMaxX(); j++) {
				if (this.x == j && this.y == i) {
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
