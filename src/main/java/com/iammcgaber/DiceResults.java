package com.iammcgaber;

public class DiceResults {
	
	private int[] points = new int[] {1000, 200, 300, 400, 500, 600};

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
	
	public int calculateScore(int[] score) {
		int totalScore = 0;
		for(int i = 0; i < 6; i++) {
			if(score[i] >= 3) {
				totalScore += points[i];
				score[i] -= 3;
			}
			
			if(i == 0 && score[i] != 0) {
				totalScore += score[i] * 100;
			}
			else if(i == 3 && score[i] != 0) {
				totalScore += score[i] * 40;
			}
		}
		return totalScore;
	}
}
