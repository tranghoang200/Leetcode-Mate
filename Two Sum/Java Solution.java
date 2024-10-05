class Solution {

    // TC: O(n)
    // SC: O(n)

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            int different = target - nums[i];
            
            if(map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
            
            map.put(different, i);
        }
        
        return null;
    }
}