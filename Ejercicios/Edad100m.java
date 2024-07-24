import java.util.Scanner;

public class Edad100m {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Por favor, introduce tu nombre: ");
        String nombre = scanner.nextLine();

        int edad = -1; 
        while (edad < 0) {
            
            System.out.print("Por favor, introduce tu edad (número positivo): ");
            if (scanner.hasNextInt()) {
                edad = scanner.nextInt();
                if (edad < 0) {
                    System.out.println("La edad debe ser un número positivo. Inténtalo de nuevo.");
                }
            } else {
                System.out.println("Entrada inválida. Debes ingresar un número.");
                scanner.next(); 
            }
        }

        
        int añoActual = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);

        
        int añoCien = añoActual + (100 - edad);

        
        int añosFaltantes = 100 - edad;

        
        System.out.println(nombre + ", tendrás 100 años en el año " + añoCien + ".");
        System.out.println("Faltan " + añosFaltantes + " años para que tengas 100 años.");

        scanner.close();
    }
}