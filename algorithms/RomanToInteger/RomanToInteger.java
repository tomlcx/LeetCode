class Solution {
    public int romanToInt(String s) {
        int output = 0;
        for(int i = 0; i< s.length() - 1;i++){
            int a = convertInt(s.charAt(i));
            int b = convertInt(s.charAt(i+1));
            
            if(a < b){
                output = b - a + output;
                i++;
            }
            else
                output = a + output;
            if(i == s.length() - 2)
                output = b + output;
        }
        return output;
    }
    
    public int convertInt(String s){
        String stringChar = Character.toString(c);
        if(stringChar.equals("I")){
            return 1;
        }else if(stringChar.equals("V")){
            return 5;
        }else if(stringChar.equals("X")){
            return 10;
        }else if(stringChar.equals("L")){
            return 50;
        }else if(stringChar.equals("C")){
            return 100;
        }else if(stringChar.equals("D")){
            return 500;
        }else if(stringChar.equals("M")){
            return 1000;
        }
        return 0;
    }
}
