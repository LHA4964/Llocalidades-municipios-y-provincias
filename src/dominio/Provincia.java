package dominio;
import java.util.ArrayList;
import java.io.Serializable;

public class Provincia implements Serializable{
	private String nombre;
	private ArrayList<Municipio> municipios;
	public Provincia(String nombre) {
		this.nombre = nombre;
		municipios=new ArrayList<Municipio>();
	}
	public Provincia add(Municipio municipio){
		municipios.add(municipio);
		return this;
	}
	public String getNombre() {
		return nombre;
	}
	public int getPoblacion(){
		int poblacion=0;
		for(Municipio municipio:municipios){
			poblacion+=municipio.getPoblacion();
		}
		return poblacion;
	}
	public ArrayList<Municipio> getMunicipios(){
		return municipios;
	}
	public Municipio getMunicipio(int i){
		return municipios.get(i);
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(nombre).append(" ; ").append(getPoblacion()).append("\n").append(municipios.toString());
		for (Municipio municipio : municipios) {
			sb.append(municipio.toString());
		}
		return sb.toString();
	}
	public int size(){
		return municipios.size();
	}
}