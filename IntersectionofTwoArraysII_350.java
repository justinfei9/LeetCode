import java.util.ArrayList;
import java.util.HashMap;
class IntersectionofTwoArraysII_350{
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm1 = new HashMap<>();
        HashMap<Integer, Integer> hm2 = new HashMap<>();
        HashMap<Integer, Integer> hm3 = new HashMap<>();
        for(int i=0; i<nums1.length; i++)
        {
            if(!hm1.containsKey(nums1[i]))
            {
                hm1.put(nums1[i], 1); 
                hm3.put(nums1[i], 1);
            }else{
                hm1.put(nums1[i], hm1.get(nums1[i])+1);
                hm3.put(nums1[i], hm3.get(nums1[i])+1);
            }
        }

        for(int i=0; i<nums2.length; i++)
        {
            if(!hm2.containsKey(nums2[i]))
            {
                hm2.put(nums2[i], 1); 
                hm3.put(nums2[i], 1);
            }else{
                hm2.put(nums2[i], hm2.get(nums2[i]) + 1);
                hm3.put(nums2[i], hm3.get(nums2[i])+1);
            }
            
        }
        ArrayList<Integer> al = new ArrayList<>();
        for (int num : hm3.keySet()) {
            int arr1 = hm1.getOrDefault(num, 0);
            int arr2 = hm2.getOrDefault(num, 0);
            int amount = Math.min(arr1,arr2);
            if(amount>0){
                for(int i=0; i<amount; i++)
                {
                    al.add(num);
                }
            }
        }
        int[] ans = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            ans[i] = al.get(i);
        }
        return ans;
    }
}