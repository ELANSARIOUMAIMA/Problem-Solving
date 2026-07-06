class Solution {
    public List<String> fizzBuzz(int n) {
        //remember this
        List<String> answer=new ArrayList<>();
        
        for(int i=1;i<n+1;i++){
            if(i%3==0&&i%5==0){
                answer.add("FizzBuzz");
            }
            else if(i%3==0){
                answer.add("Fizz");
            }
            else if(i%5==0){
                answer.add("Buzz");

            }
            else{
                // remember this 
                answer.add(String.valueOf(i));

            }
        }
        return answer;
    }
}
