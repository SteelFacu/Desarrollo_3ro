public class AsistenciaDocente {
    private String fecha;
    private int horaIngreso;
    private int horaSalida;
    private Docente docente;
    private Materia materia;
    private Carrera carrera;
    private Comision comision;
    private Turno turno;
    private String estado; // Nuevo atributo: presente, ausente, justificado

    // Constructor vacío
    public AsistenciaDocente() {}

    // Constructor completo
    public AsistenciaDocente(String fecha, int horaIngreso, int horaSalida, Docente docente, Materia materia, Carrera carrera, Comision comision, Turno turno, String estado) {
        this.fecha = fecha;
        this.horaIngreso = horaIngreso;
        this.horaSalida = horaSalida;
        this.docente = docente;
        this.materia = materia;
        this.carrera = carrera;
        this.comision = comision;
        this.turno = turno;
        this.estado = estado;
    }

    // Métodos
    public void alta() {
        // Lógica para alta de asistencia
    }

    public void baja() {
        // Lógica para baja de asistencia
    }

    public void modificacion() {
        // Lógica para modificación de asistencia
    }

    public void justificarInasistencia() {
        this.estado = "Justificado"; // Al justificar, se cambia el estado
    }

    public void reporte() {
        // Lógica para generar reporte de asistencias
    }

    public void consulta() {
        // Lógica para consulta de asistencias
    }

    // Getters y Setters
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(int horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public int getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public Comision getComision() {
        return comision;
    }

    public void setComision(Comision comision) {
        this.comision = comision;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

