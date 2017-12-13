package com.leanfactory.remote.core;

public class Board {
	
	private int n;
	private int m;
	
	public Board(int n, int m) {
		this.setN(n);
		this.setM(m);
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

}
