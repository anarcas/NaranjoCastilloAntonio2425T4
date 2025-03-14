
package libreria;
/**
 * Clase Libreria que gestiona la venta de libros así como el control del
 * almacén.
 *
 * @author Antonio Naranjo Castillo
 * @version 1.0.0
 * @since 13/03/2025
 */
public class LibreriaNaranjoCastilloAntonio2425T4 {
    private String nom;
    private int cantidad;
    private double precio;
    private double saldo;
    //Constructor sin argumentos

    /**
     * Método constructor sin argumentos
     *
     */
    public LibreriaNaranjoCastilloAntonio2425T4(){}
    //constructor con parámetros para inicializar todas las propiedades de la clase

    /**
     * Método constructor de la clase librería con cuatro argumentos
     *
     * @param nom Nombre del libro
     * @param cantidad Cantidad de ejemplares que existen en el almacén
     * @param precio Precio del libro
     * @param saldo Saldo disponible en la cuenta de la librería
     */
    public LibreriaNaranjoCastilloAntonio2425T4(String nom, int cantidad, double precio, double saldo){
        this.nom = nom;                 //Nombre del libro
        this.cantidad = cantidad;       //Cantidad de ejemplares que hay en stock
        this.precio = precio;           //Precio unitario del libro
        this.saldo = saldo;             //Saldo en la cuenta de la librería
    }
    //Método que devuelve el nombre del libro
    /**
     * Método que devuelve el nombre del libro
     *
     * @return Devuelve el nombre del libro
     */
    public String obtenerNombre(){
        return nom;
    }
    //Método que devuelve el precio del libro
    /**
     * Método que devuelve el precio del libro
     *
     * @return devuelve el precio del libro
     */
    public double obtenerPrecio(){
        return precio;
    }
    //Método que devuelve la cantidad de libros de ese ejemplar que quedan para vender
    /**
     * Metodo que devuelve la cantidad de libros de ese ejemplar que quedan por
     * vender
     *
     * @return devuelve la cantidad de libros existentes
     */
    public int obtenerStock(){
        return cantidad;
    }
    //Método para obtener el saldo en la cuenta
    /**
     * Método para obtener el saldo en la cuenta
     *
     * @return devuelve el saldo disponible
     */
    public double obtenerSaldo(){
        return saldo;
    }
    //Método para aumentar el saldo
    /**
     * Método para aumentar el saldo
     * 
     * @param saldomas saldo a incrementar (ingreso)
     * @throws Exception Excepción en caso de ingresar un valor nulo o negativo
     */
    public void aumentarSaldo(double saldomas) throws Exception{
        if (saldomas<=0)
            throw new Exception("No se puede ingresar 0 o una cantidad negativa");
        setSaldo(saldo + saldomas);
    }
    //Método para comprar un ejemplar de un libro, actualiza el stock y el saldo
    /**
     * Método para comprar un ejemplar de un libro, actualiza el stock y el
     * saldo
     *
     * @param canti Cantidad de libros a comprar
     * @throws Exception Excepción en caso de retirar una cantidad nula o negativa, o si
     * se pretende comprar más libros de los disponibles
     */
    public void comprarLibro(int canti) throws Exception{
        if (canti <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa de libros");
        if (cantidad>=canti){
            if (saldo <= precio)
                  throw new Exception ("No hay suficiente saldo para comprar");
            else{
                setCantidad(cantidad -canti);
                setSaldo(saldo + (precio*canti));
            }
        }
        else 
            throw new Exception ("No se pueden comprar más libros de los que hay disponibles");
       
    }

    /**
     * Método que establece el nombre del libro
     * 
     * @param nom Nombre del libro
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    /**
     * Método que establece la cantidad de libros
     * @param cantidad Cantidad de libros a establecer
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Método que establece el precio de un libro
     * @param precio Precio del libro a establecer
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }


    /**
     * Método que establece el saldo disponible
     * @param saldo Saldo a establecer
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
