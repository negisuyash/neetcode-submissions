class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] visited = new int[numCourses];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int[] i: prerequisites){
            List<Integer> list = map.getOrDefault(i[0], new ArrayList<>());
            list.add(i[1]);
            map.put(i[0], list);
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(!dfs(visited, map, q, i))  return new int[]{};
        }
        int[] res = new int[numCourses];
        for(int i=0;i<res.length;i++){
            res[i] = q.poll();
        }
        return res;
    }

    private boolean dfs(int[] visited, Map<Integer, List<Integer>> map, Queue<Integer> q, int idx){
        if(visited[idx] == 1)   return true;
        if(visited[idx] == 2)   return false;
        visited[idx] = 2;
        boolean flag = true;
        for(int i:map.getOrDefault(idx, new ArrayList<>())){
            flag = flag && dfs(visited, map, q, i);
        }
        visited[idx] = 1;
        q.add(idx);
        return flag;
    }
}
