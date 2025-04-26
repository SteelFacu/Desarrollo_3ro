import java.util.List;

public class Legajo {
    private String idLegajo;
    private String fechaAlta;
    private List<Documento> documentacion;
    private boolean estado;

    // Constructor completo
    public Legajo(String idLegajo, String fechaAlta, List<Documento> documentacion, boolean estado) {
        this.idLegajo = idLegajo;
        this.fechaAlta = fechaAlta;
        this.documentacion = documentacion;
        this.estado = estado;
    }

    // Métodos
    public void altaLegajo() {
        // Lógica para alta de legajo
    }

    public void actualizarLegajo() {
        // Lógica para actualizar legajo
    }

    public void consultarLegajo() {
        // Lógica para consultar legajo
    }

    public void controlCondicion() {
        // Lógica para controlar condición del legajo
    }

    // Getters y Setters
    public String getIdLegajo() {
        return idLegajo;
    }

    public void setIdLegajo(String idLegajo) {
        this.idLegajo = idLegajo;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public List<Documento> getDocumentacion() {
        return documentacion;
    }

    public void setDocumentacion(List<Documento> documentacion) {
        this.documentacion = documentacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}

