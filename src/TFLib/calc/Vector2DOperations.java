package TFLib.calc;

public class Vector2DOperations {
	
	public static Vector2D add(Vector2D v, Vector2D w){
		return new Vector2D(v.dx() + w.dx(), v.dy() + w.dy());
	}
}
