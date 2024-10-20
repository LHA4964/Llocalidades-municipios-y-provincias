package aplicacion;
import dominio.Localidad;

public class Principal {
	public static void main(String[] args) {
        // Crear un objeto de la clase Localidad
        Localidad localidad = new Localidad("Madrid", 3000000);

        // Mostrar el objeto Localidad por pantalla
        System.out.println(localidad.toString());
	}
}