package dominio;
import java.util.*;

public class Provincia{
	private ArrayList<Municipio> municipioProvincia = new ArrayList<>();

	public void annadir(Municipio municipio){
		municipioProvincia.add(municipio);
	}
	public int getTotalHabitantes(){
		int totalHabitantes=0;
		for (Municipio municipio: municipioProvincia){
			totalHabitantes += municipio.getTotalHabitantes();
		}
		return totalHabitantes;
	}
	public String toString(){
		String list = "";
		for (Municipio municipio : municipioProvincia) {
            		list = (municipio.toString()+"\n");
		}
		return list;
	}
}