import java.util.List;

public class Legajo {
    private String fechaAlta;
    private List<Documento> documentacion;
    private boolean estado;

    public Legajo(String fechaAlta, List<Documento> documentacion, boolean estado) {
        this.fechaAlta = fechaAlta;
        this.documentacion = documentacion;
        this.estado = estado;
    }

    public String getFechaAlta() { return fechaAlta; }
    public void setFechaAlta(String fechaAlta) { this.fechaAlta = fechaAlta; }

    public List<Documento> getDocumentacion() { return documentacion; }
    public void setDocumentacion(List<Documento> documentacion) { this.documentacion = documentacion; }

    public boolean isEstado() { return estado; }
    public void setEstado(boolean estado) { this.estado = estado; }
}



