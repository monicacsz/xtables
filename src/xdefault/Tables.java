package xdefault;

import java.util.Scanner;

public class Tables {
	public static void main(String[] args) {
	Scanner keyboardInput = new Scanner(System.in);
	System.out.println("Enter an integer number: ");
	int num = keyboardInput.nextInt();
	int i = 1;
	for(i = 1; i <= 10; i++) {
		System.out.println(num + " X " + i + " = " + num*i);
	}
	
}
	}
