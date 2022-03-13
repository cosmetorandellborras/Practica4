import nuevoPaquete.sonido;
/**
 * Clase Pajaro, conjunto de objetos que comparten los mismos atributos
 * Visibilidad publica, podra ser vista desde la misma clase, sublase, paquete y para todos en general
 * Se trata de una sub clase Mascota
 * Implementa la interfaz Sonido por herencia
 * @author cosmetorandell / rafelllull
 */

public class Pajaro extends Mascota implements sonido {
	/**
	 * Atributos
	 * Visibilidad privada, solo puede ser vista desde la misma clase
	 * Raza es de tipo String
	 */
	private String raza;
	//Getters i setters
	/**
	 * Método getRaza
	 * Este método permitirá obtener el valor del atributo raza del objeto
	 * Visibilidad pública, podra ser vista desde la misma clase, subclase, paquete y para todos en general
	 * @return raza, nos retorna un String con la raza del objeto.
	 */
	public String getRaza() {
		return raza;
	}
	/**
	 * Método setRaza
	 * Este método nos permitirá modificar el atributo raza del objeto
	 * Visibilidad pública, podra ser vista desde la misma clase, subclase, paquete y para todos en general
	 * @param raza, se le pasa por parámetro un String que nos definirá la nueva raza del objeto
	 */
	public void setRaza(String raza) {
		this.raza = raza;
	}
	/**
	 * Constructor vacío
	 * Visibilidad publica, podra ser vista desde la misma clase, subclase, paquete y para todos en general
	 */
	public Pajaro() {
		
	}
	/**
	 * Constructor completo
	 * Visibilidad publica, podra ser vista desde la misma clase, subclase, paquete y para todos en general
	 * Este constructor completo, le pasaremos por parametro los atributos de Mascota, seguidos de los atributos de Pajaro
	 * @param nombre, el parámetro nombre de tipo String nos definirá el nuevo nombre del objeto
	 * @param edad, el parámetro edad de tipo integer nos definirá la nueva edad del objeto
	 * @param raza, el parámetro raza de tipo String nos definirá la nueva raza del objeto
	 */
	public Pajaro(String nombre, int edad, String raza) {
		super(nombre,edad); //Necesitamos llamar al constructor de la clase Masota con "super()" para introducir los atributos de la clase Mascota, posteriormente se agragaran los de Pajaro
		this.raza = raza;
	}
	/**
	 * Método toString
	 * Este metodo nos sobreescribira el metodo toString de la clase object, de tal manera que nos imprimira un String con los atributos del objeto de la clase Pajaro
	 */
	public String toString() {
		return "Pajaro [Nombre=" + this.getNombre() + ", edad=" + this.getEdad() + ", raza= " + raza + "]";
	}
	/**
	 * Método sonido
	 * Pajaro al implementar sonido por herencia, este método sobreescribe el método sonido y lo implementa imprimiendo un String con el sonido particular de este objeto
	 */
	@Override
	public void sonido() {
		System.out.print("El pajaro hace pio pio");
	}
	

}
