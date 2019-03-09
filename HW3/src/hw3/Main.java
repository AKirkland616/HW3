package hw3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	/**
	 * still needs to be able to read input from file and user and execute accordingly
	 */

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String d = "";
		while(!input.next().equals("!")) {
			//input.n
			String first = input.nextLine();
			String second = input.nextLine();
			String operation = input.nextLine();
			File read = new File("url.txt");
			Scanner scan = new Scanner(read);
			HashMap hm = new HashMap(scan);
			System.out.println("Please Enter Keywords seperated by spaces,");
			System.out.println("or type file to read input file.");
			String[] s = {"Council", "claim"};
			ArrayList<HashEntry> dub = hm.containsEither(s);
			int count=0;
			
			for(int i =0;i<dub.size();i++) {
				System.out.println(dub.get(i).getKey());
				count++;
			}
			System.out.println(count);
		}

	}
}
