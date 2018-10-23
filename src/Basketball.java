
	public class Basketball {
	private double price;
	private String brand;

	Basketball(double price, String brand) {
		this.price = price;
		this.brand = brand;
	}

	public double getprice() {
		return this.price;

	}

	public String getbrand() {
		return this.brand();
	}


	public static void main(String[] args) {
		Basketball ball = new Basketball(21.5, "Wilson");
		System.out.println(ball.getprice());
		System.out.println(ball.getbrand());
	}

	public void PriceDrop() {
		this.price = 100.76;
		this.brand = "Nike";
	}
}
