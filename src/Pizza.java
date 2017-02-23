package pizza_test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
			
			List<Integer> valList = new LinkedList<Integer>();
			Scanner sc = new Scanner(line);
			
			while (sc.hasNextInt()) {
				valList.add(sc.nextInt());
			}
			
			System.out.println(valList);
			
			for (int i = 0; i < valList.get(0); i++) {
				
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