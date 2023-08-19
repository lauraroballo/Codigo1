package umb;



public class Estudiante {
    
    private String nombre, correo, celular, codigo;
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
   
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
   
    public Estudiante(String codigo, String nombre, String correo, String celular) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.correo = correo;
        this.celular = celular;
    }
    @Override
    public String toString() {
        return "Estudiante{" + "codigo=" + codigo + ", nombre=" + nombre + ", correo=" +correo + ", celular=" + celular +'}';
    }
    
    
}
