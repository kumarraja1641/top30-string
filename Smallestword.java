import java.util.*;
public class Smallestword {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s1=sc.nextLine();
        String[] s2=s1.trim().split("\\s+");
        List<String>small=new ArrayList<>();
        int ell=Integer.MAX_VALUE;
        for(int i=0;i<s2.length;i++)
        {
            if(s2[i].length()<ell)
            {
                ell=s2[i].length();
                small.clear();
                small.add(s2[i]);
            }
            else if(s2[i].length()==ell)
            {
                small.add(s2[i]);
            }
        }
        System.out.println(small);

    }
    
}
