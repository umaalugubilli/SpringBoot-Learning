package com.learningspring.learn_spring_framework;


public class GameRunner {
	
	GamingConsole game;
	
	public GameRunner(GamingConsole game){
		this.game = game;
	}
	
	public void run() {
		System.out.println("Running Game: "+ game);
		game.up();
		game.down();
		game.right();
		game.left();
	}

}
