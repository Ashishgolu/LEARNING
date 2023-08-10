import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan=new Scanner(System.in);
     System.out.println("enter the marks");
     int score=scan.nextInt();
     Grade g1= new Grade();
     g1. precentGrade(score);
	}

}
