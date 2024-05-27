
class SpecialArrayWithXElementsGreaterThanOrEqualX_1608{
    public int specialArray(int[] nums) {
        int x =0;
        int numOfGreaterNums =0;
        for(int i=0; i<=nums.length; i++)
        {
            for(int j=0; j<nums.length; j++)
            {
                if(nums[j]>=x)
                {
                    numOfGreaterNums++;
                }
            }
            if(x==numOfGreaterNums)
            {
                return x;
            }
            numOfGreaterNums=0;
            x++;
        }
        return -1;
    }
}