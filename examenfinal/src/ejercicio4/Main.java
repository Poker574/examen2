/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author pablonoguera
 */
public class Ejercicio4 {
       public static void probarVehiculos() {
            System.out.println("");
          System.out.println("Ejercicio 4");
          System.out.println("");
           System.out.println("Define una clase abstracta llamada Vehiculo con métodos abstractos acelerar() y frenar().\nLuego, crea las clases Coche y Bicicleta que extiendan Vehiculo y \nproporcionen una implementación para los métodos abstractos.\n");
        // Implementa la lógica del ejercicio 4 aquí
    }
// Definición de la clase abstracta Vehiculoabstract class Vehiculo {
    
    public abstract void acelerar();

    
    public abstract void frenar();
}
/**
 * Clase que extiende Vehiculo: Coche / hacerlo asi lo aprendi de mi amigo el chatgtp
 * @author poker
 */

class Coche extends Vehiculo {
   
    public void acelerar() {
        System.out.println("El coche está acelerando");
    }

  
    public void frenar() {
        System.out.println("El coche está frenando");
    }
}

/**
 * // Clase que extiende Vehiculo: Bicicleta, / Implementación del método acelerar para una bicicleta
 * @author poker
 */
class Bicicleta extends Vehiculo {

    public void acelerar() {
        System.out.println("La bicicleta está acelerando");
    }

   
    public void frenar() {
        System.out.println("La bicicleta está frenando");
    }
}

public class Main {
    public static void main(String[] args) {
      
        Coche miCoche = new Coche();
        Bicicleta miBicicleta = new Bicicleta();


        miCoche.acelerar();
        miCoche.frenar();

 
        miBicicleta.acelerar();
        miBicicleta.frenar();
    }
}



