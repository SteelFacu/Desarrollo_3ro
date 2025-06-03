public class Documento {
    private String nombre;
    private String tipo; //por ej DNI, TITULO, CV
    private String urlArchivo; //o ruta local

    public Documento(String nombre, String tipo, String urlArchivo){
        this.nombre=nombre;
        this.tipo=tipo;
        this.urlArchivo=urlArchivo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
       this.nombre = nombre;
   }
    public String getTipo(){
        return tipo;
   }
    public void setTipo(String tipo){
        this.tipo=tipo;
   }

    public void setUrlArchivo(String urlArchivo) {
        this.urlArchivo = urlArchivo;
    }

    public String getUrlArchivo() {
        return urlArchivo;
    }

}
