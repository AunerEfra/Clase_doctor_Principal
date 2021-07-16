/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea_en_grupo_Modulo6;

/**
 *
 * @author 
 */
import java.util.Scanner;

/**
 *
 * @author 
 */
public class Doctor extends Personas {
    Scanner s = new Scanner(System.in);

    public Doctor(String datocadena, int datonumerico, int edad, String nombre) {
        super(datocadena, datonumerico, edad, nombre);
    }

   
 

   
    public void ingreso_datocadena() {
        
        //aqui hago referencia a la variable dato cadena como el nombre de la carrera del estudiante
        System.out.println("Ingrese de que universidad egreso: ");
        setDatocadena(s.nextLine());
    }

   
    public void ingreso_datonumerico() {
        System.out.println("Ingrese cuantos años de experiencia tiene: ");
        setDatonumerico(s.nextInt());
    }
     public void ingreso_datospersonales()
    {
        System.out.println("Ingrese su nombre: ");
        setNombre( s.nextLine());
        System.out.println("Ingrese su edad: ");
        setEdad(s.nextInt());
       
        
    }


 
    public void muestrodatos() {
        System.out.println("Nombre:---------------------"+getNombre());
        System.out.println("Edad:-----------------------"+getEdad());
        System.out.println("Universidad:----------------"+getDatocadena());
        System.out.println("Años experiencia:-----------"+getDatonumerico());
    }
    
}
