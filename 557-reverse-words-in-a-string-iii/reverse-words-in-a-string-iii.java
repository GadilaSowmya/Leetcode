class Solution {
    public String reverseWords(String s)
    {
        int n=s.length();
        StringBuilder Str = new StringBuilder(n);
        int left=0;
        for(int right=0;right<n;right++)
        {
            if(s.charAt(right) ==' ')
            {
                for(int i=right-1; i>=left; i--)
                {
                    Str.append(s.charAt(i));
                }
                Str.append(' ');
                left=right+1;
            }
        }
        for(int i=n-1;i>=left;i--)
        {
            Str.append(s.charAt(i));
        }
        return Str.toString();
    }
}