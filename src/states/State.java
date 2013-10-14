package states;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import data.Constants;

public class State {
	public State(){
		
	}
	
	public void update(long dt){
		
	}
	
	public void draw(Graphics g){
		
	}
	
	public void createImage(){
		Constants.image = Constants.STAGE.createImage(Constants.stageWidth, Constants.stageHeight);
		Constants.graphics = Constants.image.getGraphics();
	}

	public void keyDown(KeyEvent ke) {}

	public void keyUp(KeyEvent ke) {}
	
	public void mouseDragged(MouseEvent me) {}
	
	public void mouseMoved(MouseEvent me){}
	
	public void mouseUp(MouseEvent me){}
	
	public void mouseDown(MouseEvent me){}
}
