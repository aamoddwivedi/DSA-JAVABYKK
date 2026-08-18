package com.aamod;
import java.util.HashMap;

public class largestMssingIntezer {
    public static void main(String[] args) {

    }


    class Solution {

        public int largestInteger(int[] nums, int k) {

            int n = nums.length;

            HashMap<Integer, Integer> mp = new HashMap<>();

            for (int x : nums) {
                mp.put(x, mp.getOrDefault(x, 0) + 1);
            }

            if (k == 1) {

                int ans = -1;

                for (int x : mp.keySet()) {

                    int freq = mp.get(x);

                    if (freq == 1) {
                        ans = Math.max(ans, x);
                    }
                }

                return ans;
            }

            if (k == n) {

                int ans = nums[0];

                for (int x : nums) {
                    ans = Math.max(ans, x);
                }

                return ans;
            }

            int ans = -1;

            if (mp.get(nums[0]) == 1) {
                ans = Math.max(ans, nums[0]);
            }

            if (mp.get(nums[n - 1]) == 1) {
                ans = Math.max(ans, nums[n - 1]);
            }

            return ans;
        }
    }
}
