package stack_brackets;

import java.util.Scanner;

public class DriverCode {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter expression");
		String input=in.next();
		
		Brackets_Stack bs=new Brackets_Stack();
		if(bs.validate(input))
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets");
		
	}

}
