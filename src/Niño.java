/**
 * Clase Niño, conjunto de objetos que comparten los mismos atributos
 * Visibilidad publica, podra ser vista desde la misma clase, sublase, paquete y para todos en general
 * Se trata de una sub clase Persona
 * Niño tiene una relacion de agregación con Juguete, Niño es completo por si solo y Juguete tambén, pero Niño puede comprar un Juguete
 * @author cosmetorandell / rafelllull
 */
public class Niño extends Persona{
	/**
	 * Atributos
	 * Visibilidad privada, solo puede ser vista desde la misma clase
	 * Colegio es de tipo String y juguete del tipo de clase juguete
	 */
	private String colegio;
	private Juguete juguete;
	//Getters i setters
	/**
	 * Método getColegio
	 * Este método nos permitirá obtener el valor atributo colegio del objeto
	 * Visibilidad pública, podra ser vista desde la misma clase, subclase, paquete y para todos en general
	 * @return colegio, nos retorna un String con el nombre del colegio del objeto.
	 */
	public String getColegio() {
		return colegio;
	}
	/**
	 * Método setColegio
	 * Este método nos permitirá modificar el atributo colegio del objeto
	 * Visibilidad pública, podra ser vista desde la misma clase, subclase, paquete y para todos en general
	 * @param colegio, se le pasa por parámetro un String que nos definirá el nuevo nombre del colegio del objeto
	 */
	public void setColegio(String colegio) {
		this.colegio = colegio;
	}
	/**
	 * Método compra
	 * Este metodo permitirá al objeto de la clase Juguete, comprar un Juguete debido a su relación de agregación
	 * Visibilidad pública, podra ser vista desde la misma clase, subclase, paquete y para todos en general
	 * @param juguete, se le pasa por parametro un objeto de la clase Juguete, que nos definirá el nuevo Juguete del objeto
	 */
	public void compra(Juguete juguete) {
		this.juguete = juguete;
	}
	//Constructores
	/**
	 * Constructor vacío
	 * Visibilidad publica, podra ser vista desde la misma clase, subclase, paquete y para todos en general
	 */

	public Niño() {
		
	}
	/**
	 * Constructor completo
	 * Visibilidad publica, podra ser vista desde la misma clase, subclase, paquete y para todos en general
	 * Este constructor completo, le pasaremos por parametro los atributos de Persona, seguidos de los atributos de Niño
	 * @param nombre, el parámetro nombre de tipo String nos definirá el nuevo nombre del objeto
	 * @param dni, el parámetro dni de tipo String nos definirá el nuevo dni del objeto
	 * @param edad, el parámetro edad de tipo integer nos definirá la nueva edad del objeto
	 * @param colegio, el parámetro colegio de tipo String nos definirá el nuevo nombre del colegio del objeto
	 */
	public Niño(String nombre, String dni, int edad, String colegio) {
		super(nombre, dni, edad);//Necesitamos llamar al constructor de la clase Persona con "super()" para introducir los atributos de la clase Persona, posteriormente se agragaran los de Niño
		this.colegio = colegio;
	}
	/**
	 * Método toString
	 * Este metodo nos sobreescribira el metodo toString de la clase object, de tal manera que nos imprimira un String con los atributos del objeto de la clase Niño
	 */
	@Override
	public String toString() {
		return "Niño [Nombre=" + this.getNombre() + ", Dni=" + this.getDni() + ", Edad=" + this.getEdad() + "colegio=" + colegio + "]";
	}
}