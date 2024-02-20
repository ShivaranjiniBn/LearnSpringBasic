package com.inminutes.learnspringframework;

import com.inminutes.learnspringframework.game.GameRunner;
import com.inminutes.learnspringframework.game.MarioGame;
import com.inminutes.learnspringframework.game.PackmanGame;
import com.inminutes.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PackmanGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
		
		
	}

}
