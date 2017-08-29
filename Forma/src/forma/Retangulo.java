package forma;

public class Retangulo extends Forma {

	private double base;
	private double altura;
	

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Retangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	protected final double area() {
		// TODO Auto-generated method stub
		return base * altura;
		
	}
	

}
