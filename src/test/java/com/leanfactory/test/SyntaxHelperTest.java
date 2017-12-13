package com.leanfactory.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.leanfactory.remote.helpers.SyntaxHelper;

public class SyntaxHelperTest {

	@Test
	public void testHasAValidSyntax() {
		// Single commands using all directions
		assertTrue(SyntaxHelper.hasAValidSyntax("2,n"));
		assertTrue(SyntaxHelper.hasAValidSyntax("2,s"));
		assertTrue(SyntaxHelper.hasAValidSyntax("2,e"));
		assertTrue(SyntaxHelper.hasAValidSyntax("2,o"));

		// Multiple commands
		assertTrue(SyntaxHelper.hasAValidSyntax("2,n;3,s;4,e;5,o"));

		// If the structure is correct, it should be valid with multiple spaces
		assertTrue(SyntaxHelper.hasAValidSyntax("2, o"));
		assertTrue(SyntaxHelper.hasAValidSyntax("2,n; 3,s; 4,e; 5,o"));
		assertTrue(SyntaxHelper.hasAValidSyntax("2, n;  3, s;  4, e;  5, o"));
	}

	@Test
	public void testHasAnInvalidSyntax() {
		// Empty
		assertFalse(SyntaxHelper.hasAValidSyntax(""));

		// null
		assertFalse(SyntaxHelper.hasAValidSyntax(null));

		// Missing character in single commands
		assertFalse(SyntaxHelper.hasAValidSyntax("2"));
		assertFalse(SyntaxHelper.hasAValidSyntax("2,n;"));
		assertFalse(SyntaxHelper.hasAValidSyntax("2,"));
		assertFalse(SyntaxHelper.hasAValidSyntax("2n"));

		// Using spaces to separate instead of ,
		assertFalse(SyntaxHelper.hasAValidSyntax("2 n"));

		// Missing character in multiple commands
		assertFalse(SyntaxHelper.hasAValidSyntax("2n;2,n"));
		assertFalse(SyntaxHelper.hasAValidSyntax("2;3,n"));

		// Separate commands with ,
		assertFalse(SyntaxHelper.hasAValidSyntax("2,n,3,s"));
		assertFalse(SyntaxHelper.hasAValidSyntax("2,n,3,s,"));
		assertFalse(SyntaxHelper.hasAValidSyntax("2,n,3,s;"));

		// Ends with ; or ,
		assertFalse(SyntaxHelper.hasAValidSyntax("2,n;3,s;4,e;5,o;"));
		assertFalse(SyntaxHelper.hasAValidSyntax("2,n;3,s;4,e;5,o,"));

		// Starts with ; or ,
		assertFalse(SyntaxHelper.hasAValidSyntax(";2,n;3,s;4,e;5,o"));
		assertFalse(SyntaxHelper.hasAValidSyntax(",2,n;3,s;4,e;5,o"));
	}

}
