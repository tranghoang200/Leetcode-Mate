class Solution:
    
    # TC: O(n)
    # SC: O(n)
    
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        map = {}
        
        for i in range(len(nums)):
            different = target - nums[i]
            
            if nums[i] in map:
                return [i, map[nums[i]]]
            
            map[different] = i