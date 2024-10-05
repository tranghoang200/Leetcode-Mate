class Solution {
public:
    
    // TC: O(n)
    // SC: O(n)

    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> complementMap;

        for (int i = 0; i < nums.size(); i++) {
            int complement = target - nums[i];

            if (complementMap.find(nums[i]) != complementMap.end()) {
                return {complementMap[nums[i]], i};
            }

            complementMap[complement] = i;
        }

        return {};
    }
};
