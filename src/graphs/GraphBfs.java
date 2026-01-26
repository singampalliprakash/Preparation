package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class GraphBfs {
	private int vertices;
	private ArrayList<ArrayList<Integer>> adj;
	public GraphBfs(int v)
	{
		vertices=v;
		adj=new ArrayList<ArrayList<Integer>>();
		
		for(int i=0;i<v;i++)
		{
			adj.add(new ArrayList<Integer>());
		}
		
	}
	
	public void addEdge(int u,int v)
	{
		adj.get(u).add(v);
	}
	public void bfs(int start)
	{
		boolean[] visited=new boolean[vertices];
		Queue<Integer> q=new LinkedList<>();
		q.add(start);
		visited[start]=true;
		
		while(!q.isEmpty())
		{
			
		}
	}
	public static void main(String[] args) {
		GraphBfs g=new GraphBfs(6);
		g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 5);
        
        
	}

}
