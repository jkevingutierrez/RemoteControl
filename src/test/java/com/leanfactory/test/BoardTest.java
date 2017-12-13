package com.leanfactory.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.leanfactory.remote.core.Board;

public class BoardTest {
	
	private Board board;
	
	@Before
	public void setUp() {
		board = new Board(2, 2);
	}
	
	@Test
	public void testBoardInit() {
        assertEquals(board.getM(), 2);
        assertEquals(board.getN(), 2);
    }

}
