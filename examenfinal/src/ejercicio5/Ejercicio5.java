/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author pablonoguera
 */
public class Ejercicio5 {
        public static void probarConexionRedy() {
          System.out.println("");
          System.out.println("Ejercicio 5");
          System.out.println("");
          System.out.println("Crea una interfaz llamada ConexionRed con métodos conectar() y desconectar().\nLuego, implementa esta interfaz en las clases Router y Computadora.\nLa clase Router debe tener un método adicional configurarRed().\n");
        // Implementa la lógica del ejercicio 5 aquí
    }
        //debe esatr en ingles pero no le se al ingles 

    public void probarConexionRed() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
interface ConexionRed {
    void conectar();
    void desconectar();
}

/**
 * la implentacion modo chat es lo que mas aprendi 
 */
class Router implements ConexionRed {
   
    @Override
    public void conectar() {
        System.out.println("Router conectado a la red");
    }

    @Override
    public void desconectar() {
        System.out.println("Router desconectado de la red");
    }
/**
 * Método adicional para configurar la red en el router
 */
   
    public void configurarRed() {
        System.out.println("Configurando la red en el router");
    }
}


class Computadora implements ConexionRed {
  
    @Override
    public void conectar() {
        System.out.println("Computadora conectada a la red");
    }

    @Override
    public void desconectar() {
        System.out.println("Computadora desconectada de la red");
    }
}
/**
 * para provar la implementacion 
 */

public class PruebaConexionRed {
    {
        
        Router miRouter = new Router();
        Computadora miComputadora = new Computadora();
/**
 * conectar y deconecta, configuaraciones 
 */
       
        miRouter.conectar();
        miRouter.desconectar();

       
        miRouter.configurarRed();

        
        miComputadora.conectar();
        miComputadora.desconectar();
    }
}

  
}

 
        

