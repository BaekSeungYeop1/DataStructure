package Graph;

import Graph.Graph.Node;

public class Main {
    public static void main(String[] args) {
        Graph g = new Graph();

        // 노드 생성
        Node node1 = g.addNode(1); Node node2 = g.addNode(2);
        Node node3 = g.addNode(3); Node node4 = g.addNode(4);
        Node node5 = g.addNode(5); Node node6 = g.addNode(6);

        // 연결 상태 정의
        g.addEdge(node1, node2);
        g.addEdge(node2, node4);
        g.addEdge(node3, node5);
        g.addEdge(node3, node6);
        g.addEdge(node4, node1);
        g.addEdge(node4, node3);
        g.addEdge(node5, node4);

        g.dfs(node1);
    }
}
