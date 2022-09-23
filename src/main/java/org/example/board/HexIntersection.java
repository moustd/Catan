package org.example.board;

public class HexIntersection {
	private Hex hex1;
	private Hex hex2;
	private Hex hex3;

	public HexIntersection(Hex hex1, Hex hex2, Hex hex3) {
		this.hex1 = hex1;
		this.hex2 = hex2;
		this.hex3 = hex3;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		HexIntersection hexEdge = (HexIntersection) o;

		return (hex1.equals(hexEdge.hex1) && hex2.equals(hexEdge.hex2) && hex3.equals(hexEdge.hex3))
				|| (hex2.equals(hexEdge.hex1) && hex3.equals(hexEdge.hex2) && hex1.equals(hexEdge.hex3))
				|| (hex3.equals(hexEdge.hex1) && hex1.equals(hexEdge.hex2) && hex2.equals(hexEdge.hex3));
	}

	@Override
	public String toString() {
		return "HexEdge{" +
				"hex1=" + hex1 +
				", hex2=" + hex2 +
				'}';
	}
}
