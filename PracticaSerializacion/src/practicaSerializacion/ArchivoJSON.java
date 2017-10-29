package practicaSerializacion;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ArchivoJSON {
	private String nombre;
	private int edad;
	private ArrayList<String> telefonos;
	

	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public ArrayList<String> getTelefonos() {
		return telefonos;
	}


	public void setTelefonos(ArrayList<String> telefonos) {
		this.telefonos = telefonos;
	}


	public void generarJSON(String archivo){
	Gson gson = new GsonBuilder().setPrettyPrinting().create();
	String json = gson.toJson(this);
	
	try{
		FileWriter writer = new FileWriter(archivo);
		writer.write(json);
		writer.close();
			
	}	catch(Exception e){
	  e.printStackTrace();
	}
	
	
	}
	
	
	public static ArchivoJSON leerJSON(String archivo){
		Gson gson  = new Gson();
		ArchivoJSON ret = null;
		
		try{
			BufferedReader br= new BufferedReader(new FileReader(archivo));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return ret;
	}	
	
	public static void main(String[] args) {
		ArchivoJSON ajson = new ArchivoJSON();
		ArchivoJSON ajson2 = new ArchivoJSON();
	    ajson.setNombre("Adri");
		ajson.setEdad(31);
		ajson2.setNombre("Tamara");
		ajson2.setEdad(21);
	
		ajson.generarJSON("archivoJSON.TXT");
	//	ajson.leerJSON("Persona.txt");
	}
	
}