	/**
	 * Clase Juguete, conjunto de objetos que comparten los mismos atributos
	 * Visibilidad publica, podra ser vista desde la misma clase, sublase, paquete y para todos en general
	 * Tiene una relacion de agregacion con la clase Niño
	 * @author cosmetorandell / rafelllull
	 */

public class Juguete {
	/**
	 * Atributos
	 * Visibilidad privada, solo puede ser vista desde la misma clase
	 * Nombre es de tipo String, precio y edadRecomendada son de tipo integer
	 */
	private String nombre;
	private int precio;
	private int edadRecomendada;
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
	 * Método getPrecio
	 * Este método permitirá obtener el valor del atributo precio del objeto
	 * Visibilidad pública, podra ser vista desde la misma clase, subclase, paquete y para todos en general
	 * @return precio, nos retorna un integer con el precio del objeto
	 */
	public int getPrecio() {
		return precio;
	}
	/**
	 * Método setPrecio
	 * Este método nos permitirá modificar el atributo precio del objeto
	 * Visibilidad pública, podra ser vista desde la misma clase, subclase, paquete y para todos en general
	 * @param precio, se le pasa por parámetro un integer que nos definirá el nuevo precio del objeto
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	/**
	 * Método getEdadRecomendada
	 * Este método permitirá obtener el valor del artibuto edad recomendada del objeto
	 * Visibilidad pública, podra ser vista desde la misma clase, subclase, paquete y para todos en general
	 * @return edadRecomendada, nos retorna un integer con la edad recomendada del objeto
	 */
	public int getEdadRecomendada() {
		return edadRecomendada;
	}
	/**
	 * Método setEdadRecomendada
	 * Este método nos permitira modificar el atributo edad recomendada del objeto
	 * Visibilidad pública, podra ser vista desde la misma clase, subclase, paquete y para todos en general
	 * @param edadRecomendada, se le pasa por parámetro un integer que nos definirá la nueva edad recomendada del objeto
	 */
	public void setEdadRecomendada(int edadRecomendada) {
		this.edadRecomendada = edadRecomendada;
	}
	//Constructores
	/**
	 * Constructor vacío
	 * Visibilidad publica, podra ser vista desde la misma clase, subclase, paquete y para todos en general
	 */
	public Juguete() {
		
	}
	/**
	 * Constructor completo
	 * Visibilidad publica, podra ser vista desde la misma clase, subclase, paquete y para todos en general
	 * Este constructor completo, le pasaremos por parametro los atributos de Juguete
	 * @param nombre, el parámetro nombre de tipo String nos definirá el nuevo nombre del objeto
	 * @param precio, el parámetro precio de tipo integer nos definirá el nuevo precio del objeto
	 * @param edadRecomendada, el parámetro edadRecomendada de tipo integer nos definirá la nueva edad recomendada del objeto
	 */
	public Juguete(String nombre, int precio, int edadRecomendada) {
		this.nombre = nombre;
		this.precio = precio;
		this.edadRecomendada = edadRecomendada;
	}
	/**
	 * Método toString
	 * Este metodo nos sobreescribira el metodo toString de la clase object, de tal manera que nos imprimira un String con los atributos del objeto de la clase Juguete
	 */
	@Override
	public String toString() {
		return "Juguete [nombre=" + nombre + ", precio=" + precio + ", edadRecomendada=" + edadRecomendada + "]";
	}

}