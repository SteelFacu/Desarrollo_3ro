public class AsistenciaDocente {
    private String dniDocente;
    private String materia;
    private String turno;
    private String fecha;
    private String horaEntrada;
    private String horaSalida;
    private boolean presente;
    private String observaciones;

    public AsistenciaDocente (String dniDocente,String materia,String turno,String fecha,
                              String horaEntrada,String horaSalida,boolean presente,String observaciones ){
        this.dniDocente=dniDocente;
        this.materia=materia;
        this.turno=turno;
        this.fecha=fecha;
        this.horaEntrada=horaEntrada;
        this.horaSalida=horaSalida;
        this.presente=presente;
        this.observaciones=observaciones;
    }
}
