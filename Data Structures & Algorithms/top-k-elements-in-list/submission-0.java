class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        PriorityQueue<Pair> pq = new PriorityQueue<>((p1,p2) -> {
            return p2.freq - p1.freq;
        });
        Map<Integer, Integer> map = new HashMap<>();
        for(int num:nums){
            int freq = map.getOrDefault(num,0);
            map.put(num, ++freq);
        }
        for(int key:map.keySet()){
            pq.add(new Pair(map.get(key), key));
        }
        for(int i=0;i<k;i++){
            res[i] = pq.poll().val;
        }
        return res;
    }
}

class Pair{
    int freq;
    int val;
    public Pair(int freq, int val){
        this.freq = freq;
        this.val = val;
    }
}
