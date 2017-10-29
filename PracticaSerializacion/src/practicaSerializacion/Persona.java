package practicaSerializacion;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Persona implements Serializable{
	private String nombre;
	private int DNI;
	private int edad;
	private static final long SerialversionUID = 1L;
	
	public Persona(String nombre, int DNI, int e){
		this.nombre = nombre;
		this.DNI = DNI;
		this.edad = e;
		
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", DNI=" + DNI + ", edad=" + edad + "]";
	}	

}
