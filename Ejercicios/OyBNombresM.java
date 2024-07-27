import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OyBNombresM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nombres = new ArrayList<>();

    
        System.out.print("¿Cuántos nombres desea ingresar?: ");
        int cantidadNombres = scanner.nextInt();
        scanner.nextLine(); 
        
        
        for (int i = 0; i < cantidadNombres; i++) {
            System.out.print("Ingrese el nombre #" + (i + 1) + ": ");
            String nombre = scanner.nextLine();
            nombres.add(nombre);
        }
        
        
        System.out.println("Nombres ingresados:");
        mostrarNombres(nombres);

        
        System.out.print("Ingrese el nombre que desea eliminar: ");
        String nombreEliminar = scanner.nextLine();
        boolean eliminado = nombres.remove(nombreEliminar);
        if (eliminado) {
            System.out.println(nombreEliminar + " fue eliminado de la lista.");
        } else {
            System.out.println(nombreEliminar + " no se encontró en la lista.");
        }
        
        
        System.out.println("Nombres después de la eliminación:");
        mostrarNombres(nombres);

        
        String nombreMasLargo = encontrarNombreMasLargo(nombres);
        System.out.println("El nombre más largo en la lista es: " + nombreMasLargo);

        scanner.close();
    }

    
    private static void mostrarNombres(List<String> nombres) {
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }

    
    private static String encontrarNombreMasLargo(List<String> nombres) {
        if (nombres.isEmpty()) {
            return "";
        }
        return Collections.max(nombres, (nombre1, nombre2) -> nombre1.length() - nombre2.length());
    }
}
