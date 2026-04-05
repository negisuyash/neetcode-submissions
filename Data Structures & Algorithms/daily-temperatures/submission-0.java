class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int [] res = new int[temp.length];
        Stack<Pair> s = new Stack<>();
        for(int i=0;i<temp.length;i++){

                while(!s.isEmpty() && s.peek().t < temp[i]){
                    res[s.peek().idx] = i - s.peek().idx;
                    s.pop();
                }
                s.push(new Pair(temp[i],i));
        }
        return res;
    }
}

class Pair{
    int t;
    int idx;

    public Pair(int t, int idx){
        this.t=t;
        this.idx=idx;
    }
}
