/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;


import java.util.ArrayList;
/**
 *
 * @author pablonoguera
 */
public class Ejercicio2 {
       public static void gestionarClientes() {
            System.out.println("");
          System.out.println("Ejercicio 2");
          System.out.println("");
           System.out.println("Crea una clase llamada RegistroClientes que permita "
                   + "gestionar dinámicamente un conjunto de objetos Cliente."
                   + "\nCada Cliente debe tener un nombre, un número de cliente y un saldo.\nImplementa métodos para agregar un cliente, eliminar un cliente y calcular el saldo total de todos los clientes."
                   + "\nDebe calcular la cantidad de bytes total del prcedimiento calcular saldo total.\n");
           
        // Implementa la lógica del ejercicio 2 aquí
        
        // NO ENTIENDO EL MAIN NO CORRE 
    }
       //140 bytes
/**
 * registro
 */
class Cliente {
    String nombre;
    int numeroCliente;
    double saldo;

    public Cliente(String nombre, int numeroCliente, double saldo) {
        this.nombre = nombre;
        this.numeroCliente = numeroCliente;
        this.saldo = saldo;
    }
}

class RegistroClientes {
    private ArrayList<Cliente> clientes = new ArrayList<>();
/**
 * agregar clinete
 * @param nombre
 * @param numeroCliente
 * @param saldo 
 */
    public void agregarCliente(String nombre, int numeroCliente, double saldo) {
        Cliente nuevoCliente = new Cliente(nombre, numeroCliente, saldo);
        clientes.add(nuevoCliente);
    }

/**
 * elimina clinte
 * @param numeroCliente 
 */
    public void eliminarCliente(int numeroCliente) {
        clientes.removeIf(cliente -> cliente.numeroCliente == numeroCliente);
    }

    /**
     * Calcular saldo total de todos los clientes
     * @return 
     */
    public double calcularSaldoTotal() {
        double saldoTotal = 0;

        for (Cliente cliente : clientes) {
            saldoTotal += cliente.saldo;
        }

        return saldoTotal;
    }

 
public class PruebaRegistroClientes {
    {
        RegistroClientes registro = new RegistroClientes();

        /**
         *  Agregar algunos clientes
         */
        registro.agregarCliente("Cliente1", 1, 100.0);
        registro.agregarCliente("Cliente2", 2, 200.0);
        registro.agregarCliente("Cliente3", 3, 300.0);

        /**
         *  Mostrar el saldo total
         */
        System.out.println("Saldo total: " + registro.calcularSaldoTotal());

      /**
       * Eliminar un cliente
       */
        registro.eliminarCliente(2);

        /**
         * // Mostrar el saldo total después de eliminar un cliente
         */
        System.out.println("Saldo total después de eliminar un cliente: " + registro.calcularSaldoTotal());

      
    }


}
}
}

