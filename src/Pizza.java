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
			
			System.out.println(values[0] + ", " + values[1] + ", " + values[2] + ", " + values[3] + ", " + values[4]);
			
			int videos [] = new int[values[0]];
			
			line = br.readLine();
			sc = new Scanner(line);
			
			for (int i = 0; i < values[0]; i++) {
				videos[i] = sc.nextInt();
			}
			
			System.out.println(Arrays.toString(videos));
			
			for (int n = 0; n < values[1]; n++) {
				
				line = br.readLine();
				sc = new Scanner(line);
				
				int latency = sc.nextInt();
				int endpts = sc.nextInt();
				
				EndPoint e = new EndPoint(latency);
				
				for (int i = 0; i < endpts; i++) {
					line = br.readLine();
					sc = new Scanner(line);
					
					e.addCaches(sc.nextInt(), sc.nextInt());
				}
				System.out.println(e.toString());
			}
			
			for (int n = 0; n < values[2]; n++) {
				//??
			}
			
			System.out.println("\n" + line + "\n----\n");
			Cache[] caches = new Cache[values[3]];
			
			for (int n = 0; n < values[3]; n++) {
				line = br.readLine();
				sc = new Scanner(line);
				
				//Dont have to initiate these. Can just add the sc.next at proper place in struct
				int video = sc.nextInt(), endPoint = sc.nextInt(), requests = sc.nextInt();
				
				Cache x = new Cache(values[4]);
				caches[n] = x;
				
				System.out.println(line);
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