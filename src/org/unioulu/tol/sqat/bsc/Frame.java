package org.unioulu.tol.sqat.bsc;

public class Frame {
	private int firstThrow;
	private int secondThrow;
	
	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	//the score of a single frame

	public int score(){
		//to be implemented
	int[] score = new int[24];
	static {
		for (int i = 0; i<socre.length; i++){
			score [i] =-2;
		}
	}
			
		
		return 0;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(int pins){
		//to be implemented
		if (firstThrow && pins == 10)
		
		
		return false ;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		//to be implemented
		if ()
		return false;
	}

	//return whether this is the last frame of the match
	public boolean isLastFrame(){
		//to be implemented
		return false;
	}

	//bonus throws
	public int bonus(){
		//to be implemented
		return 0;
	}
}
