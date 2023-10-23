package practiceJava;

import java.util.Scanner;

public class JavaPrac {

	public static void main(String[] args) {

		//A E O I U
		
	Scanner scn= new Scanner(System.in);
		
	System.out.println("Enter Character :");
	
	char c =scn.next().toUpperCase().charAt(0);

	
	
	
	boolean vw=false;
	switch(c) {
	
	case  'A':
	case  'E':
	case  'I':
	case  'O':
	case  'U': vw= true;
		
	}
	scn.close();
	
	
	if (vw) {
	  System.out.println("this is Voiwel");
	
	}else
		System.out.println("this is not Voiwel");
	}
}
