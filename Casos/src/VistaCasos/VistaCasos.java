package VistaCasos;
import Model.*;
public class VistaCasos {
    public static void main(String[] args) {
       
        Casos caso1 = new Casos();
        caso1.Introducir_datos();
      
        Anotacion anotacion1 = new Anotacion();
        anotacion1.PedirObservaciones();
        
        DetectivesActivos activos1 = new DetectivesActivos();
        activos1.DatosDetectives();
        
        Sospechoso sospechoso1 = new Sospechoso();
        sospechoso1.DatoSospechoso();
        Imprimircaso(caso1);
        imprimir1(anotacion1);
        System.out.println("---------------------------------------------");
        imprimir2(activos1);
        System.out.println("---------------------------------------------");
        imprimir3(sospechoso1);
        Tipo_Caso caso2 = new Tipo_Caso();
        caso2.Tipo_Casos();
    }
    
    public static void Imprimircaso(Casos caso1){
        System.out.println("----------|DATOS DEL CASO|----------");
        System.out.println("CODIGO DEL CASO = "+ caso1.getCodigo());
        System.out.println("----------------------------------");
        System.out.println("DESCRIPCION DEL CASO = "+ caso1.getDescripcion_caso());
        System.out.println("----------------------------------");
        System.out.println("CAUSA DE INVESTIGACION = "+ caso1.getCausa_investigacion());
        System.out.println("----------------------------------");
        System.out.println("NOMBRE CLAVE = "+ caso1.getNombre_clave());
        System.out.println("----------------------------------"); 
        System.out.println("CODIGO DE PRIORIDAD = "+ caso1.getCodigo_prioridad()); 
        System.out.println("----------------------------------"); 
    }
    public static void imprimir1(Anotacion anotacion1) {
        System.out.println("----------|ANOTACIONES DEL DETECTIVE|----------");
        System.out.println("Las observaciones del caso son: " + anotacion1.getObservaciones() + "\n" + "La fecha del Registro es: " + anotacion1.getFechaRegistro());

    }

    public static void imprimir2(DetectivesActivos activos1) {
        System.out.println("----------|DATOS DEL DETECTIVE|----------");
        System.out.println("Su numero de identificacion es: " + activos1.getNo_identificacion() + "\n" + "Su nombre es: " + activos1.getNombres() + "\n" + "Su apellido es: " + activos1.getApellidos() + "Tienes " + activos1.getAño_experiencia() + " años de experiencia");

    }

    public static void imprimir3(Sospechoso sospechoso1) {
        System.out.println("----------|DATOS DEL SOSPECHOSO|----------");
        System.out.println("Su id es: " + sospechoso1.getNoID() + "\n" + "Su nombre es: " + sospechoso1.getNombres() + "\n" + "Su apellido es: " + sospechoso1.getApellidos() + "\n" + "Su edad es: " + sospechoso1.getEdad() + "\n" + "Su ultima direccion fue: " + sospechoso1.getUltidireconocidad() + "\n" + "Su localidad es: " + sospechoso1.getLocalidad() + "\n" + "Su ciudad es: " + sospechoso1.getCiudad() + "\n" + "Su departamento es: " + sospechoso1.getDepartamento() + "\n" + "Su pais es: " + sospechoso1.getPais());

    }
    
  
    
}
