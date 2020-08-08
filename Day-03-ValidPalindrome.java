class Solution {
    public boolean isPalindrome(String s) {
        char a[] = new char[s.length()];
        s=s.toLowerCase();
        a=s.toCharArray();
        for(int i=0,j=a.length-1;i<=j;i++,j--){
            while(i < j && !Character.isLetterOrDigit(a[i]))i++;
            while(i < j && !Character.isLetterOrDigit(a[j]))j--;
            if(a[i]!=a[j]){
                return false;
            }
        }
        return true;
    }
}
