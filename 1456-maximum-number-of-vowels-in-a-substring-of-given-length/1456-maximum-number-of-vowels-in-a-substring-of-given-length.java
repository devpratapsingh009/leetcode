class Solution {
    public int maxVowels(String s, int k) {

        boolean[] isVowel = new boolean[128];
        isVowel['a']=true;
        isVowel['e']=true;
        isVowel['i']=true;
        isVowel['o']=true;
        isVowel['u']=true;
        int n= s.length();
        int l=0;
        int r=0;
        int count=0;
        while(r<k){
            char c1=s.charAt(r);
            if(isVowel[c1])
            count++;
            r++;
        }
        int max=count;
        while(r<n){
            char c1=s.charAt(r);
            if(isVowel[c1]) count++;
            char c2=s.charAt(l);
            if(isVowel[c2]) count--;
            max=Math.max(max, count);
            l++;
            r++;
            if(max==k) return max;
        }
        return max;
    }
}