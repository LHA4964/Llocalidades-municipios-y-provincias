package dominio;
import java.util.*;

public class Municipio{
	private ArrayList<Localidad> localidadMunicipio = new ArrayList<>();

	public void annadir(Localidad localidad){
		String nombre = localidad.getNombre();
		int habitantes = localidad.getNumeroDeHabitantes();
		Localidad loc = new Localidad(nombre, habitantes);
		localidadMunicipio.add(loc);
	}
	public int getTotalHabitantes(){ 	
		int totalHabitantes=0;
		for (Localidad localidad: localidadMunicipio){
			totalHabitantes += localidad.getNumeroDeHabitantes();
		}
		return totalHabitantes;
	}
	public String toString(){
		String lista = "";
		for (Localidad localidad : localidadMunicipio) {
            		lista = (localidad.toString()+"\n");
        	}
		return lista;
	}
}