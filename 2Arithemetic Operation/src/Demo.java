import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scan=new Scanner(System.in);
 System.out.println("enter two number");
 int num1=scan.nextInt();
 int num2=scan.nextInt();
 System.out.println(galacticAdd(num1,num2));
 System.out.println(galacticSub(num1,num2));
	}
  public static int galacticAdd(int num1,int num2)
  {
	  return num1+num2;
  }
   public static int galacticSub(int num1,int num2)
   {
	   return num1-num2;
   }
}

