
package libreria;

/**
 * Clase principal
 *
 * @author Antonio Naranjo Castillo
 * @version 1.0.0
 * @since 13/03/2025
 */

public class Main {
  
    /**
     * Método principal que contiene el código a ejecutar del programa
     *
     * @param args Argumentos lista String
     */

    public static void main(String[] args) {
        LibreriaNaranjoCastilloAntonio2425T4 miLibreriaNaranjoCastilloAntonio2425T4;
        String x;
        int stock;
        int num;
        double dinero;
        double saldoActual;
        double ingreso;
        
        miLibreriaNaranjoCastilloAntonio2425T4 = new LibreriaNaranjoCastilloAntonio2425T4("Don Quijote de la Mancha", 10, 45, 120);

        compraQuijoteNaranjoCastilloAntonio2425T4(miLibreriaNaranjoCastilloAntonio2425T4);
        
        saldoActual = miLibreriaNaranjoCastilloAntonio2425T4.obtenerSaldo();
        System.out.println("El saldo al comprar el libro es de "+ saldoActual );        
        x = miLibreriaNaranjoCastilloAntonio2425T4.obtenerNombre();
        stock = miLibreriaNaranjoCastilloAntonio2425T4.obtenerStock();
        System.out.println("El libro "+x+" tiene un stock de "+stock+" unidades ahora");
        
        añadeIngresoNaranjoCastilloAntonio2425T4(miLibreriaNaranjoCastilloAntonio2425T4, "Libro vendido");
    }

    /**
     * Método que añade un ingreso determinado de 30.5 euros y luego comprueba
     * el saldo disponible
     *
     * @param miLibreriaNaranjoCastilloAntonio2425T4 Librería donde se gestiona
     * la compra del libro
     * @param concepto Concepto del libro en cuestión
     * @throws Exception Excepción que maneja los errores que pudieran darse en
     * el método al obtener el saldo
     *
     */
    private static void añadeIngresoNaranjoCastilloAntonio2425T4
        (LibreriaNaranjoCastilloAntonio2425T4 miLibreriaNaranjoCastilloAntonio2425T4, 
                String concepto) {
        double ingreso;
        double saldoActual;
        try
        {
            ingreso = 30.5; //Ingreso que se va a realizar en el saldo de la librería
            miLibreriaNaranjoCastilloAntonio2425T4.aumentarSaldo(ingreso);
            saldoActual = miLibreriaNaranjoCastilloAntonio2425T4.obtenerSaldo();
            System.out.println("Tu saldo actual después de ingresar es de "+saldoActual+"€");
        } catch (Exception e)
        {
            System.out.println("Fallo al obtener el saldo al ingresar");
        }
    }
       
    /**
     * Método para comprar dos ejemplares del libro Don Quijote de La Mancha
     *
     * @param miLibreriaNaranjoCastilloAntonio2425T4 librería donde se gestiona
     * la compra
     * @throws Exception Excepción que maneja los errores que pudieran darse en
     * el método al comprar un libro
     */
    private static void compraQuijoteNaranjoCastilloAntonio2425T4
        (LibreriaNaranjoCastilloAntonio2425T4 miLibreriaNaranjoCastilloAntonio2425T4)
        {
        String x;
        int num;
        double dinero;
        double saldoActual;
        try
        {
            x = "Don Quijote de la Mancha";
            num = 2;    //Número de ejemplares a comprar
            dinero = miLibreriaNaranjoCastilloAntonio2425T4.obtenerPrecio();
            saldoActual = miLibreriaNaranjoCastilloAntonio2425T4.obtenerSaldo();
            System.out.println("El libro "+x+" vale "+dinero+"€");
            System.out.println("El saldo actual de la librería es de "+saldoActual+"€");
            miLibreriaNaranjoCastilloAntonio2425T4.comprarLibro(num);
        } catch (Exception e)
        {
            System.out.println("Error en la compra del libro");
        }
    }
}
