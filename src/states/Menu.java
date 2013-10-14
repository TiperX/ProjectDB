package states;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;


public class Menu extends State{
	
	public Menu(){
		
	}
	@Override
	public void update(long dt){
		StateManager.change(StateManager.gameStates.editor);
	}
	
	@Override
	public void draw(Graphics g){
		
	}
	
	@Override
	public void keyUp(KeyEvent ke){
		
	}
	
	@Override
	public void mouseMoved(MouseEvent me){
		
	}

	@Override
	public void mouseUp(MouseEvent me){
		
	}

	@Override
	public void mouseDown(MouseEvent me){
		
	}
}
