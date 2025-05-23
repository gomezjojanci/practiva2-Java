/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espoch.edu.ec.clinicaveterinaria;


public class Ave {
    String nombre;
    int edad;
    boolean vacunado;
    double peso;

    public Ave(String nombre, int edad, boolean vacunado, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.vacunado = vacunado;
        this.peso = peso;
    }
    public String obtenerEstadoPeso(){
        return (peso>=5&& peso <=30)?"peso saludable":"peso fuera de vacunacion ";  
    }
    public String obtenerEstadoVacunacion(){
        return vacunado?"vacunacion":"no se vacuno";
    }
    public void mostrarDatos(){
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
    }

   
    
}
