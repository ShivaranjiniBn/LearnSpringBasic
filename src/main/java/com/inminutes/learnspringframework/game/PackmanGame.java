package com.inminutes.learnspringframework.game;

public class PackmanGame implements GamingConsole{

	@Override
	public void up() {
		System.out.println("pack up");
		
	}

	@Override
	public void down() {
		System.out.println("pack down");
		
	}

	@Override
	public void left() {
		System.out.println("pack left");
		
	}

	@Override
	public void right() {
		System.out.println("pack right");
		
	}

}
