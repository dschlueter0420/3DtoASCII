
public class Mesh {

	private Point[] points;  // Array of 3d points
	
	public Mesh(Point[] points){
		this.points = points;
	}
	
	public void meshTo2D(View view){
		for(Point point: points){
			point.pTo2D(view);
		}
	}
	
	public Point[] getPoints(){
		return points;
	}
	
}
