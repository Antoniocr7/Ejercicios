import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    
    private String nombre;
    private int edad;
    private int grado;
    private List<Double> calificaciones; 

    
    public Estudiante(String nombre, int edad, int grado) {
        this.nombre = nombre;
        this.edad = edad;
        this.grado = grado;
        this.calificaciones = new ArrayList<>(); 
    }

    
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Grado: " + grado);
        System.out.println("Calificaciones: " + calificaciones);
        System.out.println("Promedio: " + calcularPromedio());
        System.out.println("Estado: " + (aprobado() ? "Aprobado" : "No Aprobado"));
    }

    
    public void pasarSiguienteGrado() {
        grado++;
        System.out.println(nombre + " ha pasado al grado " + grado);
    }

    
    public void agregarCalificacion(double calificacion) {
        if (calificacion >= 0 && calificacion <= 10) {
            calificaciones.add(calificacion);
            System.out.println("Calificación " + calificacion + " añadida.");
        } else {
            System.out.println("Calificación debe estar entre 0 y 10.");
        }
    }

    
    public double calcularPromedio() {
        if (calificaciones.isEmpty()) {
            return 0.0;
        }
        double suma = 0.0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.size();
    }

    
    public boolean aprobado() {
        return calcularPromedio() >= 6;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public List<Double> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(List<Double> calificaciones) {
        this.calificaciones = calificaciones;
    }

    
    @Override
    public String toString() {
        return "Estudiante{" +
               "nombre='" + nombre + '\'' +
               ", edad=" + edad +
               ", grado=" + grado +
               ", calificaciones=" + calificaciones +
               ", promedio=" + calcularPromedio() +
               '}';
    }

    public static void main(String[] args) {
        
        Estudiante estudiante1 = new Estudiante("Juan Pérez", 15, 10);
        Estudiante estudiante2 = new Estudiante("Ana Gómez", 14, 9);

        
        estudiante1.agregarCalificacion(8.5);
        estudiante1.agregarCalificacion(7.0);
        estudiante1.agregarCalificacion(9.0);

        estudiante2.agregarCalificacion(5.5);
        estudiante2.agregarCalificacion(6.0);
        estudiante2.agregarCalificacion(7.0);

        
        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();

        
        estudiante1.pasarSiguienteGrado();
        estudiante2.pasarSiguienteGrado();

        
        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();
    }
}