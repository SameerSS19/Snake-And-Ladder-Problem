package com.snakeandladder;

import java.util.Random;
public class SnakeandLadder 
{
	public static void main(String[] args) {
		System.out.println("Welcome in The Snake and Ladder Game");
		
		
		int start_position_firstplayer = 0 ;
		int start_position_secondplayer = 0 ;
		int dice = 0 ;
		int dice2 = 0;
		int option = 0 ;
		int option2 = 0 ;
		int count = 0;
		int countp = 0;
		
		while(start_position_firstplayer!=100 | start_position_secondplayer!=100)
		{
			dice = (int) ((Math.random() * 10) % 6 + 1);
			System.out.println("First player dice value : " +dice);
			
			option = (int) ((Math.random() * 10) % 3 + 1);
			System.out.println("First player option value : "+option);
			switch(option) {
				case 1: //For no play
					System.out.println("No moves");
					count++;
				break;
				case 2: //For ladder
					start_position_firstplayer = start_position_firstplayer + dice ;
					count++;
					if(start_position_firstplayer>100)
					{
						start_position_firstplayer = start_position_firstplayer - dice ;
						count++;
					}
					else
					{
						while(option==2)
						{
							dice = (int) ((Math.random() * 10) % 6 + 1);
							System.out.println(" First player  dice value : " +dice);
							//count++;
							option = (int) ((Math.random() * 10) % 3 + 1);
							System.out.println("First player  option value : "+option);
							switch(option) {
								case 1: //For no play
									System.out.println("No moves");
									count++;
								break;
								case 2: //For ladder
									start_position_firstplayer = start_position_firstplayer + dice ;
									count++;
									if(start_position_firstplayer>100)
									{
										start_position_firstplayer = start_position_firstplayer - dice ;
										
									}
									//System.out.println("Position of the First player : " + start_position_firstplayer);
									
									break;
								case 3: //For snake
										start_position_firstplayer = start_position_firstplayer - dice ;
										count++;
										if(start_position_firstplayer<0)
										{
											start_position_firstplayer=0;
											
										}
										//System.out.println("Position of the First player : " + start_position_firstplayer);
									break;
								}
							}
						
						}
					System.out.println("Position of the First player : " + start_position_firstplayer);
					
				break;
				case 3: //For snake
					start_position_firstplayer = start_position_firstplayer - dice ;
					count++;
					if(start_position_firstplayer<0)
					{
						start_position_firstplayer=0;
					}
					System.out.println("Position of the First player : " + start_position_firstplayer);
				break;
			}
			
			// For player 2
			
			dice2 = (int) ((Math.random() * 10) % 6 + 1);
			System.out.println("Second player  dice value : " +dice2);
			
			option2 = (int) ((Math.random() * 10) % 3 + 1);
			System.out.println("Second player  option value : "+option2);
			switch(option2) {
				case 1: //For no play
					System.out.println("No moves");
					countp++;
				break;
				case 2: //For ladder
					start_position_secondplayer = start_position_secondplayer + dice2 ;
					countp++;
					if(start_position_secondplayer>100)
					{
						start_position_secondplayer = start_position_secondplayer - dice2 ;
						countp++;
					}
					else
					{
						while(option2==2)
						{
							dice2 = (int) ((Math.random() * 10) % 6 + 1);
							System.out.println("Second player  dice value : " +dice2);
							//count++;
							option2 = (int) ((Math.random() * 10) % 3 + 1);
							System.out.println("Second player  option value : "+option2);
							switch(option2) {
								case 1: //For no play
									System.out.println("No moves");
									countp++;
								break;
								case 2: //For ladder
									start_position_secondplayer = start_position_secondplayer + dice2 ;
									countp++;
									if(start_position_secondplayer>100)
									{
										start_position_secondplayer = start_position_secondplayer - dice2 ;
										
									}
									//System.out.println("Position of the First  player : " + start_position_firstplayer);
									
									break;
								case 3: //For snake
										start_position_secondplayer = start_position_secondplayer - dice2 ;
										countp++;
										if(start_position_secondplayer<0)
										{
											start_position_secondplayer=0;
											
										}
										//System.out.println("Position of the First player : " + start_position_firstplayer);
									break;
								}
							}
						
						}
					System.out.println("Position of the Second player : " + start_position_secondplayer);
					
				break;
				case 3: //For snake
					start_position_secondplayer = start_position_secondplayer - dice2 ;
					countp++;
					if(start_position_secondplayer<0)
					{
						start_position_secondplayer=0;
					}
					System.out.println("Position of the Second player : " + start_position_secondplayer);
				break;
			}
			
		}
		
	System.out.println("Dice role to win the game for First player " + count);
	System.out.println("Dice role to win the game for  Second player " + countp);
		
		if(count>countp) {
			System.out.println("Second Player wins the match");
		}
		else {
			System.out.println("First Player wins the match");
		}
			
	}
}