package Testss;

import java.util.Scanner;

public class mahesh {

	public static void main(String[]args) {
		Scanner s=new Scanner (System.in);
		String str=s.nextLine();
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
	}

}
