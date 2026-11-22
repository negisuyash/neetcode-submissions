class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map =  new HashMap<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[1]-a[1]);
        for(int i:map.keySet()){
            pq.add(new int[]{i, map.get(i)});
        }
        int[] res = new int[k];
        while(k-->0){
            res[k] = pq.poll()[0];
        }
        return res;
    }
}
