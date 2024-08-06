import java.util.ArrayList;
import java.util.List;

public class Curso {
    
    private List<Estudiante> estudiantes;

    
    public Curso() {
        this.estudiantes = new ArrayList<>();
    }

    
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
        System.out.println("Estudiante " + estudiante.getNombre() + " añadido al curso.");
    }

    
    public void mostrarInformacionEstudiantes() {
        for (Estudiante estudiante : estudiantes) {
            estudiante.mostrarInformacion();
            System.out.println(); 
        }
    }

    
    public double calcularPromedioGeneral() {
        if (estudiantes.isEmpty()) {
            return 0.0;
        }
        double sumaPromedios = 0.0;
        int cantidadEstudiantes = estudiantes.size();
        for (Estudiante estudiante : estudiantes) {
            sumaPromedios += estudiante.calcularPromedio();
        }
        return sumaPromedios / cantidadEstudiantes;
    }

    
    @Override
    public String toString() {
        return "Curso{" +
               "estudiantes=" + estudiantes +
               ", promedioGeneral=" + calcularPromedioGeneral() +
               '}';
    }

    public static void main(String[] args) {
        
        Estudiante estudiante1 = new Estudiante("Juan Pérez", 15, 10);
        estudiante1.agregarCalificacion(8.5);
        estudiante1.agregarCalificacion(7.0);
        estudiante1.agregarCalificacion(9.0);

        Estudiante estudiante2 = new Estudiante("Ana Gómez", 14, 9);
        estudiante2.agregarCalificacion(5.5);
        estudiante2.agregarCalificacion(6.0);
        estudiante2.agregarCalificacion(7.0);

       
        Curso curso = new Curso();
        curso.agregarEstudiante(estudiante1);
        curso.agregarEstudiante(estudiante2);

        
        curso.mostrarInformacionEstudiantes();

        
        System.out.println("Promedio General del Curso: " + curso.calcularPromedioGeneral());
    }
}