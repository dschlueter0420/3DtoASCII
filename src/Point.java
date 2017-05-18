
public class Point {

	// The position of your point on the 3D plane
	public double x;
	public double y;
	public double z;
	// The position of your point on the 2D view
	public int x2D; 
	public int y2D;
	
	public Point(int x, int y, int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	/*public void pTo2D(View view){
		Point viewP = view.getPoint();
		x2D = (int) (((((viewP.z-z)-z)/view.getHeight())*(viewP.x-x))+x);
		y2D = (int) (((((viewP.z-z)-z)/view.getHeight())*(viewP.y-y))+y);
	}*/
	
	public void pTo2D(View view){
		Point viewP = view.getPoint();
		int factor = (int) (view.getFOV() / (view.getDist() + z));
		x2D = (int) (x * factor + view.getWidth() / 2);
		y2D = (int) (-y * factor + view.getHeight() / 2);
	}
	
}
