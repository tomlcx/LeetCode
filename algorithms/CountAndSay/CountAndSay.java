class Solution {
    public String countAndSay(int n) {
        StringBuilder currt = new StringBuilder("1");
        StringBuilder post;
        char say;
        int count;
        
        for(int i = 1; i < n ; i++){
            post = currt;
            currt = new StringBuilder();
            say = post.charAt(0);
            count = 1;
            for(int j = 1 ; j < post.length(); j++){
                if(post.charAt(j) != say){
                    currt.append(count).append(say);
                    count = 1;
                    say = post.charAt(j);
                }
                else
                    count++;
            }
            currt.append(count).append(say);
        }
        
        return currt.toString();
    }
}
