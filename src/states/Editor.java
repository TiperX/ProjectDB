package states;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import data.Constants;

import states.substates.editor.LayoutEditor;

public class Editor extends State {
	
	private enum subStates{
		layout, room;
	}
	
	private ArrayList<State> subStateList;
	
	public Editor(){
		subStateList.add(new LayoutEditor(Constants.dungeon));
	}
	

	@Override
	public void update(long dt){
		
	}
	
	@Override
	public void draw(Graphics g){
		
	}
	
	@Override
	public void keyUp(KeyEvent ke){
		
	}
	
	@Override
	public void mouseDragged(MouseEvent me){
		
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
