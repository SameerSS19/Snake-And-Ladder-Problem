package com.snakeandladder;

import java.util.Random;
public class SnakeandLadder 
{
public static void main(String[] args) {
	System.out.println("Welcome in The Snake and Ladder Game ");
	
	
	int start_position_firstplayer = 0 ;
	int dice = 0 ;
	int option = 0 ;
	int count=0;
	while(start_position_firstplayer!= 100)
	{
		dice = (int) ((Math.random() * 10) % 6 + 1);
		System.out.println("dice value"+dice);
		count++;
		option = (int) ((Math.random() * 10) % 3 + 1);
		System.out.println("option value"+option);
		switch(option) {
			case 1: //For no play
				System.out.println("No moves");
			break;
			case 2: //For ladder
				start_position_firstplayer = start_position_firstplayer + dice ;
				if(start_position_firstplayer>100)
				{
					start_position_firstplayer = start_position_firstplayer - dice ;
				}
				System.out.println("Position of the player" + start_position_firstplayer);
			break;
			case 3: //For snake
				start_position_firstplayer = start_position_firstplayer - dice ;
				if(start_position_firstplayer<0)
				{
					start_position_firstplayer=0;
				}
				System.out.println("Position of the player" + start_position_firstplayer);
			break;
		}
	}
	System.out.println("Dice Role to Win the Game is " + count);
}

}