/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coversiones;

/**
 * Clase principal que demuestra diferentes tipos de conversiones de datos en Java.
 * Incluye ejemplos de conversión de String a ASCII, Integer a char, Float a Integer y Boolean a String.
 * 
 * Autor: Mike
 */
public class Coversiones {

    public static double calcularTangente(double anguloEnRadianes) {
        return Math.tan(anguloEnRadianes);
    }
    /**
     * Método principal que ejecuta la lógica del programa.
     * @param args los argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        // Declaración de variables con diferentes tipos de datos
        String Nombre = "Santiago";
        Integer Peso  = 54 ; 
        Float Estatura = 1.69f;
        Boolean EstudianteActivo = true;

        // Mostrar los valores y sus tipos originales
        System.out.println("Nombre: " + Nombre + " (Tipo: " + Nombre.getClass().getSimpleName() + ")");
        System.out.println("Peso: " + Peso + " (Tipo: " + Peso.getClass().getSimpleName() + ")");
        System.out.println("Estatura: " + Estatura + " (Tipo: " + Estatura.getClass().getSimpleName() + ")");
        System.out.println("EstudianteActivo: " + EstudianteActivo + " (Tipo: " + EstudianteActivo.getClass().getSimpleName() + ")");

        // 1. Conversión de cada carácter del nombre a su código ASCII
        System.out.print("Nombre en ASCII: ");
        for (int i = 0; i < Nombre.length(); i++) {
            System.out.print((int) Nombre.charAt(i) + " ");
        }
        System.out.println("(Tipo original: String a convertido a codigos ASCII enteros)");

        // 2. Conversión de la edad (Integer) a un carácter ASCII
        char edadComoChar = (char)(int)Peso;
        System.out.println("Peso como caracter ASCII: '" + edadComoChar + "' (Tipo original: Integer a convertido a char usando codigo ASCII)");

        // 3. Conversión de la estatura (Float) a Integer eliminando los decimales
        Integer estaturaComoEntero = Estatura.intValue();
        System.out.println("Estatura: " + estaturaComoEntero + " (Tipo original: Float a convertido a Integer)");

        // 4. Conversión del estado de estudiante activo (Boolean) a String
        String estudianteActivoComoString = EstudianteActivo.toString();
        System.out.println("EstudianteActivo: " + estudianteActivoComoString + " (Tipo original: Boolean a convertido a String)");
        
        // 5. Comentario post produccion en clase de programacion Maycol Figueroa
        // 6. Comentario en respuesta al comentario anterior de maycol . ......
        // 7. Comentario final por santiago.
        
        double angulo = 45; // 45 grados en radianes
        double resultado = calcularTangente(angulo);
        System.out.println("La tangente de " + angulo + " radianes es: " + resultado);
    }
}

