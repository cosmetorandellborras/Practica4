/**
 * Clase Adulto, conjunto de objetos que comparten los mismos atributos
 * Visibilidad publica, podra ser vista desde la misma clase, sublase, paquete y para todos en general
 * Se trata de una sub clase Persona
 * @author cosmetorandell / rafelllull
 */
public class Adulto extends Persona {
	/**
	 * Atributos
	 * Visibilidad privada, solo puede ser vista desde la misma clase
	 * NSS y dirección son de tipo String
	 */
	private String nss;
	private String direccion;
	
	//Setters i getters
	/**
	 * Método getNSS
	 * Este método nos permitirá obtener el valor del atributo nss del objeto
	 * Visibilidad publica, podra ser vista desde la misma clase, subclase, paquete y para todos en general
	 * @return nss, nos retorna un String con el numero de la seguridad social del objeto
	 */
	public String getNSS() {
		return nss;
	}
	/**
	 * Método setNSS
	 * Este método nos permitira modificar el atributo nss del objeto
	 * Visibilidad publica, podra ser vista desde la misma clase, subclase, paquete y para todos en general
	 * @param nSS, se le pasa por parámetro un String que nos definira el nuevo numero nss del objeto
	 */
	public void setNSS(String nSS) {
		nss = nSS;
	}
	/**
	 * Método getDirección
	 * Este método nos permitirá obtener el atributo dirección del objeto
	 * Visibilidad publica, podra ser vista desde la misma clase, subclase, paquete y para todos en general
	 * @return direccion, nos retorna un String con la dirección del objeto
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * Método setDireccion
	 * Este metodo nos permitira modificar el atributo dirección del objeto
	 * Visibilidad publica, podra ser vista desde la misma clase, subclase, paquete y para todos en general
	 * @param direccion, el parámetro direccion de tipo String nos definira la nueva dirección del objeto
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	//Constructores
	/**
	 * Constructor vacío
	 * Visibilidad publica, podra ser vista desde la misma clase, subclase, paquete y para todos en general
	 */
	
	public Adulto() {
		
	}
	/**
	 * Constructor completo
	 * Visibilidad publica, podra ser vista desde la misma clase, subclase, paquete y para todos en general
	 * Este constructor completo, le pasaremos por parametro los atributos de Persona, seguidos de los atributos de Adulto
	 * @param nombre, el parámetro nombre de tipo String nos definirá el nuevo nombre del objeto
	 * @param dni, el parámetro dni de tipo String nos definirá el nuevo dni del objeto
	 * @param edad, el parámetro edad de tipo integer nos definirá la nueva edad del objeto
	 * @param nss, el parámetro nSS de tipo String nos definirá el nuevo numero nss del objeto
	 * @param direccion, el parámetro direccion de tipo String nos definirá la nueva dirección del objeto
	 */
	public Adulto(String nombre, String dni, int edad, String nss, String direccion) {
		super(nombre, dni, edad); //Necesitamos llamar al constructor de la clase Persona con "super()" para introducir los atributos de la clase Persona, posteriormente se agragaran los de Adulto
		this.nss = nss;
		this.direccion = direccion;
	}
	/**
	 * Método toString
	 * Este metodo nos sobreescribira el metodo toString de la clase object, de tal manera que nos imprimira un String con los atributos del objeto de la clase Adulto
	 */
	@Override
	public String toString() {
		return "Adulto [Nombre=" + this.getNombre() + ", Dni=" + this.getDni() + ", Edad=" + this.getEdad() + "nss=" + nss + ", direccion=" + direccion + "]";
	}

}