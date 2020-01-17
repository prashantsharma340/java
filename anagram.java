import java.util.*;
public class Anagram
{
    static void find(String str1,String str2)
	{
	    int flag=0;
		char[] string1 = str1.toCharArray();
		char[] string2 = str2.toCharArray();
		Arrays.sort(string1);
		Arrays.sort(string2);
		for(int i=0;i<string1.length;i++)
		{
		    if(string1[i]==string2[i])
		        flag=1;
		    else
		        flag=0;
		}
		    if(flag==1)
		        System.out.println("STRINGS ARE ANAGRAM");
		else
		        System.out.println("STRINGS ARE NOT ANAGRAM");
	}
	
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		find(str1,str2);
	}
}
