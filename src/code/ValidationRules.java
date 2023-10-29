package code;
import java.time.LocalDate;
import custom_exception.*;
public class ValidationRules {
public static Colour ColourAvailability(String clr) throws IllegalArgumentException
{
	return Colour.valueOf(clr.toUpperCase());
}

public static LocalDate OldModelCheckin(String date)throws OldModelException
{
	LocalDate manufacturingDate=LocalDate.parse(date);
	LocalDate check=LocalDate.of(2023, 1, 1);
	if(manufacturingDate.isBefore(check))
		throw new OldModelException("sorry car model is older than 2023 so can not add to the showroom!!!");
	return manufacturingDate;
}
	
public static Vehicle CheckConditions(int chesiNo,String carName,String colour,String manufacturingDate,
		double price) throws IllegalArgumentException,OldModelException
{
	Colour col=ColourAvailability(colour);
	LocalDate date=OldModelCheckin(manufacturingDate);
	return new Vehicle(chesiNo,carName,col,date,price);
}
	
		
}
