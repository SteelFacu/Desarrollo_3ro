import java.util.List;

public class Docente extends Persona {
    private String legajo;
    private List<AsistenciaDocente> asistencias;
    private List<MateriaImplementada> materias;

    public Docente(String dni, String nombre, String apellido, String legajo,
                   List<AsistenciaDocente> asistencias, List<MateriaImplementada> materias) {
        super(dni, nombre, apellido);
        this.legajo = legajo;
        this.asistencias = asistencias;
        this.materias = materias;
    }

    public String getLegajo() { return legajo; }
    public void setLegajo(String legajo) { this.legajo = legajo; }

    public List<AsistenciaDocente> getAsistencias() { return asistencias; }
    public void setAsistencias(List<AsistenciaDocente> asistencias) { this.asistencias = asistencias; }

    public List<MateriaImplementada> getMaterias() { return materias; }
    public void setMaterias(List<MateriaImplementada> materias) { this.materias = materias; }
}




