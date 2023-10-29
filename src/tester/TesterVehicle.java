package tester;
import java.time.LocalDate;
import java.util.Scanner;
import code.*;
import custom_exception.*;
import static code.ValidationRules.CheckConditions;
public class TesterVehicle {

	public static void main(String[] args) {
		//Vehicle[] cars=new Vehicle[10];
		try(Scanner sc=new Scanner(System.in))
		{		
			System.out.println("enter int chesiNo,String carName,String colour,String manufacturingDate,double price");
			Vehicle V1=CheckConditions(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.nextDouble());
			System.out.println(V1);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	}

}
//100 SUV-700 black 2020-10-15 1500000