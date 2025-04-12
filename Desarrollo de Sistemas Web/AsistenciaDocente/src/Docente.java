public class Docente {
    private String apellido;
    private String nombre;
    private String legajo;
    private String titulo;
    private String dni;
    private String telefono;
    private String email;

    public Docente (String apellido,String nombre,String legajo,String titulo,String dni,String telefono,String email){
        this.apellido=apellido;
        this.nombre=nombre;
        this.legajo=legajo;
        this.titulo=titulo;
        this.dni=dni;
        this.telefono=telefono;
        this.email=email;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
