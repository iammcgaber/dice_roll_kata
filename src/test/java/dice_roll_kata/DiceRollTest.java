package dice_roll_kata;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.iammcgaber.Dice;
import com.iammcgaber.DiceResults;

public class DiceRollTest {

	Dice dice;
	DiceResults diceResults;
	
	@Before
	public void setup() {
		dice = new Dice();
		diceResults = new DiceResults();
	}
	
	@Test
	public void test_objects_are_not_null() {
		Assert.assertNotNull(dice);
		Assert.assertNotNull(diceResults);
	}
	
	@Test
	public void test_dice_roll_not_null () {
		Assert.assertNotNull(dice.rollDice());
	}
	
	@Test
	public void test_dice_roll_result_greater_than_0_and_less_than_7() {
		for(int i = 0; i < 10; i++) {
			int random = dice.rollDice();
			int high = 6;
			int low = 1;
			Assert.assertTrue("Error, random is too high", high >= random);
			Assert.assertTrue("Error, random is too low", low <= random);
		}
	}
	
	@Test
	public void test_dice_roll_result_array_is_populated_correctly() {
		int[] results = diceResults.getRollResults();
		for(int i = 0; i < results.length; i++) {
			Assert.assertTrue("Error, the result is zero. It should be between 1 and 6", results[i] != 0);
		}
	}
	
	@Test
	public void test_all_dice_are_counted() {
		int total = 0;
		int[] results = diceResults.getRollResults();
		int[] score = diceResults.calculateCount(results);
		for(int i = 0; i < score.length; i++) {
			if(score[i] != 0) {
				total += score[i];
			}
		}
		Assert.assertEquals(5, total);
	}
	
	@Test
	public void test_roll_1_2_3_4_5_returns_140() {
		int[] testRolls = diceResults.calculateCount(new int[] {1, 2, 3, 4, 5});
		Assert.assertEquals(140, diceResults.calculateScore(testRolls));
	}

}
