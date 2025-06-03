import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.time.LocalDate;

public class AsistenciaDocente extends Asistencia {
    private Time horarioIngreso;
    private Time horarioSalida;
    private Docente docente;

    public AsistenciaDocente(LocalDate fecha, String asistencia, MateriaImplementada materia, Time horarioIngreso, Time horarioSalida, Docente docente) {
        super(fecha, asistencia, materia);
        this.horarioIngreso = horarioIngreso;
        this.horarioSalida = horarioSalida;
        this.docente = docente;
    }

    public Time getHorarioIngreso() {
        return horarioIngreso;
    }

    public void setHorarioIngreso(Time horarioIngreso) {
        this.horarioIngreso = horarioIngreso;
    }

    public Time getHorarioSalida() {
        return horarioSalida;
    }

    public void setHorarioSalida(Time horarioSalida) {
        this.horarioSalida = horarioSalida;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

//Registrar asistencia del docente

    public void registrarAsistencia(Time ingreso, Time salida) {
        this.horarioIngreso = ingreso;
        this.horarioSalida = salida;
        System.out.println("Asistencia registrada para " + docente.getNombre());
    }

//Consultar historial de asistencia

    public class AsistenciaDocente extends Asistencia {
        // ...
        private List<AsistenciaDocente> historialAsistencias = new ArrayList<>();

        public void registrarAsistencia(Time ingreso, Time salida) {
            AsistenciaDocente asistencia = new AsistenciaDocente(ingreso, salida, this.docente);
            historialAsistencias.add(asistencia);
            System.out.println("Asistencia registrada.");
        }

        public List<AsistenciaDocente> consultarHistorial() {
            return historialAsistencias;
        }
    }

//Justificar inasistencia
    private Map<LocalDate, String> inasistenciasJustificadas = new HashMap<>();

    public void justificarInasistencia(LocalDate fecha, String motivo) {
        inasistenciasJustificadas.put(fecha, motivo);
        System.out.println("Inasistencia justificada para " + fecha + ": " + motivo);
    }

    public Map<LocalDate, String> getInasistenciasJustificadas() {
        return inasistenciasJustificadas;
    }
//


}





//VERR Para separar responsabilidades (principio de responsabilidad única),
// lo ideal sería crear una clase de servicio como:
// public class GestorAsistenciaDocente {
//    private List<AsistenciaDocente> asistencias = new ArrayList<>();
//
//    public void registrarAsistencia(Docente docente, Time ingreso, Time salida) {
//        AsistenciaDocente nueva = new AsistenciaDocente(ingreso, salida, docente);
//        asistencias.add(nueva);
//    }
//
//    public List<AsistenciaDocente> historialPorDocente(Docente docente) {
//        return asistencias.stream()
//                .filter(a -> a.getDocente().equals(docente))
//                .collect(Collectors.toList());
//    }
//
//    public void justificarInasistencia(Docente docente, LocalDate fecha, String motivo) {
//        // Podrías tener un mapa por docente y fecha
//    }
//}



