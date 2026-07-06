class Solution {
    public boolean isAnagram(String s, String t) {
        //Anagram: a word, phrase, or name formed by rearranging the letters of another, such as spar, formed from rasp.
        if(s.length()!=t.length()) return false;
        else{
            for(int i=0;i<s.length();i++){
                int idx = t.indexOf(s.charAt(i));
                if(idx!=-1){
                    t=t.substring(0,idx)+t.substring(idx+1);
                }
                else return false;
                
            }
            return t.isEmpty();

        }
        
    }
}



class Solution {
    public boolean isAnagram(String s, String t) {
        //Anagram: a word, phrase, or name formed by rearranging the letters of another, such as spar, formed from rasp.
        if(s.length()!=t.length()) return false;
        else{

        }
        char[]a=s.toCharArray();
        char[]b=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }
}

