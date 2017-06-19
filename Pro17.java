import java.io.*;
import java.util.*;
class Pro17{
    public static void main(String arr[]){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        
        for(int i=0;i<=a;i++){
            int ss=1;
            String s=String.valueOf(i);
            for(String s1:s.split(""))
            {
                ss=ss*Integer.valueOf(s1);
            }
            ss=ss*i;
            if(ss==a){
                System.out.println(i);
                break;
            }
        }
    }
} 
