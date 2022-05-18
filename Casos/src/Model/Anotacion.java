
package Model;

import java.util.Scanner;

public class Anotacion {
    private String observaciones;
    private String fechaRegistro;
    Scanner leer= new Scanner(System.in);

    public Anotacion() {
    }
    

    public Anotacion(String observaciones, String fechaRegistro) {
        this.observaciones = observaciones;
        this.fechaRegistro = fechaRegistro;
    }


    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public void PedirObservaciones(){
        System.out.println("----------|INGRESE LAS ANOTACIONES DEL CASO|----------");
        System.out.println("Ingrese las observaciones del caso: ");
        observaciones=leer.next();
        setObservaciones(observaciones);
        System.out.println("Ingrese la fecha de Registro: ");
        fechaRegistro=leer.next();
        setFechaRegistro(fechaRegistro);
    }

}
