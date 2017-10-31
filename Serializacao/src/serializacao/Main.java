package serializacao;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		ArrayList<Pedra> pedras = new ArrayList<Pedra>();
		
		pedras.add(new Pedra("Quadrado", "azul",13));
		pedras.add(new Pedra("triangular", "preta", 14));
		
		
		try {
			Serializacao.salvar(pedras);
			ArrayList<Pedra> pedrasRecuperadas = (ArrayList<Pedra>) Serializacao.ler();
			for (Pedra pedra : pedrasRecuperadas) {
				System.out.println(pedra);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}
