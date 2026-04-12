class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer, Integer> map = new HashMap<>();
       for(int i:nums){
            map.put(i, map.getOrDefault(i, 0)+1);
       }
       PriorityQueue<Pair> pq = new PriorityQueue<>((p,q) -> q.freq - p.freq);
       for(int i:map.keySet()){
            pq.add(new Pair(i, map.get(i)));
       }
       int[] res = new int[k];
       for(int i=0;i<k;i++){
            res[i] = pq.poll().val;
       }
       return res;
    }
}

class Pair{
    int val;
    int freq;

    Pair(int val, int freq){
        this.val = val;
        this.freq = freq;
    }
}

