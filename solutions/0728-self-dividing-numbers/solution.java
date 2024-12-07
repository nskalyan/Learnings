class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> h=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            if(fun(i))
            h.add(i);
        }
        return h;
    }

    static boolean fun(int i)
    {
        int n=i;
        while(i>0)
        {
            int k=i%10;
            if(k==0||n%k!=0)
            return false;
            i=i/10;
        }
        return true;
    }
}
