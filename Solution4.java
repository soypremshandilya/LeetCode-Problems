public class Solution4 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];
            int complement = target - currentNumber;
            
            if (map.containsKey(complement)) {
               
                return new int[] { map.get(complement), i };
            }
            
            map.put(currentNumber, i);
        }
       
        throw new IllegalArgumentException("No two sum solution");
    }
}