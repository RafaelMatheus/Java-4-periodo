package serializacao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serializacao {
	public static void salvar(Serializable objeto) throws FileNotFoundException, IOException{
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("teste.txt"));
		out.writeObject(objeto);
		out.close();
		
	}
	
	public static Object ler() throws FileNotFoundException, IOException, ClassNotFoundException{
		Object obj = null;
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("teste.txt"));
		
		obj = in.readObject();
		in.close();
		
		return obj;
		
	}
	
}
