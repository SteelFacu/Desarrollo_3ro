import java.util.List;

public class Docente {
    private String dni;
    private String nombre;
    private String apellido;
    private List<Materia> materias;
    private List<Carrera> carreras;
    private List<Comision> comisiones;
    private List<Asistencia> asistencias;

    // Constructor vacío
    public Docente() {}

    // Constructor completo
    public Docente(String dni, String nombre, String apellido, List<Materia> materias, List<Carrera> carreras, List<Comision> comisiones, List<Asistencia> asistencias) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.materias = materias;
        this.carreras = carreras;
        this.comisiones = comisiones;
        this.asistencias = asistencias;
    }

    // Métodos
    public void registrarEntrada() {
        // Lógica para registrar entrada
    }

    public void registrarSalida() {
        // Lógica para registrar salida
    }

    // Getters y Setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public List<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(List<Carrera> carreras) {
        this.carreras = carreras;
    }

    public List<Comision> getComisiones() {
        return comisiones;
    }

    public void setComisiones(List<Comision> comisiones) {
        this.comisiones = comisiones;
    }

    public List<Asistencia> getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(List<Asistencia> asistencias) {
        this.asistencias = asistencias;
    }
}
