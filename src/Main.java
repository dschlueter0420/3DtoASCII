
public class Main {

	public static void main(String[] args){
		
		char[][] graph  = new char[20][20];
		View     view   = new View(20,20,10,new Point(10,10,0));
		Point[]  points = {new Point(5, 5, 3)};
		Mesh     mesh   = new Mesh(points);

		mesh.meshTo2D(view);
		
		
		
		for(int y=0; y<graph.length; y++){
			for(int x=0; x<graph[0].length; x++){
				System.out.print(graph[y][x] + " ");
			}
			System.out.println();
		}
		
	}
	
}
