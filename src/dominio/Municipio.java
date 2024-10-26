package dominio;
import java.util.ArrayList;
import java.io.Serializable;

public class Municipio implements Serializable{
	private String nombre;
	private ArrayList<Localidad> localidades;

	public Municipio(String nombre){
		this.nombre = nombre;
		localidades = new ArrayList<Localidad>();
	}
	public Municipio add(Localidad localidad){
		localidades.add(localidad);
		return this;
	}
	public int getPoblacion(){
		int poblacion=0;
		for(Localidad localidad:localidades){
			poblacion+=localidad.getPoblacion();
		}
		return poblacion;
	}
	public int getLocalidades(){
		return localidades.size();
	}
	public Localidad getLocalidad(int i){
		return localidades.get(i);
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Municipio: ").append(nombre).append("Poblacion: ").append(getPoblacion());
		for (Localidad localidad : localidades) {
			sb.append(localidad.toString());
		}
		return sb.toString();
	}
	public String getNombre() {
		return nombre;
	}
}