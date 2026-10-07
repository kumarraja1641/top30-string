import java.util.*;
public class Maxchar {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a String");
        String s1=sc.nextLine();

        int[] arr=new int[256];

        for(int i=0;i<s1.length();i++)
        {
            arr[s1.charAt(i)]++;
        }
        int max=0;
         char ch=' ';

    /*
       // Find max frequency
        for (int i = 0; i < s1.length(); i++) {
            if (arr[s1.charAt(i)] > max) {
                max = arr[s1.charAt(i)];
                ch = s1.charAt(i);
            }
        }
    
    
    */


        for(int i=0;i<s1.length();i++)
        {
           if(max<arr[s1.charAt(i)])
           {
            max=arr[s1.charAt(i)];
            ch=s1.charAt(i);
           }
        }
        System.out.println("most repoating char is"+max+" "+ch);
    



    }
    
}
