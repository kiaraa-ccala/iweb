public class ControlEstudiante {

    public Estudiante registrarEstudiante(Scanner scanner) {
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese código PUCP: ");
        String codigo = scanner.nextLine();
        System.out.print("Ingrese carrera: ");
        String carrera = scanner.nextLine();
        System.out.print("Ingrese ciclo de ingreso: ");
        String ciclo = scanner.nextLine();

        System.out.println("Registro de Laptop:");
        Laptop laptop = registrarLaptop(scanner);

        System.out.println("Registro de Celular:");
        Celular celular = registrarCelular(scanner);

        return new Estudiante(nombre, apellido, codigo, carrera, ciclo, laptop, celular);
    }

    public void verEstudiante(Estudiante estudiante) {
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Apellido: " + estudiante.getApellido());
        System.out.println("Código PUCP: " + estudiante.getCodigoPUCP());
        System.out.println("Carrera: " + estudiante.getCarrera());
        System.out.println("Ciclo de ingreso: " + estudiante.getCicloIngreso());

        if (estudiante.getLaptop() != null) {
            System.out.println("Información de Laptop:");
            verLaptop(estudiante.getLaptop());
        }
        if (estudiante.getCelular() != null) {
            System.out.println("Información de Celular:");
            verCelular(estudiante.getCelular());
        }
    }

    public Estudiante borrarEstudiante() {
        System.out.println("Registro de estudiante borrado.");
        return null;
    }

    private Laptop registrarLaptop(Scanner scanner) {
        // Registrar los atributos de Laptop
        // ...
        return new Laptop(/* ... */);
    }

    private Celular registrarCelular(Scanner scanner) {
        // Registrar los atributos de Celular
        // ...
        return new Celular(/* ... */);
    }

    private void verLaptop(Laptop laptop) {
        // Mostrar los atributos de Laptop
    }

    private void verCelular(Celular celular) {
        // Mostrar los atributos de Celular
    }
}
