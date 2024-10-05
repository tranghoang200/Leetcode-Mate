function twoSum(nums, target) {

    // TC: O(n)
    // SC: O(n)
    
    let complementMap = new Map();

    for (let i = 0; i < nums.length; i++) {
        let complement = target - nums[i];

        if (complementMap.has(nums[i])) {
            return [complementMap.get(nums[i]), i];
        }

        complementMap.set(complement, i);
    }

    return [];
}
