package com.leanfactory.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import com.leanfactory.remote.core.Command;
import com.leanfactory.remote.core.Direction;
import com.leanfactory.remote.helpers.StringHelper;

public class StringHelperTest {

	@Test
	public void testHasAValidSyntax() {
		// Single commands using all directions
		assertTrue(StringHelper.hasAValidSyntax("2,n"));
		assertTrue(StringHelper.hasAValidSyntax("2,s"));
		assertTrue(StringHelper.hasAValidSyntax("2,e"));
		assertTrue(StringHelper.hasAValidSyntax("2,o"));

		// Multiple commands
		assertTrue(StringHelper.hasAValidSyntax("2,n;3,s;4,e;5,o"));

		// If the structure is correct, it should be valid with multiple spaces
		assertTrue(StringHelper.hasAValidSyntax("2, o"));
		assertTrue(StringHelper.hasAValidSyntax("2,n; 3,s; 4,e; 5,o"));
		assertTrue(StringHelper.hasAValidSyntax("2, n;  3, s;  4, e;  5, o"));
	}

	@Test
	public void testHasAnInvalidSyntax() {
		// Empty
		assertFalse(StringHelper.hasAValidSyntax(""));

		// null
		assertFalse(StringHelper.hasAValidSyntax(null));

		// Missing character in single commands
		assertFalse(StringHelper.hasAValidSyntax("2"));
		assertFalse(StringHelper.hasAValidSyntax("2,n;"));
		assertFalse(StringHelper.hasAValidSyntax("2,"));
		assertFalse(StringHelper.hasAValidSyntax("2n"));

		// Using spaces to separate instead of ,
		assertFalse(StringHelper.hasAValidSyntax("2 n"));

		// Missing character in multiple commands
		assertFalse(StringHelper.hasAValidSyntax("2n;2,n"));
		assertFalse(StringHelper.hasAValidSyntax("2;3,n"));

		// Separate commands with ,
		assertFalse(StringHelper.hasAValidSyntax("2,n,3,s"));
		assertFalse(StringHelper.hasAValidSyntax("2,n,3,s,"));
		assertFalse(StringHelper.hasAValidSyntax("2,n,3,s;"));

		// Ends with ; or ,
		assertFalse(StringHelper.hasAValidSyntax("2,n;3,s;4,e;5,o;"));
		assertFalse(StringHelper.hasAValidSyntax("2,n;3,s;4,e;5,o,"));

		// Starts with ; or ,
		assertFalse(StringHelper.hasAValidSyntax(";2,n;3,s;4,e;5,o"));
		assertFalse(StringHelper.hasAValidSyntax(",2,n;3,s;4,e;5,o"));
	}

	public void testGenerateCommands() {
		List<Command> commands = StringHelper.generateCommands("2, n");
		assertEquals(commands.size(), 1);
		assertEquals(commands.get(0).getDirection(), Direction.N);
		assertEquals(commands.get(0).getDistance(), 2);

		commands = StringHelper.generateCommands("3, s");
		assertEquals(commands.size(), 1);
		assertEquals(commands.get(0).getDirection(), Direction.S);
		assertEquals(commands.get(0).getDistance(), 3);

		commands = StringHelper.generateCommands("2,n;3,s;4,e;5,o");
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
