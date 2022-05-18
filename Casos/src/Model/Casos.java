package Model;

import java.util.Scanner;

public class Casos {
    private int Codigo;
    private String Descripcion_caso;
    private String Causa_investigacion;
    private String Codigo_prioridad;
    private String Nombre_clave;
    private Tipo_Caso tipocaso[];
    private static final int maxicaso = 3;

    public Casos() {
        this.Codigo = Codigo;
        this.Descripcion_caso = Descripcion_caso;
        this.Causa_investigacion = Causa_investigacion;
        this.Codigo_prioridad = Codigo_prioridad;
        this.Nombre_clave = Nombre_clave;
        
    }
    Scanner Leer  = new Scanner(System.in);

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getDescripcion_caso() {
        return Descripcion_caso;
    }

    public void setDescripcion_caso(String Descripcion_caso) {
        this.Descripcion_caso = Descripcion_caso;
    }

    public String getCausa_investigacion() {
        return Causa_investigacion;
    }

    public void setCausa_investigacion(String Causa_investigacion) {
        this.Causa_investigacion = Causa_investigacion;
    }

    public String getCodigo_prioridad() {
        return Codigo_prioridad;
    }

    public void setCodigo_prioridad(String Codigo_prioridad) {
        this.Codigo_prioridad = Codigo_prioridad;
    }

    public String getNombre_clave() {
        return Nombre_clave;
    }

    public void setNombre_clave(String Nombre_clave) {
        this.Nombre_clave = Nombre_clave;
    }
    
    public void Introducir_datos(){
        System.out.println("----------|INGRESE LOS DATOS DEL CASO|----------");
        System.out.println("Escriba el codigo del caso: ");
        int codigo = Leer.nextInt();
        setCodigo(codigo);
        System.out.println("-----------------------------------------------");
        System.out.println("Escriba Descripcion del caso: ");
        String DescripCaso = Leer.next();
        setDescripcion_caso(DescripCaso);
        System.out.println("-----------------------------------------------");
        System.out.println("Escriba la causa de investigacion: ");
        String Causa = Leer.next();
        setCausa_investigacion(Causa);
        System.out.println("-----------------------------------------------");
        System.out.println("Escriba el codigo de prioridad: (A = Minima, B = Media, C = Maxima)");
        String Codigo_Prioridad = Leer.next();
        setCodigo_prioridad(Codigo_Prioridad);
        System.out.println("-----------------------------------------------");
        System.out.println("Escriba el nombre clave: ");
        String nombre_clave = Leer.next();
        setNombre_clave(nombre_clave);
        System.out.println("-----------------------------------------------");
        
    }

  
}
