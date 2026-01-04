class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> val = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 2) {
                val.add(entry.getKey());
            }
        }
        for (int i = 0; i < nums.length; i++) {
            int currentValue = nums[i];
            if (val.contains(currentValue) && map.get(currentValue) > 2) {
                // Change the value to Integer.MAX_VALUE until the occurrence is reduced to 2
                int occurrenceCount = map.get(currentValue);
                if (occurrenceCount > 2) {
                    nums[i] = Integer.MAX_VALUE;
                    map.put(currentValue, occurrenceCount - 1); // Decrease the occurrence
                }
            }
        }
        Arrays.sort(nums);

       int k = 0;
        while (k < nums.length && nums[k] != Integer.MAX_VALUE) {
            k++;
        }

        return k;
    }
}