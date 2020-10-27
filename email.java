import java.util.Scanner;

public class email
{
   public static void main(String[]args)
   { 
	   Scanner sc=new Scanner(System.in);
	   String n1="kshitij";
	   String n2="srivastav";
       emailapp em1= new emailapp(n1,n2);
       System.out.println(em1.showInfo());
       
   }


}
