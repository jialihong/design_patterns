package com.amity.design.priorityQueue;

/**
 * Created by Amity on 2021/3/5 下午 5:25
 */
public class PriorityQueueStudy {


    public int findKthLargest(int[] nums, int k) {
        int s = 0;
        for(int i=0; i < nums.length-1; i++) {
            for(int j = i+1; j<nums.length; j++) {
                if(nums[i] > nums[j]) {
                    
                }
            }
        }
        return s;
    }
}
