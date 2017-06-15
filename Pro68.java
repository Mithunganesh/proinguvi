import java.io.*;
import java.util.*;
public class Pro68 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the First Name:");
		String s1=s.nextLine();
		System.out.println("Enter the Last Name:");
		String s2=s.nextLine();
		System.out.println("Enter the 6 digit PIN:");
		int pin=s.nextInt();
		s.nextLine();
		System.out.println("Enter the position  N:");
		int N=s.nextInt();
	    int rln=String.valueOf(pin).length();
		if((N>0)&&(N<=String.valueOf(pin).length())){
		String longer_name="";
		String smaller_name="";
		if(s1.length()>s2.length()){
			 longer_name=s1;
			 smaller_name=s2;
			}
		else if(s2.length()>s1.length()){
			longer_name=s2;
			smaller_name=s1;
		}else if(s1.length()==s2.length()){
			if(s1.compareTo(s2)>0){
				longer_name=s1;
				smaller_name=s2;
			}else if(s1.compareTo(s2)<0){
				smaller_name=s1;
				longer_name=s2;
			}else{
				longer_name=s1;
				smaller_name=s2;
			}
		}
		String a1=longer_name;
		String b1=smaller_name;
		String id1=a1.charAt(0)+""+b1+""+String.valueOf(pin).charAt(N-1)+""+String.valueOf(pin).charAt(rln-N);
		//System.out.println(id1);
		StringBuilder sbr = new StringBuilder(id1);
		for (int i = 0; i < id1.length(); i++) {
			if (Character.isUpperCase(id1.charAt(i))) {
				sbr.setCharAt(i, Character.toLowerCase(id1.charAt(i)));
			} else {
				sbr.setCharAt(i, Character.toUpperCase(id1.charAt(i)));
			}
		}
		System.out.println(new String(sbr));
	}else{
		System.out.println("Enter proper position N...");
	}
	}
}
