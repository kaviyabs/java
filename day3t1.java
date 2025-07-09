package taskss;

import java.util.Scanner;

public class task1 {
	public static void main(String[]args) {
		Scanner sc=new Scanner (System.in);
		int mark=sc.nextInt();
		
		System.out.println(mark>=35?"pass":"fail");
	}
}
