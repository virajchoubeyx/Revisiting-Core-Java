package LeetCode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution2 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        int max = findmax(candies);
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies<max)
            list.add(false);
            else
            list.add(true);
        }
        return list;
    }
    static int findmax(int[] x){
        int max=0;
        for(int i=0;i<x.length;i++){
            if(max<x[i])
            max=x[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,5,1,2,3};
        // @SuppressWarnings("resource")
        List<Boolean> list = new Solution2().kidsWithCandies(arr, new Scanner(System.in).nextInt());
        System.out.println(list);
    }
}
