package com.leanfactory.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.leanfactory.remote.core.Board;
import com.leanfactory.remote.core.Vehicle;

public class VehicleTest {

	private Vehicle vehicle;

	@Before
	public void setUp() {
		Board board = new Board(10, 10);
		vehicle = new Vehicle(board);
	}

	@Test
	public void testVehicleInit() {
		assertEquals(vehicle.getX(), 0);
		assertEquals(vehicle.getY(), 0);
	}

	@Test
	public void testMove() {
		assertTrue(vehicle.move(5, 5));
		assertEquals(vehicle.getX(), 5);
		assertEquals(vehicle.getY(), 5);
	}

	@Test
	public void testMoveX() {
		assertTrue(vehicle.moveX(5));
		assertEquals(vehicle.getX(), 5);
		assertEquals(vehicle.getY(), 0);
	}

	@Test
	public void testMoveY() {
		assertTrue(vehicle.moveY(5));
		assertEquals(vehicle.getX(), 0);
		assertEquals(vehicle.getY(), 5);
	}

	@Test
	public void testMultipleMoves() {
		assertTrue(vehicle.moveY(1));
		assertTrue(vehicle.moveY(2));
		assertTrue(vehicle.moveY(3));
		assertTrue(vehicle.moveX(1));
		assertTrue(vehicle.moveX(2));
		assertTrue(vehicle.moveX(3));
		assertEquals(vehicle.getX(), 3);
		assertEquals(vehicle.getY(), 3);
	}

	@Test
	public void testMoveOutOfRange() {
		assertFalse(vehicle.move(11, 0));
		assertFalse(vehicle.move(0, 11));
		assertFalse(vehicle.move(11, 11));

		assertFalse(vehicle.move(-1, 0));
		assertFalse(vehicle.move(0, -1));
		assertFalse(vehicle.move(-1, -1));

		assertFalse(vehicle.moveX(11));
		assertFalse(vehicle.moveX(-1));

		assertFalse(vehicle.moveY(11));
		assertFalse(vehicle.moveY(-1));
	}

}
