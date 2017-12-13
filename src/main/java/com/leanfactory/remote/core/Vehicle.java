package com.leanfactory.remote.core;

import com.leanfactory.remote.print.Printer;
import com.leanfactory.remote.print.VehiclePrinter;

public class Vehicle {

	private int x;
	private int y;

	private Board board;
	private final Printer<Vehicle> printer = new VehiclePrinter();

	public Vehicle(Board board) {
		this.setBoard(board);
		System.out.println("* Se ha creado un nuevo vehículo *");
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
		if (x >= 0 && x <= this.getBoard().getN()) {
			this.x = x;
			printer.print(this);
		} else {
			throw new IllegalArgumentException("Out of bound");
		}
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		if (y >= 0 && y <= this.getBoard().getM()) {
			this.y = y;
			printer.print(this);
		} else {
			throw new IllegalArgumentException("Out of bound");
		}
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}
}
