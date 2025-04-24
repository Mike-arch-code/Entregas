/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coversiones;

/**
 *
 * @author Mike
 */
public class Coversiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereasdasd
        String Nombre = "Santiago";
        Integer Edad = 23; 
        Float Estatura = 1.69f;
        Boolean EstudianteActivo = true;

        System.out.println("Nombre: " + Nombre + " (Tipo: " + Nombre.getClass().getSimpleName() + ")");
        System.out.println("Edad: " + Edad + " (Tipo: " + Edad.getClass().getSimpleName() + ")");
        System.out.println("Estatura: " + Estatura + " (Tipo: " + Estatura.getClass().getSimpleName() + ")");
        System.out.println("EstudianteActivo: " + EstudianteActivo + " (Tipo: " + EstudianteActivo.getClass().getSimpleName() + ")");
        
     
        // 1. Nombre en código ASCII
        System.out.print("Nombre en ASCII: ");
        for (int i = 0; i < Nombre.length(); i++) {
            System.out.print((int) Nombre.charAt(i) + " ");
        }
        System.out.println("(Tipo original: String → convertido a códigos ASCII enteros)");

        // 2. Edad como carácter ASCII
        char edadComoChar = (char)(int)Edad;
        System.out.println("Edad como carácter ASCII: '" + edadComoChar + "' (Tipo original: Integer → convertido a char usando código ASCII)");

        // 3. Estatura como Integer
        Integer estaturaComoEntero = Estatura.intValue();
        System.out.println("Estatura: " + estaturaComoEntero + " (Tipo original: Float → convertido a Integer)");

        // 4. EstudianteActivo como String
        String estudianteActivoComoString = EstudianteActivo.toString();
        System.out.println("EstudianteActivo: " + estudianteActivoComoString + " (Tipo original: Boolean → convertido a String)");
    }

    }
    

