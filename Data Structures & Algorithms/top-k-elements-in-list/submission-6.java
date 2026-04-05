class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((p,q) -> q.freq - p.freq);

        for(int key:map.keySet()){
            pq.add(new Pair(key,map.get(key)));
        }

        int[] res = new int[k];

        while(k > 0){
            res[--k] = pq.poll().val;
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

    Pair(){}
}
