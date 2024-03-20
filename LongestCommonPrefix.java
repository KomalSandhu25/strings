package string;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void longestCommonPrefix(String []arr){
        Arrays.sort(arr);
        char[] start = arr[0].toCharArray();
        //char[] res = new char[start.length];
        for(int i =1; i<arr.length; i++){
            char[] v = arr[i].toCharArray();
            for(int j=0; j<start.length; j++){
                if(start[j] != v[j]){
                    start[j] = ' ';
                }

            }

        }
        String res =  new String(start);
        System.out.println(res);

    }

    public static void main(String[] args) {
        String []str = {"geeksforgeeks", "geeks", "geek", "geezer"};
        longestCommonPrefix(str);
    }
}
