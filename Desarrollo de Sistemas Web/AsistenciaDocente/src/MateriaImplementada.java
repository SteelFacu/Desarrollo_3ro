public class MateriaImplementada {
    private Materia materia;
    private Docente docente;
    private Horario horario;
    private boolean promocion;
    private Comision comision;

    public MateriaImplementada(Materia materia, Docente docente, Horario horario, boolean promocion, Comision comision) {
        this.materia = materia;
        this.docente = docente;
        this.horario = horario;
        this.promocion = promocion;
        this.comision = comision;
    }

    public Materia getMateria() { return materia; }
    public void setMateria(Materia materia) { this.materia = materia; }

    public Docente getDocente() { return docente; }
    public void setDocente(Docente docente) { this.docente = docente; }

    public Horario getHorario() { return horario; }
    public void setHorario(Horario horario) { this.horario = horario; }

    public boolean isPromocion() { return promocion; }
    public void setPromocion(boolean promocion) { this.promocion = promocion; }

    public Comision getComision() { return comision; }
    public void setComision(Comision comision) { this.comision = comision; }
}

