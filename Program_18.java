// A palindrome contains a character with odd frequency only 0 or 1 times. If it occurs more than once, it is not a palindrome

class Sol
{
    int isPossible (String S)
    {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i = 0; i < S.length() ; i++){
            hm.put(S.charAt(i),hm.getOrDefault(S.charAt(i),0) + 1);
        }
        
        int c = 0;
        
        for(Map.Entry<Character,Integer> entry : hm.entrySet()){
            if(entry.getValue() % 2 == 1) c++;
        }
        if(c > 1) return 0;
        return 1;
    }
}
