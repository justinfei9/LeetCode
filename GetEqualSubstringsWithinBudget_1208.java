class GetEqualSubstringsWithinBudget_1208{
    public int equalSubstring(String s, String t, int maxCost) {
        int counter =0;
        int max = 0;
        int currentCost=0;
        for(int i=0; i<s.length(); i++)
        {
            currentCost += Math.abs(s.charAt(i) - t.charAt(i));
            while(currentCost>maxCost)
            {
                currentCost -= Math.abs(s.charAt(counter) - t.charAt(counter));
                counter++;
            }
            max = Math.max(max, i - counter + 1);
        }
        return max;
    }
}