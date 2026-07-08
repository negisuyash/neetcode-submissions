class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!addInSet(set, nums, i, k))  return true;
        }
        return false;
    }

    public boolean addInSet(Set<Integer> set, int[] nums, int idx, int k){
        if(set.size() > k){
            set.remove(nums[idx-k-1]);
        }
        if(set.contains(nums[idx])) return false;
        set.add(nums[idx]);
        return true;
    }
}