import java.util.Arrays;
class MinimumDifferenceBetweenLargestandSmallestValueinThreeMoves_1509 {
    public int minDifference(int[] nums) {
        Arrays.sort(nums);
        int check = nums.length-4; //4 because its -1 + -3
        int difference =Integer.MAX_VALUE ;
        if(check<=0)
        {
            return 0;
        }
        for(int i=0; i<nums.length-check; i++)
        {
            int calculatedDifference = nums[i+check]-nums[i];
            difference = Math.min(difference,calculatedDifference);
        }
        return difference;
    }
}