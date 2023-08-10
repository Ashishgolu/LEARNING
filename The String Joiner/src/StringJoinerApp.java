import java.util.Scanner;
public class StringJoinerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your first name and last name");
		String firstName=scan.next();
		String lastName=scan.next();
		System.out.println(joinString( firstName,lastName));

	}
	public static String joinString(String str1,String str2)
	{
		return str1+str2;
	}

}
