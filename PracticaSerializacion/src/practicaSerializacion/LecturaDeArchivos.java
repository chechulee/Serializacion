package practicaSerializacion;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class LecturaDeArchivos {

	
	
public static void main(String[] args) {
	//escribirArchivo("animales.txt");
	leerArchivo("animales.txt");
	//lecturaDeConsola();
	
	//lecturaDeConsolaNumeros();
	System.out.println("Fin del programa! ");
	
}
	
public static void escribirArchivo(String archivo){
	try {
		FileOutputStream fos = new FileOutputStream(archivo);
		OutputStreamWriter out = new OutputStreamWriter(fos);
		out.write("No como animales");
		out.write("\r\n");
		out.write("Los animales tienen derecho de vivir!");
		out.close();
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}

public static void leerArchivo(String archivo){
	try {
		FileInputStream fis = new FileInputStream(archivo);
		Scanner scanner = new Scanner(fis);
		String s1 = scanner.nextLine();
		String s2 = scanner.nextLine();
		scanner.close();
		System.out.println("Contenido del archivo " + archivo + " : ");
		System.out.println(s1);
		System.out.println(s2);
	} catch (Exception e) {
		e.printStackTrace();
	}
}

public static void lecturaDeConsola(){
	InputStreamReader stdin = new InputStreamReader(System.in);
	BufferedReader console = new BufferedReader(stdin);
	try{
		String str =console.readLine();
		System.out.println("El usuario ingreso: " + str);
		
	}catch(IOException ex){
		ex.printStackTrace();}
}

public static void lecturaDeConsolaNumeros(){
	InputStreamReader stdin = new InputStreamReader(System.in);
	BufferedReader console = new BufferedReader(stdin);
	try{
		System.out.println("Querido usuario, ingrese un número por favor: ");
		String str =console.readLine();
		Double valor = Double.parseDouble(str);
		System.out.println("El usuario ingreso: " + valor);
		
	}catch(IOException ex){
		ex.printStackTrace();}
}

public static void leerArchivosXML(String archivo){
	
}


}
