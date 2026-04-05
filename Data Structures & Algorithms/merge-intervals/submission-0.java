class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        Stack<int[]> s = new Stack<>();
        s.push(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            int[] curr = intervals[i];
            int[] top = s.peek();
            if(curr[0] <= top[1]){
                top[1] = Math.max(top[1], curr[1]);
            }
            else    s.push(curr);
        }
        int[][] res = new int[s.size()][2];
        int n = s.size();
        for(int i=n-1;i>=0;i--){
            res[i] = s.pop();
        }
        return res;
    }
}
