/**
 * Clase Motor, conjunto de objetos que comparten los mismos atributos
 * Visibilidad publica, podra ser vista desde la misma clase, sublase, paquete y para todos en general
 * Esta clase mantiene una relacion de composición con la clase Motor, Barco necesita de un motor para estar completo, sin el motor Barco por si solo no esta completo
 * @author cosmetorandell / rafelllull
 */
public class Motor {
	/**
	 * Atributos
	 * Visibilidad privada, solo puede ser vista desde la misma clase
	 * Fabricante y potencia son de tipo String, codigo es de tipo integer
	 */
    private String Fabricante;
    private String Potencia;
    private int Codigo;

    //Getters i Setters
    /**
     * Método getFabricante
	 * Este método permitirá obtener el valor del atributo fabricante del objeto
	 * Visibilidad pública, podra ser vista desde la misma clase, subclase, paquete y para todos en general
     * @return Fabricante, nos retorna un String con el fabricante del objeto
     */
    public String getFabricante() {
        return Fabricante;
    }
    /**
     * Método setFabricante
     * Este método nos permitirá modificar el atributo fabricante del objeto
	 * Visibilidad pública, podra ser vista desde la misma clase, subclase, paquete y para todos en general
     * @param fabricante, se le pasa por parámetro un String que nos definirá el nuevo fabricante del objeto
     */
    public void setFabricante(String fabricante) {
        Fabricante = fabricante;
    }
    /**
     * Método getPotencia
     * Este método nos permitirá obtener el valor del atributo potencia del objeto
     * Visibilidad pública, podra ser vista desde la misma clase, subclase, paquete y para todos en general
     * @return Potencia, nos retorna un String con la potencia del objeto
     */
    public String getPotencia() {
        return Potencia;
    }
    /**
     * Método setPotencia
     * Este método nos permitira modificar el atributo potencia del objeto
     * Visibilidad pública, podra ser vista desde la misma clase, subclase, paquete y para todos en general
     * @param potencia, se le pasa por parámetro un String que nos definirá la nueva potencia del objeto
     */
    public void setPotencia(String potencia) {
        Potencia = potencia;
    }
    /**
     * Método getCodigo
     * Este método nos permitirá obtener el valor del atributo codigo del cobjeto
     * Visibilidad pública, podra ser vista desde la misma clase, subclase, paquete y para todos en general
     * @return Codigo, nos retorna un integer con el codigo del objeto
     */
    public int getCodigo() {
        return Codigo;
    }
    /**
     * Método setCodigo
     * Este método nos permitirña modificar el atributo codigo del objeto
     * Visibilidad pública, podra ser vista desde la misma clase, subclase, paquete y para todos en general
     * @param codigo, se le pasa por parámetro un integer que nos definirá el nuevo codigo del objeto
     */
    public void setCodigo(int codigo) {
        Codigo = codigo;
    }
    
    /**
	 * Constructor vacío
	 * Visibilidad publica, podra ser vista desde la misma clase, subclase, paquete y para todos en general
	 */
    public Motor(){

    }
    /**
     * Constructor completo
	 * Visibilidad pública, podra ser vista desde la misma clase, subclase, paquete y para todos en general
	 * Este constructor completo, le pasaremos por parametro los atributos de Persona
     * @param fabricante, el parámetro fabricante de tipo String nos definirá el nuevo fabricante del objeto
	 * @param potencia, el parámetro potencia de topo String nos definirá la potencia del objeto
	 * @param codigo, el parámetro codigo de tipo integer nos definirá el nuevo codigo del objeto
     */
    public Motor(String fabricante, String potencia, int codigo) {
        Fabricante = fabricante;
        Potencia = potencia;
        Codigo = codigo;
    }
    
    /**
	 * Método toString
	 * Este metodo nos sobreescribira el metodo toString de la clase object, de tal manera que nos imprimira un String con los atributos del objeto de la clase Motor
	 */
    @Override
    public String toString() {
        return "Motor [Codigo=" + Codigo + ", Fabricante=" + Fabricante + ", Potencia=" + Potencia + "]";
    }

}