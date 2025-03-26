public class Solution {
    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                continue;
            }
            int slow = i;
            int fast = getNext(nums, i);
            boolean direction = nums[i] > 0;

            while (nums[fast] != 0 && (nums[fast] > 0) == direction && nums[getNext(nums, fast)] != 0 && (nums[getNext(nums, fast)] > 0) == direction) {
                if (slow == fast) {
                    if (slow == getNext(nums, slow)) {
                        break; 
                    }
                    return true;
                }
                slow = getNext(nums, slow);
                fast = getNext(nums, getNext(nums, fast));
            }

            int temp = i;
            while (nums[temp] != 0 && (nums[temp] > 0) == direction) {
                int next = getNext(nums, temp);
                nums[temp] = 0;
                temp = next;
            }
        }
        return false;
    }

    private int getNext(int[] nums, int index) {
        int n = nums.length;
        return ((index + nums[index]) % n + n) % n;
    }
}
