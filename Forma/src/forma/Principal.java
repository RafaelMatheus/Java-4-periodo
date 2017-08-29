package forma;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		List<Forma> formas = new ArrayList<Forma>();
		
		formas.add(new Circulo(5));
		formas.add(new Triangulo(9, 3));
		
		
		Forma forma = CalculaForma.calculaForma(formas);
		
		
		System.out.println(forma.area());
		

	}

}
