package data;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;

public class Constants {
	public static Image image;
	public static Graphics graphics;
	
	public static int stageWidth = 960;
	public static int stageHeight = 640;
	public static int[] mouseLocation = new int[2];
	public static JFrame STAGE = new JFrame(){
									/**
									 * 
									 */
									private static final long serialVersionUID = -4191310025063605502L;

									public void paint(Graphics g){
										g.drawImage(Constants.image, 0, 0, stageWidth, stageHeight, null);
									}
								};
	public static boolean running = true;
	public static Dungeon dungeon;
}
