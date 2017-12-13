package com.leanfactory.remote.core;

public class Board {

	private int n;
	private int m;

	public Board(int n, int m) {
		if (n > 0 && m > 0) {
			this.setN(n);
			this.setM(m);
			System.out.println("* Se ha creado un tablero de (" + this.n + " x " + this.m + ") *");
		} else {
			throw new IllegalArgumentException("n and m should be greater than 0");
		}
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
