import java.util.Scanner;


public class ProS0-3 
{


	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);

		System.out.println("ENTER THE STRING 1:");

		String ss1=in.nextLine();

		System.out.println("ENTER THE STRING 2:");

		String ss2=in.nextLine();

		int cost=0;

		if(ss1.equals(ss2))

		{

			System.out.println("STRINGS ARE ALREADY EQUAL");

		}

		else

		{

			if(ss1.length()>ss2.length())

			{

				ss1=s1.substring(0, ss2.length());

			}

			if(ss1.length()<ss2.length())

			{

				int l=ss2.length()-ss1.length();

				ss1=ss1.concat(ss2.substring(s1.length(), ss2.length()));

			}
 
           char[] ccc1=s1.toCharArray();
  
          char[] ccc2=s2.toCharArray();
 
           StringBuffer sba=new StringBuffer(ss1);
  
          StringBuffer sbb=new StringBuffer(ss2);

			for(int i=0;i<ccc1.length;i++)
 
           {
   
         	if(ccc1[i]!=ccc2[i])
 
           	{
 
           		cost=cost+5;

            		sba=sba.replace(i, i+1,String.valueOf(ccc2[i]));

            	}
 
           }
 
           ss1=new String(sba);

            System.out.println("THE MODIFIED STRING IS -----> "+ss1+"   AT COST "+cost);
	
	}

	}

}
