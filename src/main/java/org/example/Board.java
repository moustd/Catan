package org.example;


//
//          | 1 ||  2 ||  3 |
//         -------------------
//      |  4 ||  5 ||  6 ||  7 |
//     --------------------------
//   |  8 ||  9 || 10 || 11 || 12 |
//     --------------------------
//      | 13 || 14 || 15 || 16 |
//         --------------------
//          | 17 || 18 || 19 |
//


import java.util.ArrayList;
import java.util.List;

public class Board {
	List<Hex> hexList;
	List<HexEdge> hexEdgeList;

	public Board(int size) {
		hexList = new ArrayList<>();
		hexEdgeList = new ArrayList<>();
		for (int q = -size; q <= size; q++) {
			for (int r = -size; r <= size; r++) {
				for (int s = -size; s <= size; s++) {
					int i = q + r + s;
					if (i == 0) {
						hexList.add(new Hex(q, r, s));
					}
				}
			}
		}
		for (Hex hex1 : hexList) {
			for (Hex hex2 : hexList) {
				if (hex1.getQ() == hex2.getQ() || hex1.getR() == hex2.getR() || hex1.getS() == hex2.getS()) {
					hexEdgeList.add(new HexEdge(hex1, hex2));
				}
			}
		}

	}

	public Hex getHex(int q, int r, int s) {
		return hexList.stream().filter(hex -> hex.equals(q, r, s)).findFirst().orElse(null);
	}

}
