package com.snakeandladder;

public class SnakeandLadder {
	 
		public static void main(String[] args) {
			int start_position_firstplayer = 0;
			int dice = 0;
			int option = 0;
			
			System.out.println("Welcome to The Snake and Ladder Game ");
			
			dice = (int) ((Math.random() * 10) % 6 + 1);
			System.out.println("Dice value:"+ dice);
			
			option = (int) ((Math.random() * 10) % 3 + 1);
			System.out.println("Dice value:"+option);
			switch(option) 
			{
				case 0:
					System.out.println("No Play");
					break;
				case 1:
					start_position_firstplayer = start_position_firstplayer + dice;
					break;
				case 2:
					start_position_firstplayer = start_position_firstplayer - dice;
					break;
			}
	}

}