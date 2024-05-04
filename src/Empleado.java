import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Empleado implements Comparable {
    private String nombre;
    private String apellido;
    private double sueldo;
    private LocalDate fechaEntrada;
    private Departamento departamento;

    @Override
    public int compareTo(Object o) {
        return 0;
    }


    public enum Departamento {
        INFORMATICA,
        CONTABILIDAD,
        RRHH
    }

    public Empleado(String nombre, String apellido, double sueldo, LocalDate fechaEntrada, Departamento departamento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
        this.fechaEntrada = fechaEntrada;
        this.departamento = departamento;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", sueldo=" + sueldo +
                ", fechaEntrada=" + fechaEntrada +
                ", departamento=" + departamento +
                '}';
    }

    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Juan", "García", 35000, LocalDate.of(2020, 3, 15), Departamento.INFORMATICA));
        empleados.add(new Empleado("María", "Martínez", 20000, LocalDate.of(2019, 8, 10), Departamento.CONTABILIDAD));
        empleados.add(new Empleado("Luis", "López", 28000, LocalDate.of(2022, 1, 20), Departamento.RRHH));
        empleados.add(new Empleado("Ana", "González", 37000, LocalDate.of(2023, 5, 5), Departamento.INFORMATICA));
        empleados.add(new Empleado("Carlos", "Rodríguez", 32000, LocalDate.of(2022, 12, 1), Departamento.CONTABILIDAD));
        //Ejercicio 2
        empleados.stream()
                .filter(persona -> persona.sueldo > 30000)
                .forEach(persona -> System.out.println(persona.nombre));
        //Ejercicio 3
        System.out.println("----------------------------------------------------------------");
        empleados.stream()
                .filter(empleado -> empleado.getDepartamento() == Departamento.INFORMATICA)
                .forEach(empleado -> System.out.println(empleado.nombre));
        //Ejercicio 4
        System.out.println("----------------------------------------------------------------");
        empleados.stream()
                .filter(empleado -> empleado.getDepartamento() == Departamento.CONTABILIDAD)
                .filter(empleado -> empleado.getSueldo() > 30000)
                .forEach(empleado -> System.out.println(empleado.getNombre()));
        //Ejercicio 5
        System.out.println("----------------------------------------------------------------");
        List<String> listaEmpleados;
        listaEmpleados = empleados.stream()
                .filter(empleado -> empleado.getDepartamento() == Departamento.INFORMATICA)
                .map(empleado -> empleado.getNombre())
                .collect(Collectors.toList());
        System.out.println(listaEmpleados);

        //Ejercicio 6
        System.out.println("----------------------------------------------------------------");
        String[] lista2 = empleados.stream()
                .sorted(Comparator.comparing(empleado -> empleado.getSueldo()))
                .map(empleado -> empleado.getNombre() + " " + empleado.getSueldo())
                .toArray(String[]::new);

        System.out.println(Arrays.toString(lista2));

        //Ejercicio 7
        System.out.println("----------------------------------------------------------------");
        empleados.stream()
                .sorted(Comparator.comparing(Empleado::getDepartamento)
                        .thenComparing(Empleado::getApellido))
                .forEach(empleado -> System.out.println(empleado.getDepartamento() + " " + empleado.getApellido()));

        //Ejercicio 8
        System.out.println("----------------------------------------------------------------");
        empleados.stream()
                .filter(empleado -> empleado.getFechaEntrada().getYear() == 2022)
                .forEach(empleado -> System.out.println(empleado));

        //Ejercicio 9
        System.out.println("----------------------------------------------------------------");
        empleados.stream()
                .forEach(empleado -> System.out.println(empleado.getNombre() + " " + empleado.getFechaEntrada().getDayOfMonth() + " " + empleado.getFechaEntrada().getMonth().toString() + " " + empleado.getFechaEntrada().getYear()));

        //Ejercicio 10
        System.out.println("----------------------------------------------------------------");

        Empleado empleadoSueldo = empleados.stream()
                .max(Comparator.comparing(empleado -> empleado.getSueldo()))
                .get();

        System.out.println(empleadoSueldo);
        //Ejercicio 11
        System.out.println("----------------------------------------------------------------");
        int cont=0;
        long empleado11 = empleados.stream()
                .filter(empleado -> empleado.getDepartamento()==Departamento.INFORMATICA)
                .count();
        System.out.printf("Hay %d empleados", empleado11);



    }


}

