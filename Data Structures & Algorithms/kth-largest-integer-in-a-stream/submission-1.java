class KthLargest {
    PriorityQueue<Integer> pq;
    int size;
    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>((i,j) -> i-j);
        size = k;
        for(int i:nums){
            this.kLarge(i);
        }
    }
    
    public int add(int val) {
        this.kLarge(val);
        return this.pq.peek();
    }

    public void kLarge(int i){
        if(this.pq.size() < size)   this.pq.add(i);
        else{
            if(this.pq.peek()<i){
                this.pq.poll();
                this.pq.add(i);
            }
        }
    }
}
