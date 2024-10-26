package dominio;
import java.io.Serializable;
public class Localidad implements Serializable{
	private String nombre;
	private int poblacion;
	public Localidad(String nombre, int poblacion){
		this.nombre = nombre;
		this.poblacion = poblacion;
	}
	public Localidad setNombre(String nombre){
		this.nombre = nombre;
		return this;
	}
	public Localidad setPoblacion(int poblacion){
		this.poblacion = poblacion;
		return this;
	}
	public String getNombre(){
		return nombre;
	}
	public int getPoblacion(){
		return poblacion;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(nombre).append(" ; ").append(poblacion);
		return sb.toString();
	}
}