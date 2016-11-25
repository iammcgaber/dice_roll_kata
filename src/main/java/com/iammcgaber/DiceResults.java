package com.iammcgaber;

public class DiceResults {

	public int[] getRollResults() {
		int[] rollResults = new int[5];
		for(int i = 0; i < rollResults.length; i++) {
			rollResults[i] = new Dice().rollDice();
		}
		return rollResults;
	}
	
	public int[] calculateCount(int[] rollResults) {
		int[] scoreArray = new int[6];
		for(int i = 0; i < 5; i++) {
			scoreArray[rollResults[i] - 1]++;
		}
		return scoreArray;
	}
	
}
