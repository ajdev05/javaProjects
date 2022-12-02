import java.util.Scanner;

public class NameRep {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first name of person 1: ");
		String first1 = input.nextLine();
		System.out.print("Enter the middle name of person 1: ");
		String middle1 = input.nextLine();
		System.out.print("Enter the last name of person 1: ");
		String last1 = input.nextLine();
		
		System.out.println();
		
		System.out.print("Enter the first name of person 2: ");
		String first2 = input.nextLine();
		System.out.print("Enter the middle name of person 2: ");
		String middle2 = input.nextLine();
		System.out.print("Enter the last name of person 2: ");
		String last2 = input.nextLine();
		
		Name name1 = new Name(first1, middle1, last1);
		Name name2 = new Name(first2, middle2, last2);
		
		System.out.println();
		System.out.println("Person 1:");
		System.out.println("First-middle-last: " + name1.firstMiddleLast());
		System.out.println("Last-first-middle: " + name1.lastFirstMiddle());
		System.out.println("Initials: " + name1.initials());
		System.out.println("Length: " + name1.length());
		
		System.out.println();
		System.out.println("Person 2:");
		System.out.println("First-middle-last: " + name2.firstMiddleLast());
		System.out.println("Last-first-middle: " + name2.lastFirstMiddle());
		System.out.println("Initials: " + name2.initials());
		System.out.println("Length: " + name2.length());
		
		System.out.println();
		if (name1.same(name2))
			System.out.println("Same name");
		else
			System.out.println("Different names");
	}
}