
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
	
	public boolean pOnMesh(int x, int y){
		for(Point point: points){
			if(point.x2D == x && point.y2D == y){
				return true;
			}
		}
		return false;
	}
	
	public void rotate(double rX, double rY, double rZ){
		for(Point point: points){
			// Rotate on x-axis
			if(rX > 0){
				point.y = ((point.y*Math.cos(rX)) - (point.z*Math.sin(rX)));
				point.z = ((point.y*Math.sin(rX)) + (point.z*Math.cos(rX)));
			}
			// Rotate on y-axis
			if(rY > 0){
				point.z = ((point.z*Math.cos(rY)) - (point.x*Math.sin(rY)));
				point.x = ((point.z*Math.sin(rY)) + (point.x*Math.cos(rY)));
			}
			// Rotate on z-axis
			if(rZ > 0){
				point.x = ((point.x*Math.cos(rZ)) - (point.y*Math.sin(rZ)));
				point.y = ((point.x*Math.sin(rZ)) + (point.y*Math.cos(rZ)));
			}
		}
	}
	
	public Point[] getPoints(){
		return points;
	}
	
}
