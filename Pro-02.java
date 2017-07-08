import java.util.Arrays;
import java.util.Scanner;
		public class Pro-02 {
			public static void main(String arr[]){
				Scanner sc=new Scanner(System.in);
				int a=sc.nextInt();
				String s1=a+"";
				String s11[]=s1.split("");
				Arrays.sort(s11);
				int k=sc.nextInt();
				String h="";
				for(int i=0;i<s11.length-k;i++){
					h+=s11[i]+"";
				}
				System.out.println(h);
				sc.close();
				
		    }
		}
