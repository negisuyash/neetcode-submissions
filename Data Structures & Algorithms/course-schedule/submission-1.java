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
            if(!dfs(map, visited, i))   return false;
        }

        return true;
    }

    public boolean dfs(Map<Integer, List<Integer>> map, int[] visited, int idx){
        if(visited[idx]==1) return true;
        if(visited[idx]==2) return false;
        visited[idx] = 2;
        boolean flag = true;
        for(int i:map.getOrDefault(idx, new ArrayList<>())){
            flag = flag && dfs(map, visited, i);
        }
        visited[idx] = 1;
        return flag;
    }
}
