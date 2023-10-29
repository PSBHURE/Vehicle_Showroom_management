package code;

public enum Colour {
BLACK(10000),WHITE(8000),RED(6000),BLUE(4000),GRAY(3000);
	double ColourPrice;
	private Colour(double ColourPrice)
	{
		this.ColourPrice=ColourPrice;
	}
	//getter
	public double getColourPrice() {
		return ColourPrice;
	}
	
	//setter
	public void setColourPrice(double colourPrice) {
		ColourPrice = colourPrice;
	}
	
}
