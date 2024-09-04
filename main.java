import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControlEstudiante controlEstudiante = new ControlEstudiante();
        Estudiante estudiante = null;
        int opcion;

        do {
            System.out.println("Menú Principal");
            System.out.println("1. Registrar Estudiante");
            System.out.println("2. Ver Información del Estudiante");
            System.out.println("3. Borrar Información del Estudiante");
            System.out.println("4. Calcular Nota del Curso");
            System.out.println("9. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea

            switch(opcion) {
                case 1:
                    if(estudiante == null) {
                        estudiante = controlEstudiante.registrarEstudiante(scanner);
                    } else {
                        System.out.println("Ya se ha registrado un estudiante.");
                    }
                    break;
                case 2:
                    if(estudiante != null) {
                        controlEstudiante.verEstudiante(estudiante);
                    } else {
                        System.out.println("No hay un estudiante registrado.");
                    }
                    break;
                case 3:
                    estudiante = controlEstudiante.borrarEstudiante();
                    break;
                case 4:
                    System.out.print("Ingrese EF: ");
                    int ef = scanner.nextInt();
                    System.out.print("Ingrese TA: ");
                    int ta = scanner.nextInt();
                    System.out.print("Ingrese TB: ");
                    int tb = scanner.nextInt();
                    System.out.println("Nota del curso: " + Tools.notaCurso(ef, ta, tb));
                    break;
                case 9:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while(opcion != 9);
        scanner.close();
    }
}
