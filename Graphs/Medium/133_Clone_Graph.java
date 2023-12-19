/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null) return node;
        Node[] visited = new Node[101];
        Arrays.fill(visited, null);
        Node copy = new Node(node.val);
        dfs(copy, node, visited);
        return copy;        
    }
    
    private void dfs(Node copy, Node node, Node[] visited){
        visited[node.val] = copy;
        
        for(Node n: node.neighbors){
            if(visited[n.val] == null){
                Node newNode = new Node(n.val);
                visited[n.val]=newNode;                
                dfs(newNode, n, visited);
            } 
            
            copy.neighbors.add(visited[n.val]);            
        }        
    }        
}