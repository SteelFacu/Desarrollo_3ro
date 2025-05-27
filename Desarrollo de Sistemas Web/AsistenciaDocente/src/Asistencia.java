import java.time.LocalDate;

public class Asistencia {
    private LocalDate fecha;
    private String asistencia;
    private MateriaImplementada materia;
    private Estudiante estudiante;

    public Asistencia(LocalDate fecha, String asistencia, MateriaImplementada materia, Estudiante estudiante) {
        this.fecha = fecha;
        this.asistencia = asistencia;
        this.materia = materia;
        this.estudiante = estudiante;
    }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public String getAsistencia() { return asistencia; }
    public void setAsistencia(String asistencia) { this.asistencia = asistencia; }

    public MateriaImplementada getMateria() { return materia; }
    public void setMateria(MateriaImplementada materia) { this.materia = materia; }

    public Estudiante getEstudiante() { return estudiante; }
    public void setEstudiante(Estudiante estudiante) { this.estudiante = estudiante; }

    public void modificarAsistencia(String nuevaAsistencia) {
        this.asistencia = nuevaAsistencia;
    }
}

