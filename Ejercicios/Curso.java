import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private List<EstudianteM> estudiantes;

    public Curso(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(EstudianteM estudiante) {
        estudiantes.add(estudiante);
    }

    public void mostrarInfoEstudiantes() {
        System.out.println("Información de estudiantes en el curso " + nombre + ":");
        for (EstudianteM estudiante : estudiantes) {
            estudiante.mostrarInfo();
            System.out.println("--------------------");
        }
    }

    public double calcularPromedioGeneral() {
        if (estudiantes.isEmpty()) {
            return 0.0;
        }
        double sumaPromedios = 0;
        for (EstudianteM estudiante : estudiantes) {
            sumaPromedios += estudiante.calcularPromedio();
        }
        return sumaPromedios / estudiantes.size();
    }

    public static void main(String[] args) {
        Curso curso = new Curso("Programación Java");

        EstudianteM est1 = new EstudianteM("Ana", 15, 9);
        est1.agregarCalificacion(8.5);
        est1.agregarCalificacion(7.0);
        est1.agregarCalificacion(9.0);

        EstudianteM est2 = new EstudianteM("Juan", 16, 10);
        est2.agregarCalificacion(6.0);
        est2.agregarCalificacion(5.5);
        est2.agregarCalificacion(7.0);

        curso.agregarEstudiante(est1);
        curso.agregarEstudiante(est2);

        curso.mostrarInfoEstudiantes();

        System.out.println("Promedio general del curso: " + curso.calcularPromedioGeneral());
    }
}