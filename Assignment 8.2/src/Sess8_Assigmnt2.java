import java.util.Scanner;

public class Sess8_Assigmnt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		String name, emailID;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the user:");
		name = sc.nextLine();
		System.out.println("Enter the email-id of the user:");
		emailID = sc.nextLine();
		System.out.println("Enter the age of the user:");
		age = sc.nextInt();
		if (age < 0) {
			throw new NegativeAgeException("Invalid input: Age cannot be negative");
		} else {
			System.out.println("----------User Details----------");
			System.out.println("Name: " + name + "\tEmail id: " + emailID + "\tAge: " + age);
		}
	}
}

/*
******************************************************************************
Output 1:
Enter the name of the user:
Adarsh
Enter the email-id of the user:
a@gmail.com
Enter the age of the user:
-22
Exception in thread "main" NegativeAgeException [Invalid input: Age cannot be negative]
	at Sess8_Assigmnt2.main(Sess8_Assigmnt2.java:17)
	
Output 2:
Enter the name of the user:
Adarsh
Enter the email-id of the user:
a@gmail
Enter the age of the user:
22
----------User Details----------
Name: Adarsh	Email id: a@gmail	Age: 22
******************************************************************************
*/