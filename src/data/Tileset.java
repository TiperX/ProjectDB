package data;

import java.awt.Graphics;
import java.awt.Image;

public class Tileset {
	private Image _img;
	private int _tileWidth;
	private int _tileHeight;
	private int _rows;
	private int _columns;
	private boolean water;
	private boolean lava;
	
	public Tileset(Image img, int tw, int th, int rows, int columns){
		_img = img;
		_tileWidth = tw;
		_tileHeight = th;
		_rows = rows;
		_columns = columns;
	}
	
	private void setWater(){
		lava = false;
		water = true;
	}
	
	private void setLava(){
		water = false;
		lava = true;
	}
	
	public Image getTileAt(int x, int y){
		Image img = Constants.STAGE.createImage(_tileWidth, _tileHeight);
		Graphics graph = img.getGraphics();
		graph.drawImage(_img, 0, 0, _tileWidth, _tileHeight, (x+1 < _columns ? x : _columns-2)*_tileWidth, (y+1 < _rows ? y : _rows-2)*_tileHeight, (x+1 < _columns ? x+1 : _columns-1)*_tileWidth, (y+1 < _rows ? y+1 : _rows-1)*_tileHeight, null);
		return img;
	}
}
