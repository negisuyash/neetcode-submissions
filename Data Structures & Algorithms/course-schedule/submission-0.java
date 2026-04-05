class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int[] visited = new int[numCourses];
        for(int[] i:prerequisites){
            List<Integer> list = map.getOrDefault(i[0], new ArrayList<>());
            list.add(i[1]);
            map.put(i[0], list);
        }
        for(int i=0;i<numCourses;i++){
            if(!dfs(visited, map, i))   return false;
        }
        return true;
    }

    public boolean dfs(int[] visited, Map<Integer, List<Integer>> map, int i){
        if(visited[i] == 1) return true;
        if(visited[i] == 2) return false;
        visited[i] = 2;
        boolean flag = true;
        for(int idx:map.getOrDefault(i, new ArrayList<>())){
            flag = flag && dfs(visited, map, idx);
        }
        visited[i] = 1;
        return flag;
    }
}
