import java.lang.reflect.Array;

public class InsertPosition {

    /**
     * Find the position that a number should be inserted into in a sorted array.
     * For instance, in the array {2,4,6,8,10}, inserting 5 would belong at position 2, since the resulting array
     * would be {2,4,5,6,8,10}, where the index of 5 is 2 (remember zero-indexing.)
     * See the test cases for more examples.
     *
     * You may assume no duplicate values.
     *
     * @param nums an array of ints.
     * @param target the number that would hypothetically be inserted.
     * @return return the index that a number should be inserted into a sorted array.
     */
    public int searchInsert(int[] nums, int target) {
        //Using binary search
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2; //Calculate a mid point.
            if(nums[mid] == target){ //If mid equal target return mid.
                return mid;
            } else if (nums[mid] < target){ 
                // If mid is smaller than the target, select the right half by moving the left start.
                left = mid + 1; 
            } else {
                // Else select the left side by moving the right end stop. 
                right = mid - 1;
            }
        }
        return left;

    }
}
