/**
 * Clase Mascota, conjunto de objetos que comparten los mismos atributos
 * Visibilidad publica, podra ser vista desde la misma clase, sublase, paquete y para todos en general
 * Clase abstracta, ya que nunca se van a crear instancias de esta clase
 * Se trata de una super clase Mascota, la cual tendra las subclases Perro y Gato
 * Implemenenta la interfaz sonido
 * @author cosmetorandell / rafelllull
 */
public abstract class Mascota implements Sonido{
	/**
	 * Atributos
	 * Visibilidad privada, solo puede ser vista desde la misma clase
	 * nombre es de tipo String, edad es de tipo integer
	 */
	private String nombre;
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
	/**
	 * Constructor vacío
	 * Visibilidad publica, podra ser vista desde la misma clase, subclase, paquete y para todos en general
	 */
	public Mascota() {
		
	}
	/**
	 * Constructor completo
	 * Visibilidad pública, podra ser vista desde la misma clase, subclase, paquete y para todos en general
	 * Este constructor completo, le pasaremos por parametro los atributos de Mascota
	 * @param nombre, el parámetro nombre de tipo String nos definirá el nuevo nombre del objeto
	 * @param edad, el parámetro edad de tipo integer nos definirá la nueva edad del objeto
	 */
	public Mascota(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	/**
	 * Método toString
	 * Este metodo nos sobreescribira el metodo toString de la clase object, de tal manera que nos imprimira un String con los atributos del objeto de la clase Mascota
	 * No obstante, al ser una clase abstracta, nunca habra objetos de la clase Mascota que imprimir por pantalla
	 */
	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", edad=" + edad + "]";
	}

}