package com.snakeandladder;

import java.util.Random;
public class SnakeandLadder 
	
	{
	    public static final int startPosition = 0;
	    public static final int winningPosition = 100;
	    public static int position=0;
	    static int diceRollCount=0;

	    public static int dice() 
	    {
		    diceRollCount++;
	        Random random=new Random();
	        int value = random.nextInt(6)+1;
		return value;
	     }
	     public static int option() 
	     {
		 Random random=new Random();
	         int value1 = random.nextInt(3);
		 return  value1 ;
	      }

	      static void play() 
	      {

	       while(position < winningPosition) 
	       {
	          int playValue = option();
	          int diceRollValue = dice();
	          System.out.println("dice count is: " + diceRollCount);
		  System.out.println("~~~ Dice rolled value: " +diceRollValue);


	          if(playValue==0) 
	          {
	             System.out.println("No play");
	             position = position;
	          }
	          else if(playValue==1)
	          {
	             System.out.println("Got Ladder");
	             position = position += diceRollValue;
	             if(position > 100) {
	               position -= diceRollValue;
		     }
	          }
	          else if(playValue==2)
	          {
	             System.out.println("Snake Attack");
	             position = position -= diceRollValue;
	             if(position < 0) 
	              {
			position=0;
	               }
	          }
	          System.out.println("new position is : " +position);
	          if(position == 100) 
	          {
		      System.out.println("congratulations player reached to winning position");
		      System.out.println("Game ended");
	              diceRollCount=0;
		  }
	        }
	     }
	     public static void main(String[] args){
	         System.out.println("Welcome to Snake and ladder game");
	         System.out.println("Start position is: "  + startPosition);
	         System.out.println("Winning position is: "  + winningPosition);
	         System.out.println("initial Dice roll count is: " + diceRollCount);
	         
	         play(); 
	     }
	}