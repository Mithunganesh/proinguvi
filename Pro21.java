import java.util.*;
		public class Pro21 {
			public static void main(String arr[]){
				Scanner s=new Scanner(System.in);
				String s1=s.nextLine();
				String k[]=s1.split(" ");
				int a1[]=new int[k.length];
				for(int i=0;i<k.length;i++){
					 a1[i]=Integer.valueOf(k[i]);
				}
				int k1=0,k2=0,nn=a1.length,i3=0;;
				ArrayList<Integer> al1=new ArrayList<Integer>();
				ArrayList<Integer> al2=new ArrayList<Integer>();
				for(int i=0;i<nn;i++){
					for(int j=0;j<nn;j++){
						if(j<=i){
							 k1+=a1[j];
							 al1.add(a1[j]);
						}else{
							k2+=a1[j];
							 al2.add(a1[j]);
						}
					}
					if((k1>0) && (k2>0) &&((k1/(i+1)) == (k2/(nn-(i+1))))){
						System.out.println(al1+","+al2);
						break;
					}   
					al1.clear();
					al2.clear();
					k1=0;
					k2=0;
					i3=i;
					
				}
				if((i3+1)==nn){
					System.out.println("Not Possible");
				}
			}
		}
