package com.learningspring.learn_spring_framework;

public class MarioGame implements GamingConsole {
	
	public void up() {
		System.out.println("Jump");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Mario Down");
		
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("Go Back");
		
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("Move Forward");
		
	}
	
}
