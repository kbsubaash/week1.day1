package week1.day2;

import java.util.Arrays;

public class LearnArray {
	public static void main(String[] args) {
		String name = "Subaash";
		String[] names = {"Subaash", "Nivedita", "Ramya"};
		System.out.println(name);
		System.out.println(names);
		Arrays.sort(names);
		int length = names.length;
		
		System.out.println(length);
		for(int i=0; i < length; i++)
			System.out.println(names[i]);
		
		
		System.out.println("_______________________________________________");
		String[] names2 = new String[5];
		names2[0] = "Radha";
		names2[2] = "Dinesh";
		names2[1] = "Parthi";
		for(int i=0; i < names2.length; i++)
			System.out.println(names2[i]);
		System.out.println(names2[1]+ " and "+names[2]);
		
	}
}
