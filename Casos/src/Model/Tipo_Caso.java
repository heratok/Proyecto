package Model;
import java.util.Scanner;
public class Tipo_Caso {
    private String Caso_Cybercrimen;
    private String Caso_Homicidio;
    private String Caso_Narcotico;
    private int Tipocaso;
    public Tipo_Caso() {
        this.Caso_Cybercrimen = Caso_Cybercrimen;
        this.Caso_Homicidio = Caso_Homicidio;
        this.Caso_Narcotico = Caso_Narcotico;
    }
    Scanner Leer  = new Scanner(System.in);

    public int getTipocaso() {
        return Tipocaso;
    }

    public void setTipocaso(int Tipocaso) {
        this.Tipocaso = Tipocaso;
    }

    public Tipo_Caso(int Tipocaso) {
        this.Tipocaso = Tipocaso;
    }

    public String getCaso_Cybercrimen() {
        return Caso_Cybercrimen;
    }

    public void setCaso_Cybercrimen(String Caso_Cybercrimen) {
        this.Caso_Cybercrimen = Caso_Cybercrimen;
    }

    public String getCaso_Homicidio() {
        return Caso_Homicidio;
    }

    public void setCaso_Homicidio(String Caso_Homicidio) {
        this.Caso_Homicidio = Caso_Homicidio;
    }

    public String getCaso_Narcotico() {
        return Caso_Narcotico;
    }

    public void setCaso_Narcotico(String Caso_Narcotico) {
        this.Caso_Narcotico = Caso_Narcotico;
    }
    public int Tipo_Casos(){
        System.out.println("----------|INTRODUZCA EL TIPO DE CASO|----------");
        System.out.println("Escriba | 1 = Cybercrimen | , | 2 = Homicidio | , | 3 = Narcoticos | ");
        int Tipo_caso = Leer.nextInt();
        setTipocaso(Tipo_caso);
        if (this.Tipocaso == 1) {
           System.out.println("------|TIPO DE CASO|------");
           System.out.println("Cybercrimen");
           System.exit(0);
        }
        if (this.Tipocaso == 2) {
            System.out.println("------|TIPO DE CASO|------");
            System.out.println("Homicidio");
            System.exit(0);
        }
        if (this.Tipocaso == 3) {
            System.out.println("------|TIPO DE CASO|------");
            System.out.println("Narcoticos");
            System.exit(0);
        }
        return (Tipo_Casos());
    }
}
