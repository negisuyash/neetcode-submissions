class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] visited = new int[numCourses];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0;i<prerequisites.length;i++){
            List<Integer> list = map.getOrDefault(prerequisites[i][0], new ArrayList<>());
            list.add(prerequisites[i][1]);
            map.put(prerequisites[i][0], list);
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(!visit(map, q, visited, i))  return new int[]{};
        }
        int[] res = new int[numCourses];
        int idx = 0;
        while(!q.isEmpty()) res[idx++] = q.poll();
        return res;
    }

    public boolean visit(Map<Integer, List<Integer>> map, Queue<Integer> q, int[] visited, int idx){
        if(visited[idx] == 1)   return true;
        if(visited[idx] == 2)   return false;
        visited[idx] = 2;
        boolean flag = true;
        for(int i:map.getOrDefault(idx, new ArrayList<>())){
            flag = flag && visit(map, q, visited, i);
        }
        visited[idx] = 1;
        q.add(idx);
        return flag;
    }
}