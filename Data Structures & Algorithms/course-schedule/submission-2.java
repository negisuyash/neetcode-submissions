class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int[] visited = new int[numCourses];
        for(int i=0;i<prerequisites.length;i++){
            List<Integer> list = map.getOrDefault(prerequisites[i][0], new ArrayList<>());
            list.add(prerequisites[i][1]);
            map.put(prerequisites[i][0], list);
        }
        for(int i=0;i<visited.length;i++){
            if(!visit(map, visited, i)) return false;
        }
        return true;
    }

    public boolean visit(Map<Integer, List<Integer>> map, int[] visited, int idx){
        if(visited[idx] == 2)   return false;
        if(visited[idx] == 1)   return true;
        visited[idx] = 2;
        boolean flag = true;
        for(int i:map.getOrDefault(idx, new ArrayList<>())){
            flag = flag && visit(map, visited, i);
        }
        visited[idx] = 1;
        return flag;
    }
}
