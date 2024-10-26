package dominio;
import java.util.ArrayList;
import java.io.*;

public class Pais implements Serializable{
	private String nombre;
	private ArrayList<Provincia> provincias = new ArrayList<Provincia>();
	public Pais add(Provincia provincia){
		provincias.add(provincia);
		return this;
	}
	public String getNombre() {
		return nombre;
	}
	public Pais setNombre(String nombre){
		this.nombre = nombre;
		return this;
	}
	public int getPoblacion(){
		int poblacion=0;
		for(Provincia provincia:provincias){
			poblacion+=provincia.getPoblacion();
		}
		return poblacion;
	}
	public ArrayList<Provincia> getProvincias(){
		return provincias;
	}
	public Provincia getProvincia(int i){
		return provincias.get(i);
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(nombre).append(" ; ").append(getPoblacion()).append("\n").append(provincias.toString());
		return sb.toString();
	}
	public int size(){
		return provincias.size();
	}
	public void grabar(){
		try{
			ObjectOutputStream fo=new ObjectOutputStream (new FileOutputStream("pais.ser"));
			fo.writeObject(this);
			fo.close();
		} catch (Exception e){
			System.out.println("error de escritura");
		}
	}
	public static Pais leer(){
		try{
			ObjectInputStream fi=new ObjectInputStream(new FileInputStream("pais.ser"));
			Pais p= (Pais) fi.readObject();
			fi.close();
			return p;
		} catch (Exception e){
			return new Pais();
		}
	}
}