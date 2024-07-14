class Solution {
    class Edge{
        int nbr;
        int wt;
        Edge(int nbr, int wt){
            this.nbr = nbr;
            this.wt = wt;
        }
    }
    class Pair{
        int node;
        int wsf;
        Pair(int node, int wsf){
            this.node = node;
            this.wsf = wsf;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<Edge>> graph = new ArrayList<>();
        for(int i = 0; i <= n; i++){
            graph.add(new ArrayList<>());
        }
        for(int[] time : times){
            int u = time[0];
            int v = time[1];
            int w = time[2];
            graph.get(u).add(new Edge(v, w));
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
            return a.wsf - b.wsf;
        });
        pq.add(new Pair(k, 0));
        int[] vis = new int[n + 1];
        Arrays.fill(vis, -1);
        while(pq.size() > 0){
            Pair pair = pq.remove();
            int node = pair.node;
            int wsf = pair.wsf;
            if(vis[node] != -1) continue;
            vis[node] = wsf;
            for(Edge e : graph.get(node)){
                int nbr = e.nbr;
                int wt = e.wt;
                if(vis[nbr] == -1){
                    pq.offer(new Pair(nbr, wsf + wt));
                }
            }
        }
        int max = -1;
        for(int i = 1; i <= n; i++){
            if(vis[i] == -1) return -1;
            max = Math.max(max, vis[i]);
        }
        return max;
    }
}