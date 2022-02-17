package assign5Hash;

import java.util.Scanner;
/** 
 * COSC 2100 – Fall 2021 
 * Assignment#6 
 * < This class prompts the user for the size of the hash table, and the amount of value
 * the user then unputs each value in one by one> 
 * @author <Claire Kraft> 
 */ 

public class Hashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Scanner used to collect values from the user
		Scanner s = new Scanner(System.in);
		System.out.println("What is the size of the table?");
		int a = s.nextInt();
		int[] hash = new int[a];
		System.out.println("How many values?");
		int b = s.nextInt();
		
		// for loop to run for every value added
		for(int i = 0; i<b; i++) {
			System.out.println("Give me a value:");
			int c = s.nextInt();
			int hashIndex = c%a;
			
			// if the hash index is not filled add the value, else use linear probing 
			if (hash[hashIndex] == 0)
				hash[hashIndex] = c;
			else {
				while (hash[hashIndex] != 0) {
					hashIndex = (hashIndex + 1) % a;
				}
				hash[hashIndex] = c;	
			}
			
			// print out each element in the array 
			for(int d = 0; d<hash.length; d++) {
				System.out.print(hash[d] + " ");
			}
			System.out.println(" ");
			System.out.println(" ");	
		}
	}
}
