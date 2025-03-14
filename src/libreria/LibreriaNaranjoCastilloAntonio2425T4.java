
package libreria;

public class LibreriaNaranjoCastilloAntonio2425T4 {
    private String nom;
    private int cantidad;
    private double precio;
    private double saldo;
    //Constructor sin argumentos
    public LibreriaNaranjoCastilloAntonio2425T4(){}
    //constructor con parámetros para inicializar todas las propiedades de la clase
    public LibreriaNaranjoCastilloAntonio2425T4(String nom, int cantidad, double precio, double saldo){
        this.nom = nom;                 //Nombre del libro
        this.cantidad = cantidad;       //Cantidad de ejemplares que hay en stock
        this.precio = precio;           //Precio unitario del libro
        this.saldo = saldo;             //Saldo en la cuenta de la librería
    }
    //Método que devuelve el nombre del libro
    public String obtenerNombre(){
        return nom;
    }
    //Método que devuelve el precio del libro
    public double obtenerPrecio(){
        return precio;
    }
    //Método que devuelve la cantidad de libros de ese ejemplar que quedan para vender
    public int obtenerStock(){
        return cantidad;
    }
    //Método para obtener el saldo en la cuenta
    public double obtenerSaldo(){
        return saldo;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    //Método para aumentar el saldo
    public void aumentarSaldo(double saldomas) throws Exception{
        if (saldomas<=0)
            throw new Exception("No se puede ingresar 0 o una cantidad negativa");
        setSaldo(saldo + saldomas);
    }
    //Método para comprar un ejemplar de un libro, actualiza el stock y el saldo
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
}
