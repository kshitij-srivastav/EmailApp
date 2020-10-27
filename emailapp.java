import java.util.*;

public class emailapp 
{
   String fn;
   String email;
   String p;
   String ln;
  String department;
    int mbc=500;
    int dpassword=10;
  String altemail;
  String companysuffix="company.com";
 public  emailapp(String fn,String ln)
   {
	   this.fn=fn;
	   this.ln=ln;
	  
	   this.department=setDepartment();
	   System.out.println("the department is "+ this.department);
	   this.p=ramdomPassword(dpassword);
	   System.out.println("your password is "+ this.p);  
	   email=fn.toLowerCase()+"."+ln.toLowerCase()+"@"+department+"."+companysuffix;
	  
   }
 public String setDepartment()
 {
	 System.out.print(" New worker:"+fn+" Enter the department\n 1for sales\n 2 for department\n 3 for Acounting\n 0 for none \n Enter your choice\n");
	 Scanner sc=new Scanner(System.in);
	 int depChoice=sc.nextInt();
	 if(depChoice==1)
		 return "sales";
	 else if(depChoice==2)
		 return "dev";
	 else if(depChoice==3)
		 return "accounting";
	 else  return "";
 }
 private String ramdomPassword(int length)
 {
	 String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ@!#&*%";
	 char [] password= new char[length];
	 for(int i=0;i<length;i++)
	 {
		 int rand=(int)(Math.random()*passwordSet.length());
		 password[i]=passwordSet.charAt(rand);
	 }
	 return new String(password);
 }
   	 
 public void setmbc(int capacity)
 {
	 this.mbc=capacity;
 }
 public void setAlternateEmail(String ae)
 {
	 this.altemail=ae;
 }
 public void changePassword(String newpassword)
 {
	 this.p=newpassword;
 }
 public int getMailBoxCapacity()
 {
	   return mbc;
 }
 public String getAlternateEmail (){return altemail;}
 public String getPassword() { return p; }
 
 public String showInfo() {
	 return "DISPLAY NAME: " +fn+ " "+ln+
			 "\nCOMPANY EMAIL: "+email+ "\nMAIL CAPACITY: "+mbc+" ";
 }
	 
 }

