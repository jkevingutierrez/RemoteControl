package com.leanfactory.test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.leanfactory.remote.helpers.StringHelper;

public class StringHelperTest {

	private String s;

	@Before
	public void setUp() {
		s = "";
	}

	@Test
	public void testHasAValidSyntax() {
		assertTrue(StringHelper.hasAValidSyntax(s));
	}

	@Test
	public void testHasOneCommand() {
		assertTrue(StringHelper.hasOneCommand(s));
	}

	@Test
	public void testHasMultipleCommands() {
		assertTrue(StringHelper.hasMultipleCommands(s));
	}

	public void testGenerateCommand(String s) {
		assertTrue(false);
	}

	public void testGenerateMultipleCommands(String s) {
		assertTrue(false);
	}

}
