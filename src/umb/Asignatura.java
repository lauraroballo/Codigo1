package umb;

public class Asignatura {

    
    String idAsignatura;

   
    String nombreAsignatura;
   
    public Asignatura() {
    }

    public Asignatura(String idAsignatura, String nombreAsignatura) {
        this.idAsignatura = idAsignatura;
        this.nombreAsignatura = nombreAsignatura;
//        
//        }
    }
    
 @Override
    public String toString() {
        return "Asignatura{" + "idAsignatura=" + idAsignatura + ", nombreAsignatura=" + nombreAsignatura + "diantes=" +'}';
    }
//    
  
 public String getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(String idAsignatura) {
        this.idAsignatura = idAsignatura;
    }
    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

   
    
    
}
