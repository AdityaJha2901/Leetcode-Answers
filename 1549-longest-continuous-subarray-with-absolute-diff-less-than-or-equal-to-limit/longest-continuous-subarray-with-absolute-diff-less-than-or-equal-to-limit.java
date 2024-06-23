

class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int ans = 1;
        Deque<Integer> minQ = new LinkedList<>();
        Deque<Integer> maxQ = new LinkedList<>();

        for (int l = 0, r = 0; r < nums.length; ++r) {
            while (!minQ.isEmpty() && minQ.peekLast() > nums[r])
                minQ.pollLast();
            minQ.offer(nums[r]);
            while (!maxQ.isEmpty() && maxQ.peekLast() < nums[r])
                maxQ.pollLast();
            maxQ.offer(nums[r]);
            while (maxQ.peek() - minQ.peek() > limit) {
                if (minQ.peek() == nums[l])
                    minQ.poll();
                if (maxQ.peek() == nums[l])
                    maxQ.poll();
                ++l;
            }
            ans = Math.max(ans, r - l + 1);
        }

        return ans;
    }
}