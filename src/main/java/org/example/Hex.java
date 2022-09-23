package org.example;

public class Hex {
	private int q;
	private int r;
	private int s;

	public Hex(int q, int r, int s) {
		this.q = q;
		this.r = r;
		this.s = s;
	}

	public int getQ() {
		return q;
	}

	public void setQ(int q) {
		this.q = q;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getS() {
		return s;
	}

	public void setS(int s) {
		this.s = s;
	}

	public boolean equals(int q, int r, int s) {
		return this.q == q && this.r == r && this.s == s;
	}

	public boolean equals(Hex hex) {
		return this.q == hex.q && this.r == hex.r && this.s == hex.s;
	}

	@Override
	public String toString() {
		return "Hex{" +
				"q=" + q +
				", r=" + r +
				", s=" + s +
				'}';
	}
}
