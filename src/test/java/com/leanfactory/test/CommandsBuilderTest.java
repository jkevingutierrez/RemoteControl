package com.leanfactory.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import com.leanfactory.remote.core.Command;
import com.leanfactory.remote.core.CommandsBuilder;
import com.leanfactory.remote.core.Direction;

public class CommandsBuilderTest {

	public void testBuildCommands() {
		List<Command> commands = CommandsBuilder.buildCommands("2, n");
		assertEquals(commands.size(), 1);
		assertEquals(commands.get(0).getDirection(), Direction.N);
		assertEquals(commands.get(0).getDistance(), 2);

		commands = CommandsBuilder.buildCommands("3, s");
		assertEquals(commands.size(), 1);
		assertEquals(commands.get(0).getDirection(), Direction.S);
		assertEquals(commands.get(0).getDistance(), 3);

		commands = CommandsBuilder.buildCommands("2,n;3,s;4,e;5,o");
		assertEquals(commands.size(), 4);
		assertEquals(commands.get(0).getDirection(), Direction.N);
		assertEquals(commands.get(0).getDistance(), 2);
		assertEquals(commands.get(1).getDirection(), Direction.S);
		assertEquals(commands.get(1).getDistance(), 3);
		assertEquals(commands.get(2).getDirection(), Direction.E);
		assertEquals(commands.get(2).getDistance(), 4);
		assertEquals(commands.get(3).getDirection(), Direction.O);
		assertEquals(commands.get(3).getDistance(), 5);
	}

}
