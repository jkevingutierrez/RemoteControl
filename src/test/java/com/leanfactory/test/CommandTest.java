package com.leanfactory.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.leanfactory.remote.core.Command;
import com.leanfactory.remote.core.Direction;
import com.leanfactory.remote.core.Vehicle;

public class CommandTest {

	private Command command;

	@Before
	public void setUp() {
		command = new Command(Direction.N, 2);
	}

	@Test
	public void testBoardInit() {
		assertEquals(command.getDirection(), Direction.N);
		assertEquals(command.getDistance(), 2);
	}

	@Test
	public void testExecuteCommand() {
		Vehicle vehicle = new Vehicle(10, 10);
		assertTrue(command.execute(vehicle));

		assertEquals(vehicle.getX(), 0);
		assertEquals(vehicle.getY(), 2);
	}
}
