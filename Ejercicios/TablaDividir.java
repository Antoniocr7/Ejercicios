import java.util.Scanner;

public class TablaDividir {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            
            System.out.println("Escoja una opción:");
            System.out.println("1) Tabla de multiplicar");
            System.out.println("2) Tabla de dividir");
            System.out.println("3) Ambas");
            System.out.println("0) Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    
                    int numMult;
                    do {
                        System.out.println("Ingrese un número positivo para la tabla de multiplicar:");
                        numMult = scanner.nextInt();
                    } while (numMult <= 0);

                    
                    System.out.println("Tabla de multiplicar del " + numMult + ":");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(numMult + " x " + i + " = " + (numMult * i));
                    }
                    break;

                case 2:
                    
                    int numDiv;
                    do {
                        System.out.println("Ingrese un número positivo para la tabla de dividir:");
                        numDiv = scanner.nextInt();
                    } while (numDiv <= 0);

                    
                    System.out.println("Tabla de dividir del " + numDiv + " (del 1 al 10):");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(numDiv + " / " + i + " = " + (numDiv / (double) i));
                    }
                    break;

                case 3:
                    
                    int numMultDiv;
                    do {
                        System.out.println("Ingrese un número positivo para las tablas de multiplicar y dividir:");
                        numMultDiv = scanner.nextInt();
                    } while (numMultDiv <= 0);

                    
                    System.out.println("Tabla de multiplicar del " + numMultDiv + " (del 1 al 10):");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(numMultDiv + " x " + i + " = " + (numMultDiv * i));
                    }

                    
                    System.out.println("\nTabla de dividir del " + numMultDiv + " (del 1 al 10):");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(numMultDiv + " / " + i + " = " + (numMultDiv / (double) i));
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }
}
