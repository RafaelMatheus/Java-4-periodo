package forma;

public class Circulo extends Forma {
	public static final double PI = 3.14;
	private double raio;

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public static double getPi() {
		return PI;
	}

	@Override
	protected double area() {
		// TODO Auto-generated method stub
		return Math.pow(raio, 2) * PI;

	}

}
