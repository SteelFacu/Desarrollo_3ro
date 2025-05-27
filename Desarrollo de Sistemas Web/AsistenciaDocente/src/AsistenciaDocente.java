import java.sql.Time;

public class AsistenciaDocente {
    private Time horarioIngreso;
    private Time horarioSalida;
    private Docente docente;

    public AsistenciaDocente(Time horarioIngreso, Time horarioSalida, Docente docente) {
        this.horarioIngreso = horarioIngreso;
        this.horarioSalida = horarioSalida;
        this.docente = docente;
    }
}



