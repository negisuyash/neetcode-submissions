class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] visited = new int[numCourses];
        Map<Integer, List<Integer>> map = new HashMap<>();
        Queue<Integer> q = new LinkedList<>();
        for(int[] i:prerequisites){
            List<Integer> list = map.getOrDefault(i[0], new ArrayList<Integer>());
            if(!list.contains(i[1])) list.add(i[1]);
            map.put(i[0], list);
        }
        for(int i=0;i<numCourses;i++){
            if(!bfs(map, q, visited, i))  return new int[]{};
        }
        for(int i=0;i<numCourses;i++){
            visited[i] = q.poll();
        }
        return visited;
    }

    public boolean bfs(Map<Integer, List<Integer>> map, Queue<Integer> q, int[] visited, int idx){
        if(visited[idx]==1)   return true;
        if(visited[idx]==2)   return false;
        visited[idx] = 2;
        boolean flag = true;
        for(int i: map.getOrDefault(idx, new ArrayList<Integer>())){
            flag = flag && bfs(map, q, visited, i);
        }
        if(!flag)   return false;
        visited[idx] = 1;
        q.add(idx);
        return true;    
    }
}