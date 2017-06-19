import java.util.Scanner;

public class Pro25 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n1=scan.nextInt();
		int m1=(int) Math.pow(2,n1);
		for(int i=0;i<m1;i++)
		{
			String s=Integer.toBinaryString(i);
			System.out.print(s);
			if(s.length()!=n1)
			{
				for(int j=0;j<(n1-s.length());j++)
				System.out.print("0");
			}
			System.out.println();
		}

	}

}
