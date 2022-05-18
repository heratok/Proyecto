 
package Model;

import java.util.Scanner;
public class Sospechoso {
    private int noID;
    private String nombres;
    private String apellidos;
    private int edad;
    private String ultidireconocidad; //ultima direcion conocidad
    private String localidad;
    private String ciudad;
    private String departamento;
    private String pais;
    private String descripcionFisica;
    Scanner leer= new Scanner(System.in);

    public Sospechoso() {
    }
    

    public Sospechoso(int noID, String nombres, String apellidos, int edad, String ultidireconocidad, String localidad, String ciudad, String departamento, String pais, String descripcionFisica) {
        this.noID = noID;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.ultidireconocidad = ultidireconocidad;
        this.localidad = localidad;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.pais = pais;
        this.descripcionFisica = descripcionFisica;
        
    }


    public int getNoID() {
        return noID;
    }

    public void setNoID(int noID) {
        this.noID = noID;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUltidireconocidad() {
        return ultidireconocidad;
    }

    public void setUltidireconocidad(String ultidireconocidad) {
        this.ultidireconocidad = ultidireconocidad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDescripcionFisica() {
        return descripcionFisica;
    }

    public void setDescripcionFisica(String descripcionFisica) {
        this.descripcionFisica = descripcionFisica;
    }
    public void DatoSospechoso(){
        System.out.println("----------|INGRESE LOS DATOS DEL SOSPECHOSO|----------");
        System.out.println("Ingrese su numero de id: ");
        noID=leer.nextInt();
        setNoID(noID);
        System.out.println("Ingrese su nombre: ");
        nombres=leer.next();
        setNombres(nombres);
        System.out.println("Ingrese su Apellido: ");
        apellidos=leer.next();
        setApellidos(apellidos);
        System.out.println("Ingrese su edad: ");
        edad=leer.nextInt();
        setEdad(edad);
        System.out.println("Ingrese su ultima direcion conocidad: ");
        ultidireconocidad=leer.next();
        setUltidireconocidad(ultidireconocidad);
        System.out.println("Ingrese su localidad: ");
        localidad=leer.next();
        setLocalidad(localidad);
        System.out.println("Ingrese su Ciudad: ");
        ciudad=leer.next();
        setCiudad(ciudad);
        System.out.println("Ingrese su departamento: ");
        departamento=leer.next();
        setDepartamento(departamento);
        System.out.println("Ingrese su pais: ");
        pais=leer.next();
        setPais(pais);
          
    }
    public void obtenerfoto(){
    }
    
}
