package com.codewars;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class BallotsCounter {
	public static String getWinner(final List<String> listOfBallots) {
		Map<String, Integer> votesCountMap = new HashMap<String, Integer>();
		
		for (String name : listOfBallots) {
			if (!votesCountMap.containsKey(name)) {
				votesCountMap.put(name, 1);
			}
			else {
				votesCountMap.put(name, votesCountMap.get(name) + 1);
			}
		}
		
		int maxCount = 0;
		Entry<String, Integer> winnerEntry = null;
		
		for (Entry<String, Integer> entry : votesCountMap.entrySet()) {
			if (entry.getValue() > maxCount) {
				maxCount = entry.getValue();
				winnerEntry = entry;
			}
		}
		
		String winner = null;
		int duplicateMaxCount = 0;
		
		for (Entry<String, Integer> entry : votesCountMap.entrySet()) {
			if (entry.getValue() == maxCount) {
				duplicateMaxCount ++;
			}
		}
		
		if (duplicateMaxCount > 1) {
			return winner;
		}
		
		if (winnerEntry.getValue() > listOfBallots.size() / 2) {
			winner = winnerEntry.getKey();
		}
		
		return winner;
	}
}
