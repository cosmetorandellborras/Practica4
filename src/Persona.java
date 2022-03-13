/**
 * Clase Persona, conjunto de objetos que comparten los mismos atributos
 * Visibilidad publica, podra ser vista desde la misma clase, sublase, paquete y para todos en general
 * Clase abstracta, ya que nunca se van a crear instancias de esta clase
 * Se trata de una super clase Persona, la cual tendra las subclases Adulto y Niño
 * @author cosmetorandell / rafelllull
 */
public abstract class Persona {
	/**
	 * Atributos
	 * Visibilidad privada, solo puede ser vista desde la misma clase
	 * Nombre y dni son de tipo String, edad es de tipo integer
	 */
	private String nombre;
	private String dni;
	private int edad;
	//Getters i setters
	/**
	 * Método getNombre
	 * Este método permitirá obtener el valor del atributo nombre del objeto
	 * Visibilidad pública, podra ser vista desde la misma clase, subclase, paquete y para todos en general
	 * @return nombre, nos retorna un String con el nombre del objeto.
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Método setNombre
	 * Este método nos permitirá modificar el atributo nombre del objeto
	 * Visibilidad pública, podra ser vista desde la misma clase, subclase, paquete y para todos en general
	 * @param nombre, se le pasa por parámetro un String que nos definirá el nuevo nombre del objeto
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Método getDni
	 * Este método permitirá obtener el valor del artributo dni del objeto
	 * Visibilidad pública, podra ser vista desde la misma clase, subclase, paquete y para todos en general
	 * @return dni, nos retorna un String con el dni del objeto
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * Método setDni
	 * Este método nos permitirá modificar el atributo dni del objeto
	 * Visibilidad pública, podra ser vista desde la misma clase, subclase, paquete y para todos en general
	 * @param dni, se le pasa por parámetro un String que nos definirá el nuevo dni del objeto
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	/**
	 * Método getEdad
	 * Este método permitirá obtener el valor del atributo edad del objeto
	 * Visibilidad pública, podra ser vista desde la misma clase, subclase, paquete y para todos en general
	 * @return edad, nos retorna un integer con la edad del objeto
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * Método setEdad
	 * Este método nos permitirá modificar el atributo edad del objeto
	 * Visibilidad pública, podra ser vista desde la misma clase, subclase, paquete y para todos en general
	 * @param edad, se le pasa por parámetro un integer que nos definirá la nueva edad del objeto
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	//Constructors
	/**
	 * Constructor completo
	 * Visibilidad pública, podra ser vista desde la misma clase, subclase, paquete y para todos en general
	 * Este constructor completo, le pasaremos por parametro los atributos de Persona
	 * @param nombre, el parámetro nombre de tipo String nos definirá el nuevo nombre del objeto
	 * @param dni, el parámetro dni de tipo String nos definirá el nuevo dni del objeto
	 * @param edad, el parámetro edad de tipo integer nos definirá la nueva edad del objeto
	 */
	public Persona(String nombre, String dni, int edad) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
	}
	/**
	 * Constructor vacío
	 * Visibilidad publica, podra ser vista desde la misma clase, subclase, paquete y para todos en general
	 */
	public Persona() {
		
	}
	/**
	 * Método toString
	 * Este metodo nos sobreescribira el metodo toString de la clase object, de tal manera que nos imprimira un String con los atributos del objeto de la clase Persona
	 * No obstante, al ser una clase abstracta, nunca habra objetos de la clase Persona que imprimir por pantalla
	 */
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + "]";
	}
}