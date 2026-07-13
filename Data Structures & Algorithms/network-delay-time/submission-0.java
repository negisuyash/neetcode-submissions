class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, List<int[]>> map = new HashMap<>();
        for(int[] time:times){
            List<int[]> list = map.getOrDefault(time[0], new ArrayList<>());
            list.add(new int[]{time[1], time[2]});
            map.put(time[0], list);
        }

        int[] dist = new int[n+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k] = 0;

        PriorityQueue<int[]> pq= new PriorityQueue<>((a,b) -> Integer.compare(a[1],b[1]));
        pq.add(new int[]{k, 0});

        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int currNode = curr[0];
            int currWeight = curr[1];
            for(int[] nextNode : map.getOrDefault(currNode, new ArrayList<>())){
                int totalWeight = currWeight+nextNode[1];
                if(totalWeight < dist[nextNode[0]]){
                    dist[nextNode[0]] = totalWeight;
                    pq.add(new int[]{nextNode[0], dist[nextNode[0]]});
                }
            }
        }

        int res = 0;
        for(int i=1;i<n+1;i++){
            if(dist[i] == Integer.MAX_VALUE)  return -1;
            res = Math.max(res, dist[i]);
        }

        return res;
    }
}
