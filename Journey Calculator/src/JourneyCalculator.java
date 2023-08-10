import java.util.Scanner;
public class JourneyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan= new Scanner(System.in);
    System.out.println("enter the speed ");
    double  speed=scan.nextDouble();
    System.out.println("enter time taken");
    double  time =scan.nextDouble();
    Journey journey=new Journey();
   double distance= journey.calculateDistance(speed,time);
   System.out.println(distance);
	}

}
