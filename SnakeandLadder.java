package com.snakeandladder;

public class SnakeandLadder {
	public static final int startPosition = 0;
	public static int dice = (int) ((Math.random() * 10) % 6 + 1);
	
		public static void main(String[] args) {
			System.out.println("Welcome to The Snake and Ladder Game ");
			System.out.println(dice);
	}

}