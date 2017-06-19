import java.util.*;
class Pro33
{
    public static void main(String args[])
    {
        ArrayList<String> AL=new ArrayList<String>();
        int count=0;
        Scanner scan=new Scanner(System.in);
		    System.out.println("ENTER THE  STRING");
        String s=scan.nextLine();
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                String str=s.substring(i,j+1);
                AL.add(str);
            }
        }
           Collections.sort(AL);
           System.out.println(AL.get(AL.size()-1));
    }
}
