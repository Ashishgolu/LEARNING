import java.util.Scanner;
public class TemperatureConvertorApp {

	public static void main(String[] args) {
	
		// TODO Auto-generated method 
		Scanner scan=new Scanner(System.in);
		System.out.println("enter Fahrenheit");
		double fahrenheit= scan.nextDouble();
		TemperatureConvertor temperatureConverter=new TemperatureConvertor();
	  double celcius =temperatureConverter.convertFahrenheitToCelsius(fahrenheit);
        System.out.println(celcius);
	}

}
