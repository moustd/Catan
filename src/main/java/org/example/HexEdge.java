package org.example;

public class HexEdge {
	private Hex hex1;
	private Hex hex2;

	public HexEdge(Hex hex1, Hex hex2) {
		this.hex1 = hex1;
		this.hex2 = hex2;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		HexEdge hexEdge = (HexEdge) o;

		return (hex1.equals(hexEdge.hex1) && hex2.equals(hexEdge.hex2)) || (hex2.equals(hexEdge.hex1) && hex1.equals(hexEdge.hex2));
	}

	@Override
	public String toString() {
		return "HexEdge{" +
				"hex1=" + hex1 +
				", hex2=" + hex2 +
				'}';
	}
}
