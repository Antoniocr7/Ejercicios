import java.util.Scanner;

public class Edad100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, introduce tu nombre: ");
        String nombre = scanner.nextLine();
       
        System.out.print("Por favor, introduce tu edad: ");
        int edad = scanner.nextInt();
        
        int a = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
       
        int b = a + (100 - edad);
      
        System.out.println(nombre + ", tendrás 100 años en el año " + b + ".");
        
        scanner.close();
    }
}