package dominio;
public class Localidad{
	private String nombre;
	private int numeroDeHabitantes;
	public Localidad(String nombre, int numeroDeHabitantes){
		this.nombre = nombre;
		this.numeroDeHabitantes = numeroDeHabitantes;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void setNumeroDeHabitantes(int numeroDeHabitantes){
		this.numeroDeHabitantes = numeroDeHabitantes;
	}
	public String getNombre(){
		return nombre;
	}
	public int getNumeroDeHabitantes(){
		return numeroDeHabitantes;
	}
	public String toString(){
		return nombre+": "+numeroDeHabitantes;
	}
}	