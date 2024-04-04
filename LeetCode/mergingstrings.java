package LeetCode;

import java.util.Scanner;

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length() + word2.length();
        String str="";
        int i=0;
        while(i<n){
            if(i<word1.length())
            str = str + word1.charAt(i);
            if(i<word2.length())
            str = str + word2.charAt(i);
            i++;
        }
        return str;
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        String str = new Solution().mergeAlternately(new Scanner(System.in).next(), new Scanner(System.in).next());
        System.out.println(str);
    }
}