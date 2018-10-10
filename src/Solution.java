
import java.util.*;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        int[] r = new int[2];
        int result = 0;
        for(int i = 0; i<nums.length; i++){
            result = target - nums[i];
            if(map.containsKey(result)&&map.get(result)!=i){
                return new int[]{i,map.get(result)};
            }
        }
        return null;
    }


    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int c[]= Arrays.copyOf(nums1, nums1.length+nums2.length);
        System.arraycopy(nums2, 0, c, nums1.length, nums2.length);
        Arrays.sort(c);
        if(c.length%2!=0){
            return c[c.length/2];
        }else{
            double n1 = c[c.length/2-1];
            double n2 = c[c.length/2];
            double r = (n1+n2)/2;
            return r;
        }
    }
}
