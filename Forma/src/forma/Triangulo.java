package forma;

public class Triangulo extends Forma {
	private double altura;
	private double base;
	
	
	@Override
	protected double area() {
		
		return (base * altura) / 2;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}


	public Triangulo(double altura, double base) {
		super();
		this.altura = altura;
		this.base = base;
	}
	
	
}
