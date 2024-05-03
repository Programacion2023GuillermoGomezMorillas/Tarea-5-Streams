import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Empleado implements Comparable{
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

    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Juan", "García", 35000, LocalDate.of(2020, 3, 15), Departamento.INFORMATICA));
        empleados.add(new Empleado("María", "Martínez", 20000, LocalDate.of(2019, 8, 10), Departamento.CONTABILIDAD));
        empleados.add(new Empleado("Luis", "López", 28000, LocalDate.of(2022, 1, 20), Departamento.RRHH));
        empleados.add(new Empleado("Ana", "González", 37000, LocalDate.of(2023, 5, 5), Departamento.INFORMATICA));
        empleados.add(new Empleado("Carlos", "Rodríguez", 32000, LocalDate.of(2022, 12, 1), Departamento.CONTABILIDAD));
        empleados.stream()
                .forEach(persona -> System.out.println(persona.nombre));
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

}

