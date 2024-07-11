class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        int[] inDegree = new int[n];
        for(int i = 0; i < n; i++){
            for(int it : graph[i]){
                adj.get(it).add(i);//revrese the directions of edges
                inDegree[i]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n; i++){
            if(inDegree[i] == 0) q.offer(i);
        }
        List<Integer> topo = new ArrayList<>();
        while(q.size() > 0){
            int curr = q.poll();
            topo.add(curr);
            for(int nbr : adj.get(curr)){
                inDegree[nbr]--;
                if(inDegree[nbr] == 0){
                    q.offer(nbr);
                }
            }
        }
        Collections.sort(topo);
        return topo;
    }
}