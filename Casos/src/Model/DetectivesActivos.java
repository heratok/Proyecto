package Model;

import java.util.Scanner;

public class DetectivesActivos {

    private int no_identificacion;
    private String nombres;
    private String apellidos;
    private int año_experiencia;
    Scanner leer = new Scanner(System.in);

    public DetectivesActivos() {
    }
    

    public DetectivesActivos(int no_identificacion, String nombres, String apellidos, int año_experiencia) {
        this.no_identificacion = no_identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.año_experiencia = año_experiencia;
    }

    public int getNo_identificacion() {
        return no_identificacion;
    }

    public void setNo_identificacion(int no_identificacion) {
        this.no_identificacion = no_identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getAño_experiencia() {
        return año_experiencia;
    }

    public void setAño_experiencia(int año_experiencia) {
        this.año_experiencia = año_experiencia;
    }

    public void DatosDetectives() {
        System.out.println("----------|INGRESE DATOS DEL DETECTIVE|----------");
        System.out.println("Ingrese su numero de identificaion: ");
        no_identificacion = leer.nextInt();
        setNo_identificacion(no_identificacion);
        System.out.println("Ingrese su nombre: ");
        nombres = leer.next();
        setNombres(nombres);
        System.out.println("Ingrese su Apellido: ");
        apellidos = leer.next();
        setApellidos(apellidos);
        System.out.println("Ingrese cuantos años de experiencia tiene: ");
        año_experiencia = leer.nextInt();
        setAño_experiencia(año_experiencia);
        
    }

    public String Vercapacitado() {
        return null;
    }
}
