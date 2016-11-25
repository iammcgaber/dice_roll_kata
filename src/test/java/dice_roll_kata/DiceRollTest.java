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

}
