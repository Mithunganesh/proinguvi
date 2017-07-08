import java.util.Arrays;
import java.util.Scanner;
		public class Pro-69 {
			public static void main(String arr[]){
				Scanner sc=new Scanner(System.in);
				String s1=sc.nextLine();
				s1=s1.replaceAll("\\W","");
				String s2="";
				for(int i=0;i<s1.length();i++){
					if(Character.isDigit(s1.charAt(i))){
						s2+=s1.charAt(i)+"";
					}
				}
				int a[]=new int[s2.length()];
				for(int j=0;j<s2.length();j++){
					a[j]=Integer.valueOf(s2.charAt(j)+"");
				}
				Arrays.sort(a);
				int large=a[a.length-1];
				int small=a[0];
				int sum1=0,sum2=1,digit3=0;
				for(int j1=0;j1<a.length;j1++){
					sum1+=large*a[j1];
				}
				int sum11=sum1%9;
				for(int j2=0;j2<a.length;j2++){
					sum2*=(small+a[j2]);
				}
				int sum22=sum2%9;
				if(sum11<sum22){
					digit3+=sum11;
				}else{
					digit3+=sum22;
				}
				System.out.println((digit3*digit3));
		    }
		}
