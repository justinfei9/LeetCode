class MaximumScoreAfterSplittingaString_1422{
    public int maxScore(String s) {
        int max = 0;
        int ones =0;
        int zeroes=0;
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(c == '1')
            {
                ones++;
            }
        }
        for(int i=0; i<s.length()-1; i++)
        {
            char c = s.charAt(i);
            if(c == '0')
            {
                zeroes++;
            }else{
                ones--;
            }
            max =Math.max((zeroes+ones),max);
        }
        return max;
    }
}