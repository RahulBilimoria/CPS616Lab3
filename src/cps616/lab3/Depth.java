/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package cps616.lab3;

import java.util.*;

/**
 *
 * @author minim_000
 */
public class Depth {
    
    public static class Graph{

        //TreeMap is used to map vertices to Adjacency Lists. The lists are stored as TreeSets for ordering, uniqueness and log(n) retrieval.
        private TreeMap<String, TreeSet<String>> graph = new TreeMap<>();

        //Adds a vertex with a given name to the graph.
        public void addVertex(String name){
            if(!graph.containsKey(name)) graph.put(name, new TreeSet<String>());
        }

        //Adds an edge to the graph. Throws an exception if the Vertices don't exist. Two nodes can only share one edge.
        public void addEdge(String vertex1, String vertex2){
            if(!graph.containsKey(vertex1) || !graph.containsKey(vertex2)) throw new NoSuchElementException();
            graph.get(vertex1).add(vertex2);
            graph.get(vertex2).add(vertex1);
        }
        //Returns an alphabetically ordered Array of Strings representing the vertices connected to the given vertex.
        public String[] getNeighbours(String vertex){
            if(!graph.containsKey(vertex)) throw new NoSuchElementException();
            TreeSet<String> neighbours = graph.get(vertex);
            return neighbours.toArray(new String[neighbours.size()]);
        }
        //Returns true if there is an edge between vertex1 and vertex2;
        public boolean areConnected(String vertex1, String vertex2){
            if(!graph.containsKey(vertex1) || !graph.containsKey(vertex2)) throw new NoSuchElementException();
            return graph.get(vertex1).contains(vertex2) && graph.get(vertex2).contains(vertex1);
        }
        //Returns an alphabetically ordered Array of Strings representing all the vertices in the graph.
        public String[] getVertices(){
            Set<String> vertices = graph.keySet();
            return vertices.toArray(new String[vertices.size()]);
        }

    }

    public static HashSet<String> visited = new HashSet<>();
    public static Graph g = new Graph();
    public static Queue<String> queue = new LinkedList<String>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <n; i++) {
            g.addVertex(sc.next());
        }
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] tokens = line.split(" ");
            String v1 = tokens[0];
            for (int j = 2; j < tokens.length; j++) {
                String v2 = tokens[j];
                g.addEdge(v1, v2);
            }
        }
        
        String v[] = g.getVertices();
        for (int x = 0; x < n; x++){
            if (!visited.contains(v[x])){
                dfs(v[x]);
            }
        }
    }
    
    public static void dfs(String v){
        visited.add(v);
        System.out.println(v);
        String c[] = g.getNeighbours(v);
        for (String c1 : c) {
            if (!visited.contains(c1)) {
                dfs(c1);
            }
        }
    }
}
