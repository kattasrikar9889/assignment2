package assignment2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class assignmain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students to be entered:");
		int stcount=sc.nextInt();
		String names;
		String courseenrolled="";
		 int year,id=0,totalfee ;
		 int uniqueid=0;
		 ArrayList<String> courseregistred= new ArrayList<String>();
	for(int i=0;i<stcount;i++) {
			 
			 System.out.println("enter name of"+i);
			 names=sc.next();
			 System.out.println("enter year of"+i);
			 year=sc.nextInt();
			 
			 ArrayList<Integer> list = new ArrayList<Integer>();
		        for (int j=1; j<9; j++) {
		            list.add(new Integer(j));
		        }
		        Collections.shuffle(list);
		        
		        for (int z=0; z<4; z++) {
		             id=list.get(z);
		             System.out.println(id);
		        }
		        uniqueid=year+id;
	            System.out.print(uniqueid);
		        System.out.println("");
		
		System.out.println("Course available History 101, Mathematics 101,English 101, Chemistry 101, Computer Science 101" );
		System.out.println("Enter number of courses to be registered");
		int course=sc.nextInt();
		for(int a=0; a<course;a++) {
			System.out.println("Enter the course to be registered");
			String s=sc.next();
			
			courseregistred.add(s);
			
			
		}
		System.out.println("Total tution Fee");
		totalfee=course*600;
		System.out.println(totalfee);
		 for (int y=0; y<course; y++) {
             courseenrolled=courseregistred.get(y);}
		
		System.out.println("Name: "+names+" ID: "+id+" Course registred: "+courseenrolled+" Total tutionfee: "+totalfee);
	}
	}

}
