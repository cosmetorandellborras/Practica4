import nuevoPaquete.sonido;
import java.sql.Date;
/**
 * Clase Lancha, conjunto de objetos que comparten los mismos atributos
 * Visibilidad publica, podra ser vista desde la misma clase, sublase, paquete y para todos en general
 * Implementa la interfaz Sonido
 * Esta clase mantiene una relacion de composición con la clase Motor, Lancha necesita de un motor para estar completo, sin el motor Lancha por si solo no esta completo
 * @author cosmetorandell / rafelllull
 */
public class Lancha implements sonido {
	//Atributos
	/**
	 * Atributos
	 * Visibilidad privada, solo puede ser vista desde la misma clase
	 * Nombre es de tipo String
	 * fechaConstruccion es de tipo Date
	 * numCamarotes es de tipo integer
	 * motor es de tipo clase Motor, al tener una relación de composición con Motor, Motor sera un atributo de la clase Lancha
	 */
	  private String nombre;
	  private Date fechaConstruccion;
	  private int numCamarotes;
	  private Motor motor;
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
	 * Método getFechaConstrucción
	 * Este meétodo permitirá obtener el valor del atributo fechaConstrucción del objeto
	 * Visibilidad pública, podra ser vista desde la misma clase, subclase, paquete y para todos en general
	 * @return fechaConstruccion, nos retorna un Date con la fecha de construcción
	 */
	public Date getFechaConstruccion() {
		return fechaConstruccion;
	}
	/**
	 * Método setFechaConstruccion
	 * Este método nos permitirá modificar el atributo fechaConstruccion del objeto
	 * Visibilidad pública, podra ser vista desde la misma clase, subclase, paquete y para todos en general
	 * @param fechaConstruccion, se le pasa por parámetro un Date que nos definirá la nueva fecha de construccion
	 */
	public void setFechaConstruccion(Date fechaConstruccion) {
		this.fechaConstruccion = fechaConstruccion;
	}
	/**
	 * Método getNumCamarotes
	 * Este método nos permitirá obtener el valor del atributo numCamarotes del objeto
	 * Visibilidad pública, podra ser vista desde la misma clase, subclase, paquete y para todos en general
	 * @return numCamarotes, nos retorna un integer con el numero de camarotes del objeto
	 */
	public int getNumCamarotes() {
		return numCamarotes;
	}
	/**
	 * Método setNumCamarotes
	 * Este método nos permitira modificar el valor del atributo numCamarotes del objeto
	 * Visibilidad pública, podra ser vista desde la misma clase, subclase, paquete y para todos en general
	 * @param numCamarotes, se le pasa por parámetro un integer que nos definirá el nuevo numero de camarotes
	 */
	public void setNumCamarotes(int numCamarotes) {
		this.numCamarotes = numCamarotes;
	}
	//Contructores
	/**
	 * Constructor vacío
	 * Visibilidad publica, podra ser vista desde la misma clase, subclase, paquete y para todos en general
	 * Al tener una relacion de composicion, los constructores al crear un nuevo objeto necesitan crear también un nuevo Motor
	 */
	public Lancha() {
		motor = new Motor();
	}
	/**
	 * Constructor completo
	 * Visibilidad pública, podra ser vista desde la misma clase, subclase, paquete y para todos en general
	 * Este constructor completo, le pasaremos por parametro los atributos de Lancha
	 * Al tener una relacion de composicion, los constructores al crear un nuevo objeto necesitan crear también un nuevo Motor, y este llamara al constructor completo de Motor al cual se le pasaran los atributos del nuevo Motor
	 * @param fabricante, el parámetro fabricante de tipo String nos definirá el nuevo fabricante del objeto
	 * @param potencia, el parámetro potencia de topo String nos definirá la potencia del objeto
	 * @param codigo, el parámetro codigo de tipo integer nos definirá el nuevo codigo del objeto
	 * @param nombre, el parámetro nombre de tipo String nos definirá el nuevo nombre del objeto
	 * @param fechaConstruccion, el parámetro de tipo Date nos definirá la nueva fecha de construcción del objeto
	 * @param numCamarotes, el parámetro de tipo integer nos definirá el nuevo numero de camarotes
	 */
	public Lancha(String fabricante,String potencia, int codigo, String nombre, Date fechaConstruccion, int numCamarotes) {
		this.motor = new Motor(fabricante, potencia, codigo);
		this.nombre = nombre;
		this.fechaConstruccion = fechaConstruccion;
		this.numCamarotes = numCamarotes;
	}
	/**
	 * Método toString
	 * Este metodo nos sobreescribira el metodo toString de la clase object, de tal manera que nos imprimira un String con los atributos del objeto de la clase Lancha
	 */
	@Override
	public String toString() {
		return "Barco [nombre=" + nombre + ", fechaConstruccion=" + fechaConstruccion + ", numCamarotes=" + numCamarotes + "]";
	}
	/**
	 * Método sonido
	 * Lancha al implementar sonido, este método sobreescribe el método sonido y lo implementa imprimiendo un String con el sonido particular de este objeto
	 */
	@Override
	public void sonido() {
		System.out.print("La lancha hace brrrr");
		
	}
	
}