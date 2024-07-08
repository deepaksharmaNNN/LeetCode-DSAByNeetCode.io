class Solution {
    private boolean bfs(int[][] graph, int start, int n, int[] color) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        color[start] = 0;
        while(q.size() > 0){
            int node = q.poll();
            for(int nbr : graph[node]){
                if(color[nbr] == -1){
                    color[nbr] = 1 - color[node];
                    q.offer(nbr);
                }else if(color[nbr] == color[node]){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        Arrays.fill(color, -1);
        for (int i = 0; i < n; i++) {
            if (color[i] == -1) {
                if (bfs(graph, i, n, color) == false)
                    return false;
            }
        }
        return true;
    }
}