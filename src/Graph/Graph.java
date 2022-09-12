package Graph;


import java.util.ArrayList;
import java.util.Iterator;

// Adjacency List Graph
public class Graph {
    public class Node {
        private int data;
        private boolean visited;
        private ArrayList<Node> adjacent;

        public Node() {
            visited = false;
            adjacent = new ArrayList<Node>();
        }

        public Node(int data) {
            this.data = data;
            visited = false;
            adjacent = new ArrayList<Node>();
        }

        public int getData() {
            return data;
        }

    }

    public Graph() {
    }

    public Node addNode(int data) {
        Node newNode = new Node(data);

        return newNode;
    }

    public void addEdge(Node node1, Node node2) {
        node1.adjacent.add(node2);
    }

    // 방향 그래프
    public void dfs(Node node) {
        System.out.println(node.data + " ");
        node.visited = true;
        Iterator<Node> iter = node.adjacent.iterator();

        while(iter.hasNext()) {
            Node adNode = iter.next();
            if(!adNode.visited) {
                dfs(adNode);
            }
        }
    }
}
