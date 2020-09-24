/**
 * 
 * https://leetcode.com/explore/featured/card/fun-with-arrays/525/inserting-items-into-an-array/3253/
 * 
 */

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] copy = Arrays.copyOf(nums1, m);

        int ptr1 = 0;
        int ptr2 = 0;
        while (ptr1 < m && ptr2 < n) {
            if (copy[ptr1] < nums2[ptr2])
                nums1[ptr1 + ptr2] = copy[ptr1++];
            else {
                nums1[ptr1 + ptr2] = nums2[ptr2++];
            }
        }

        while (ptr1 < m) {
            nums1[ptr1 + ptr2] = copy[ptr1++];
        }
        while (ptr2 < n) {
            nums1[ptr1 + ptr2] = nums2[ptr2++];
        }



    }
}
