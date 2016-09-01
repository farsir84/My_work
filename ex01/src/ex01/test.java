package ex01;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		System.out.println("Introdu toti participantii...");
		Scanner intr = new Scanner(System.in);
		static int len = 0;
		int j = 1;
		for (; intr.hasNext();j++){
			len++;
			String c = intr.next();
			//System.out.print(c);
			System.out.println(len);
		}
		System.out.println(len);

/*			String[] name = new String[len];
		
		for (int i = 0; (input.next() != ",") || (input.next() != " "); i++){
		name[i] = input.next();
		}*/
		intr.close();
	}
}
