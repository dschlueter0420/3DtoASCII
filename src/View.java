
public class View {

	private int   width;  // Width of screen
	private int   height; // Height of screen
	private int   dist;   // Distance of camera from plane
	private Point point;  // View point of the camera
	
	public View(int width, int height, int dist, Point point){
		this.width  = width;
		this.height = height;
		this.dist   = dist;
		this.point  = point;
	}

	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getDist() {
		return dist;
	}

	public Point getPoint() {
		return point;
	}
	
}
