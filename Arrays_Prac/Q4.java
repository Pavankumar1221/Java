import java.util.*;
// Program to reverse an array

public class Q4 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.print("Before reversing: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int a=0;
        int b=arr.length-1;
        while(a<b){
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            a++;class Solution {
    public boolean isPalindrome(String s) {
        String res="";
        int len = s.length();
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='@' ||s.charAt(i)=='#' || s.charAt(i) == ' '||s.charAt(i) ==':'||s.charAt(i) ==','||s.charAt(i)=='.') continue;
            char ch=s.charAt(i);
            res+=ch;
        }
        System.out.println(res.toLowerCase());
        res = res.toLowerCase();
        int a=0;
        int b=res.length()-1;
        while(a<b){
            if(res.charAt(a) != res.charAt(b)) return false;
            a++;
            b--;
        }
        return true;
    }
}
            b--;
        }
        System.out.println();
        System.out.print("After reversing: ");
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
}
