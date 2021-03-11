package LockerPvt.ltd;
import  java.io.*;

import java.util.*;
import java.nio.*;


public class project {
	public static void main(String args[]) throws Exception {
		int num;
		project obj  =new project();
		Scanner input =new Scanner(System.in);
		System.out.println("***************Welcome Page**************");
		System.out.println("*****************************************");
		System.out.println("**************LockerPvt.ltd**************");
		System.out.println("*****************************************");
		System.out.println();
		
		System.out.println("1.Get file name ");
		System.out.println("2.Details of the use interface"
		                        +"\n    (1).Add file"
				                +"\n    (2).Delete file"
		                        +"\n    (3).Search file"
		                        +"\n    (4).Back to main context");
		System.out.println("3.Exit aplication");
		
		System.out.println("Enter your choice");
		num = input.nextInt();
		while(num <1 || num>3){
			System.out.println("Incorrect choice");
			project.main(args);
			num=input.nextInt();
		}
		
		switch(num) {
		case 1:System.out.println("Get file name");
		       System.out.println("--------------");
		try {
			Scanner scanner= new  Scanner(System.in);
			System.out.println("Enter directory path");
			 String DirPath=scanner.nextLine();
			 File folder=new File(DirPath);
			
			if(folder.isDirectory()) {
				File[] filelist=folder.listFiles();
				
				Arrays.sort(filelist);
				
				
				 Arrays.sort(filelist, new Comparator()
	                {
	                    
	                    public int compare(Object f1, Object f2) {
	                        return ((File) f1).getName().compareTo(((File) f2).getName());
	                    }
	                });
				 for(File file:filelist)
	                {
					 System.out.println("List of files");
	                    System.out.println(file.getName());
	                }
		    }
			System.out.println("------------------");
			
			Scanner newchoice=new Scanner(System.in);
			System.out.println("Enter 1 for main menu and 2 to exit the application");
			int Newchoice=newchoice.nextInt();
			switch(Newchoice){
			case 1:project.main(args);
			break;
			case 2:
				System.out.println("Thank you for using our application");
				System.exit(0);
			}
			}
			
		catch(Exception e) {
			System.out.println("Exception occured");
			e.printStackTrace();
			}
		break;
		case 2:
			System.out.println("Detail of the user interface");
			System.out.println("------------------------------");
		    System.out.println("Enter your choice");
		    Scanner submenu=new Scanner(System.in);
		    int userchoice=submenu.nextInt();
		    switch(userchoice) {
		    case 1: 
		    	System.out.println("Add file");
		    	System.out.println("---------");
		    try {
			Scanner scanner =new Scanner(System.in);
			System.out.println("Enter your directory path");
			String DirPath=scanner.nextLine();
			System.out.println("Enter your file name ");
			Scanner scan=new Scanner(System.in);
			String fileName=scan.next();
			File file = new File(DirPath+"/"+fileName);
			if(file.createNewFile()) {
				System.out.println("New file created");
			}
			else{
				System.out.println("File not created");}
	               System.out.println("------------------");
			
			Scanner newchoice=new Scanner(System.in);
			System.out.println("Enter 1 for main menu and 2 to exit the application");
			int Newchoice=newchoice.nextInt();
			switch(Newchoice){
			case 1:project.main(args);
			break;
			case 2:
				System.out.println("Thank you for using our application");
				System.exit(0);
			}
		}
		catch(IOException  e) {
			System.out.println("Exception occured");
			e.printStackTrace();
		}
		break;
		case 2:System.out.println("Delete file");
		       System.out.println("-----------");
		try {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your directory path");
		String DirPath=scanner.nextLine();
		Scanner delete=new Scanner(System.in);
		System.out.println("Eneter the file name you want to delete");
	    String filename=delete.next();
	    File file=new File(DirPath+"/"+filename);
	    boolean b=file.delete();
	    if(b==true) {
	    	System.out.println("File deleted");
	    }
	    else {
	    	System.out.println("File does not exist");
	    }
		System.out.println("------------------");
		
		Scanner newchoice=new Scanner(System.in);
		System.out.println("Enter 1 for main menu and 2 to exit the application");
		int Newchoice=newchoice.nextInt();
		switch(Newchoice){
		case 1:project.main(args);
		break;
		case 2:
			System.out.println("Thank you for using our application");
			System.exit(0);
		}
	   
	    }
		catch(Exception e) {
			System.out.println("Exception occured");
			e.printStackTrace();
		}
		break;
		case 3:System.out.println("Search file");
		      System.out.println("--------------");
		
		try {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter your directory path");
			String DirPath=scanner.nextLine();
			
			
			File file=new File(DirPath);
			int found=0;
			String[] DirList=file.list();
			if(DirList==null) {
				System.out.println("Directory is empty");
			}
			else {
				Scanner scan=new Scanner(System.in);
			    System.out.println("Enter the file name");
				String filename=scan.next();
				
				
					if(filename.matches(filename)) {
						System.out.println("Process complete");
						System.out.print("--------------------");
						System.out.println("Searched file found"+"---->"+filename);
						
						found=1;
					}
					else {
						System.out.println("File does not exist");
					}
			}
	            System.out.println("------------------");
			
			Scanner newchoice=new Scanner(System.in);
			System.out.println("Enter 1 for main menu and 2 to exit the application");
			int Newchoice=newchoice.nextInt();
			switch(Newchoice){
			case 1:project.main(args);
			break;
			case 2:
				System.out.println("Thank you for using our application");
				System.exit(0);
			}
		    }
		catch(Exception e) {
			System.out.println("Exception occured");
			e.printStackTrace();
		}
		break;
		case 4:System.out.println("Return to main context");
		       System.out.println("-----------------------");
		       try {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your choice Yes for Main Menu and No to Exit Application");
		String Choice=scanner.next();
		
		System.out.println("");
		boolean Yes=true;
		boolean yes = true;
		boolean no=false;
		boolean No=false;
		
		if(true){
		project.main(args);}
		else if(false) {
			
			System.out.println("Thank you for using our application");
			System.exit(0);
		}
		else  {
			System.out.println("Inavalid input");
		}
		       }
		       catch(Exception e) {
		    	   System.out.println("Exception occured");
		    	   e.printStackTrace();
		       }
		break;
		}
		break;
		   
		case 3:System.out.println("Exit application");
		       System.out.println("------------------");
		try {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your choice Yes or No");
		String choice=scanner.next();
		boolean Yes=true;
		boolean yes=true;
		boolean No=false;
		boolean no=false;
		if(true)
		{
		
		System.out.println("Thank you for using our application");
		System.exit(0);}
		else if(false) {
			project.main(args);
			
		}
		else {
			System.out.println("Invalid input");
		}
		}
		catch(Exception e) {
			System.out.println("Exception occured");
			e.printStackTrace();
			
		}
		break;
		}
	    
			
		}
		
	}


