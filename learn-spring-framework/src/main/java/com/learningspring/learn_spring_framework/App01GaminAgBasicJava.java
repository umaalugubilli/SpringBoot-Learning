package com.learningspring.learn_spring_framework;

public class App01GaminAgBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var marioGame = new MarioGame();
		var pacMan = new PacMan();
		
		var gameRunner = new GameRunner(marioGame);
		var gameRunner1 = new GameRunner(pacMan);
		gameRunner.run();
		gameRunner1.run();

	}

}
