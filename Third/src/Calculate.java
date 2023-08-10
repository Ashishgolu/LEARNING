import java.util.Scanner;
public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the speed");
		double speed=scan.nextDouble();
		System.out.println("enter the time");
		double time=scan.nextDouble();
		double res=calculateDistance(speed,time);
		System.out.println(res);

	}
	public static double calculateDistance(double speed, double time)
	{
		return speed*time;
	}

}
