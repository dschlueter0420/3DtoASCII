
public class Main {

	public static void main(String[] args) throws InterruptedException{
	
		View     view   = new View(100,100,1,new Point(0,0,-6), 10);
		Point[]  points = {new Point(-4, -4, -4),new Point(4, 4, -4),new Point(4, -4, -4),new Point(-4, 4, -4),new Point(-4, -4, 4),new Point(4, 4, 4),new Point(4, -4, 4),new Point(-4, 4, 4)};
		Mesh     mesh   = new Mesh(points);
		char[][] graph  = new char[view.getHeight()][view.getWidth()];
		double   angle  = 0;
		
		mesh.meshTo2D(view);
		
		while(true){
			
			for(int y=0; y<graph.length; y++){
				for(int x=0; x<graph[0].length; x++){
					graph[y][x] = '.';
					if(mesh.pOnMesh(x,y)){
						graph[y][x] = '#';
					}
				}
			}
			/*
			int count = 0;
			for(Point point: points){
				count++;
				System.out.println("Point "+count+" ("+point.x+", "+point.y+", "+point.z+")");
			}
			System.out.println("\n");
			*/
			
			for(int y=0; y<graph.length; y++){
				for(int x=0; x<graph[0].length; x++){
					System.out.print(graph[y][x] + " ");
				}
				System.out.println();
			}
			
			
			Thread.sleep(100);
			angle+=0.5;
			mesh.rotate(0, angle, 0);
			mesh.meshTo2D(view);
		}
		
	}
	
}
