import java.sql.Time;

public class AsistenciaDocente extends Asistencia {
    public Time horarioIngreso;
    public Time horarioSalida;
    public Docente docente;

    public AsistenciaDocente(Time horarioIngreso, Time horarioSalida, Docente docente) {
        super();
        this.horarioIngreso = horarioIngreso;
        this.horarioSalida = horarioSalida;
        this.docente = docente;
    }
}




