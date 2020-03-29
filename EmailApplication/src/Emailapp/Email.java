package Emailapp;

import java.util.Scanner;

public class Email {
	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private int mailboxCapacity=500;
	private String alternatemail;
	private int defaultPasswordLength=10;
	private String companySuffix = "google.com";
	private String email;
	private int capacity;
	
	//constructors
	public Email(String firstname,String lastname)
	{
		this.firstname=firstname;
		this.lastname=lastname;
	//	System.out.println("email created "+this.firstname+" "+this.lastname);
		
		this.department=setDepartment();
		System.out.println("Department is "+this.department);
		
		
		this.password=randomPassword(defaultPasswordLength);
		System.out.println("your password is "+this.password);
		
		
		email = firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+"."+companySuffix;
		
		System.out.println("your mail is "+email);
	}
	
	private String setDepartment()
	{
		System.out.print("DEPARTMENT CODES\n1 for sales\n2 for development\n3 for account\n0 for more\nEnter department code: ");
		Scanner sc = new Scanner(System.in);
		int deptchoice = sc.nextInt();
		if(deptchoice==1)
		{
			return "sales";
		}
		else if(deptchoice==2)
		{
			return "dev";
		}
		else if(deptchoice==3)
		{
			return "accounting";
		}
		else
		{
			return "";
		}
	}
	
	private String randomPassword(int length)
	{
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%^&*()";
		char[] password = new char[length];
		for(int i=0;i<length;i++)
		{
			int rand=(int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
		public void setMailboxCapacity(int capacity)
		{
			this.capacity=capacity;
		}
		public void setAlternateEmail(String altMail)
		{
			this.alternatemail=altMail;
		}
		public void setchangePass(String pass)
		{
			this.password=password;
		}
		
		public int getMailboxCapacity()
		{
			return mailboxCapacity;
		}
		public String getAlternateEmail()
		{
			return alternatemail;
		}
		public String getchangepass()
		{
			return password;
		}
		
		
		public String showinfo()
		{
			return "\ndisplay name" +firstname+" "+lastname+
					"\ncompany email "+email+
					"\nmailbox capacity"+ mailboxCapacity +"mb";
		}
	}
	


