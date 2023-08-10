import java.util.Scanner;
public class Double {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scan=new Scanner(System.in);
 System.out.println("enter the number");
 int  num1=scan.nextInt();
 System.out.println(doubleNumber(num1));
	}
	public static int doubleNumber(int num1)
	{
		return num1*2;
	}

}
