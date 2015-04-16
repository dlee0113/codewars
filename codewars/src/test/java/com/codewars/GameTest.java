package com.codewars;

import org.junit.Assert;
import org.junit.Test;

public class GameTest {
	private Game game = new Game();

	@Test
	public void testGame() {
		Assert.assertEquals(
				"small deck",
				"Steve wins 2 to 1",
				game.winner(new String[] { "A", "7", "8" }, new String[] { "K", "5", "9" }));

		Assert.assertEquals(
				"small deck", 
				"Tie",
				game.winner(new String[] { "T" }, new String[] { "T" }));
		
		Assert.assertEquals(
				"medium deck",
				"Josh wins 4 to 3",
				game.winner(new String[] { "K", "2", "4", "5", "4", "3", "2", "K", "A", "T" }, new String[] { "Q", "3", "4", "6", "4", "3", "5", "A", "8", "7" }));
	}
}
