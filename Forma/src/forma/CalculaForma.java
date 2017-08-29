package forma;

import java.util.List;

public class CalculaForma {
	public static Forma calculaForma(List<Forma> formas){
		Forma maior = formas.get(0);
		for(Forma forma : formas){
			
			if(forma.area() > maior.area()){
				maior = forma;
			}
			
			
		}
		return maior;
		
		
		
	}

}
