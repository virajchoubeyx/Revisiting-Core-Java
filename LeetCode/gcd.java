package LeetCode;

import java.util.Scanner;

class Solution {
    public String gcdOfStrings(String str1, String str2) {
    if((str1+str2).equals(str2+str1)){
    int m = str1.length();
    int n = str2.length();
    // --
    return str1.substring(0,gcd(m,n));
    }
    return "";
    } 

    public static int gcd(int m, int n){
        while(n!=0){
        int temp = n;
        n = m % n;
        m = temp;
        }
        return m;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println("Enter two words:");
        String ans = sol.gcdOfStrings(new Scanner(System.in).next(), new Scanner(System.in).next());
        System.out.println(ans);
    }
}