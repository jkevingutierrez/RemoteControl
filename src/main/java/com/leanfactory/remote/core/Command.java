package com.leanfactory.remote.core;

public class Command {
	int distance;

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	Direction direction;

	public Command(Direction direction, int distance) {
		this.distance = distance;
		this.direction = direction;
	}

	public boolean execute(Vehicle vehicle) {
		switch (this.direction) {
		case N:
			return vehicle.moveY(vehicle.getY() + distance);
		case S:
			return vehicle.moveY(vehicle.getY() - distance);
		case E:
			return vehicle.moveX(vehicle.getX() + distance);
		case O:
			return vehicle.moveX(vehicle.getX() - distance);
		default:
			return false;
		}
	}
}
