
public class Main {

	public static void main(String[] args) throws InterruptedException{
		
		char[][] graph  = new char[21][21];
		View     view   = new View(20,20,2,new Point(0,0,0));
		Point[]  points = {new Point(-2, -2, 5),new Point(2, 2, 5),new Point(2, -2, 5),new Point(-2, 2, 5),new Point(-2, -2, 10),new Point(2, 2, 10),new Point(2, -2, 10),new Point(-2, 2, 10)};
		Mesh     mesh   = new Mesh(points);

		mesh.meshTo2D(view);
		
		while(true){
			for(int y=0; y<graph.length; y++){
				for(int x=0; x<graph[0].length; x++){
					graph[y][x] = '.';
					if(mesh.pOnMesh(x-10,y-10)){
						graph[y][x] = '#';
					}
				}
			}
			
			for(int y=0; y<graph.length; y++){
				for(int x=0; x<graph[0].length; x++){
					System.out.print(graph[y][x] + " ");
				}
				System.out.println();
			}
			
			Thread.sleep(1000);
			
			mesh.rotate(0, Math.PI/3, 0);
			mesh.meshTo2D(view);
		}
		
	}
	
}
