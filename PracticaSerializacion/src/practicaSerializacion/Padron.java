package practicaSerializacion;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedList;

public class Padron implements Serializable {
	private static final long serialversionUID = 1L;
	private LinkedList <Persona> personas ;

	
	
	public Padron(){
		personas = new LinkedList<Persona>();
	}
	
public static void main(String[] args) {
	Padron padron = new Padron();
	Persona p1 = new Persona("Ceci",27527061,38);
	Persona p2 = new Persona("Tami", 93505511,21);
	Persona p3 = new Persona("Adri", 30789433, 30);
	
	padron.personas.add(p1);
	padron.personas.add(p2);
	padron.personas.add(p3);
	
	guardarPadron(padron);




	
	
}


public static  Padron leerPadron() {
	Padron padron = null;
	try{
		FileInputStream f = new FileInputStream("Padron.txt");
		ObjectInputStream in = new ObjectInputStream(f);
		
		padron = (Padron) in.readObject();
		in.close();
		
	}catch(Exception e){
		e.printStackTrace();
	}
	return padron;
}

public static void guardarPadron(Padron padron) {
	FileOutputStream fos;
	try {
		fos = new FileOutputStream("Padron.txt");
		ObjectOutputStream out = new ObjectOutputStream(fos);
		out.writeObject(padron);
		out.close();
		
	} catch (Exception e) {
				e.printStackTrace();
	}
}	
	
@Override
public String toString() {
	return "Padron [personas=" + personas + "]";
}

	
}
