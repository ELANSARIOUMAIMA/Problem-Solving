class Solution {
    public boolean isValid(String s) {
        // HashMap<char,char>map=new HashMap<>();
        // int Integer
        // char Character
        // double Double
        // boolean Boolean
        // long Long

        HashMap<Character,Character>map=new HashMap<>();
        
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
       
        ArrayList<Character> stack = new ArrayList<>();

        for(int i=0;i<s.length();i++){
            char c =s.charAt(i);
            if(map.containsKey(c)){
                stack.add(c);
            }
            else{
                if(stack.isEmpty())return false;
                char open=stack.remove(stack.size()-1);
                if(c!=map.get(open)){
                    return false;
                }
            }

        }
        return stack.isEmpty();   
    }
}
