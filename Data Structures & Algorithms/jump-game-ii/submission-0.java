class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int currentEnd = 0;   // The farthest we can go with the current number of jumps
        int farthest = 0;     // The farthest we can reach in the NEXT jump
        
        // We don't need to jump if we are already at the last index
        // So we loop until nums.length - 1
        for (int i = 0; i < nums.length - 1; i++) {
            // Update the absolute farthest we can reach from any point in the current range
            farthest = Math.max(farthest, i + nums[i]);
            
            // If we've reached the end of our current jump's range...
            if (i == currentEnd) {
                jumps++;           // We must take another jump
                currentEnd = farthest; // Our new range extends to the farthest point found
                
                // Optimization: if we can already reach the end, we're done
                if (currentEnd >= nums.length - 1) break;
            }
        }
        
        return jumps;
    }
}