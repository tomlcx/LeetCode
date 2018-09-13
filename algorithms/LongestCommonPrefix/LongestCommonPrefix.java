class Solution {
    public String longestCommonPrefix(String[] strs) {
        String output = "";
        if(strs.length == 0)
            return output;
        
        String prefix = strs[0];
        for(int i = 1;i < strs.length;i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0 , prefix.length() - 1);
                if(prefix.isEmpty())//直到减为空
                    return "";
            }
        }
        return prefix;
    }
}
