class Solution {
    public int strStr(String haystack, String needle) {
        int hlen = haystack.length();
        int nlen = needle.length();
        if(nlen == 0)
            return 0;
        if(hlen < nlen)
            return -1;
        
        int index = -1;
        while(index++ < hlen - nlen){
            if(needle.equals(haystack.substring(index , index + nlen)))
                return index;
            
        }
        
        return -1;
    }
}
