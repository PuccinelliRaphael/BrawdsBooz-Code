package pizza_test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Pizza {
	
	public Pizza() {
	}
	
	private void reader() {
		
		try {
			BufferedReader br = new BufferedReader(
					new FileReader("/home/arnolf/erl-dev/pizza-prob/me_at_the_zoo.in"));
			
			String line = br.readLine();
			int[] values = new int[5];
			int j = 0;
			Scanner sc = new Scanner(line);
			
			while (sc.hasNextInt()) {
				values[j] = sc.nextInt();
				j++;
			}
			
			System.out.println(values[0] + ", " + values[1]);
			
			int videos [] = new int[values[0]];
			
			line = br.readLine();
			sc = new Scanner(line);
			
			for (int i = 0; i < values[0]; i++) {
				videos[i] = sc.nextInt();
			}
			
			System.out.println(Arrays.toString(videos));
			
			line = br.readLine();
			sc = new Scanner(line);
			
			System.out.println(line);
			
			for (int i = 0; i < values[1]; i++) {
				EndPoint e = new EndPoint();
				
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private void mapper(LinkedList<String> list) {
		
		
	}
	
	public static void main(String[] args) {
		Pizza p = new Pizza();
		p.reader();
	}
}