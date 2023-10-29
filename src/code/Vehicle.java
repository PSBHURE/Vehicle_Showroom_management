package code;
import code.Colour;
import java.time.LocalDate;
public class Vehicle {
	private int chesiNo;
	private String CarName;
	private Colour colour;
	private LocalDate manufacturingDate;
	private double price;//base price
	private boolean isAvailale;
	
	//parameterise constructor
	public Vehicle(int chesiNo,String CarName,Colour colour,LocalDate manufacturingDate,double price)
	{
		this.chesiNo=chesiNo;
		this.CarName=CarName;
		this.colour=colour;
		this.manufacturingDate=manufacturingDate;
		this.price=price;
		isAvailale=true;
	}

	//getter
	public String getCarName() {
		return CarName;
	}

	public double getPrice() {
		return price;
	}
	
	public Colour getColour() {
		return colour;
	}
	
	public int getChesiNo() {
		return chesiNo;
	}
	
	public LocalDate getManufacturingDate() {
		return manufacturingDate;
	}
	
	//setter
	public void setCarName(String carName) {
		CarName = carName;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	@Override
	public String toString() {
		return "Vehicle [chesiNo=" + chesiNo + ", CarName=" + CarName + ", manufacturingDate=" + manufacturingDate
				+ ", price=" + (price+colour.getColourPrice() )+ ", isAvailale=" + isAvailale + "]";
	}
	
	public boolean equals(Object car)
	{
		if(car instanceof Vehicle)
		{
			Vehicle V=(Vehicle)car;
			return this.chesiNo==V.chesiNo;
		}
		return false;
	}
	
}
