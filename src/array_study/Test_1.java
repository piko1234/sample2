package array_study;

import java.util.Arrays;

public class Test_1
{
     public static void main(String[] args) 
	{
    	 
         // 1.declaration
       	 
       	 String institute[]=new String[5];
       	 
       	 //2.initialization
       	 institute[0]="velocity";
       	 institute[1]="corporate";
       	 institute[2]="training";
       	 institute[3]="center";
       	 
       	//institute[7]="Pune";  // runtime error can't initialization out of array of length 5 
       	
       	 
       	 //3.usage
       	 
      	 System.out.println(institute[0]);
   	     System.out.println(institute[1]);
   	     System.out.println(institute[2]);
   	     System.out.println(institute[3]);
       	 
       	 System.out.println("=======================");
    	 
    	 for(int i=0;i<=3;i++)
    	 {
    		System.out.println(institute[i]);
    	 }
       	 
    	 
    	 //1.declaration
    	 
    	 char grade[]=new char[8];
    	 
    	 //2.initialization
    	 
    	 grade[0]='A';
    	 grade[1]='B';
    	 grade[2]='C';
    	 grade[3]='D';
    	 grade[4]='E';
    	 grade[5]='F';
    	 grade[6]='G';
    	// grade[9]='P'; // Exception runtime error Index 9 out of bounds for length 8
 

    	 
    	 //3.usage
    	 
    	 System.out.println("=====================");
    	 
    	 System.out.println(grade[0]);
    	 System.out.println(grade[1]);
    	 
    	 System.out.println("===================");
    	 
    	 for(int i=0;i<=6;i++) 
    	 {
    		System.out.println(grade[i]); 
    		 
    	 }
    	 
    	 Arrays.sort(grade);
    	 
    	 System.out.println("===========After sorting===========");
    	  System.out.println("Ascending order");
    	 
    	 for(int i=0;i<=grade.length-1;i++)
    	 {
    		  System.out.println(grade[i]); 
    	 }
    	 
    	 System.out.println("====================");
    	 System.out.println("Descending order");
    	 
    	 for(int i=grade.length-1;i>=0;i--) 
    	 {
    		System.out.println(grade[i]); 
    		 
    	 }
    	 
	}

}
