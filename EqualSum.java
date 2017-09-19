package com.fortinet;

import java.util.List;

public class EqualSum {
	public boolean separate(List<Integer> list, int k) {
		// Your resolution 
		// Time complexity:  O(total*n)
		// Space complexity: O(total*n)
		int total = 0;
		int i, j;

		// Caculcate sun of all elements
		for (i = 0; i < k; i++) {
			total += list.get(i);
		}

		if (total % 2 != 0) {
			return false;
		}

		boolean seperate[][] = new boolean[total / 2 + 1][k + 1];

		// initialize top row as true
		for (i = 0; i <= k; i++) {
			seperate[0][i] = true;
		}

		// initialize leftmost column, except seperate[0][0], as 0
		for (i = 1; i <= total / 2; i++) {
			seperate[i][0] = false;
		}

		// Fill the seperateition table in botton up manner
		for (i = 1; i <= total / 2; i++) {
			for (j = 1; j <= k; j++) {
				seperate[i][j] = seperate[i][j - 1];
				if (i >= list.get(j-1)) {
					seperate[i][j] = seperate[i][j] || seperate[i - list.get(j-1)][j - 1];
				}
			}
		}

		return seperate[total / 2][k];
	}
}

