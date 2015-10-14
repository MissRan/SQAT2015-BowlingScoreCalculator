package org.unioulu.tol.sqat.bsc;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	private static final int MAX_FRAMES = 10;
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	public void addFrame(Frame frame){
		//to be implemented
		  for (int i = 0; i < MAX_FRAMES; i++) {
              frames.add(new Frame(i, i));
              
              }
	}
	
	
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
		
	}
	
	public int score(int frameCounter){
		//to be implemented
		if (frameCounter == 0){
			Frame curr = getCurrentFrame();
			return curr.score();
		}
		else{
			if(isLastFrame()&& isAllStrike()){
				int ALL_STRIKE_SCORE = 0;
				return ALL_STRIKE_SCORE;
		    }
			
			Frame curr=get.currCurrentFrame;
			Frame prev=get.prevpreviousFrame;
		}
		return 0;
	}
	
	private boolean isLastFrame() {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean isAllStrike() {
		// TODO Auto-generated method stub
		return false;
	}

	private Frame getCurrentFrame() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isNextFrameBonus(){
		//to be implemented
		return false;
	}
}
