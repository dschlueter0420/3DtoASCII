
public class Point {

	// The position of your point on the 3D plane
	public int x;
	public int y;
	public int z;
	// The position of your point on the 2D view
	public int x2D; 
	public int y2D;
	
	public Point(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void pTo2D(View view){
		Point viewP = view.getPoint();
		x2D = ((((viewP.z-z)-z)/view.getHeight())*(viewP.x-x))+x;
		y2D = ((((viewP.z-z)-z)/view.getHeight())*(viewP.y-y))+y;
	}
	
}
