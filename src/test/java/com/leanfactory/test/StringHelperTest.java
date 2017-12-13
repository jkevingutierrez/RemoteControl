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

	public void testGenerateCommands() {
		assertTrue(false);
	}

}
