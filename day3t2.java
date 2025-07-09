package taskss;

import java.util.Scanner;

public class tlight {
	public static void main(String[] args) {
		Scanner tl=new Scanner(System.in);
		System.out.println("What is th clr of traffic light:");
		String ans=tl.nextLine();
		if(ans.equals("red")) {
			System.out.println("stop");
		}
		else if(ans.equals("yellow")) {
			System.out.println("ready");
		}
		else if(ans.equals("green")) {
			System.out.println("go");
	}
		else {
				System.out.println("invalid clr");
		}
		tl.close();
}
}
