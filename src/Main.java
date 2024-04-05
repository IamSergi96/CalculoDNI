import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NIF midni = new NIF(45962069, "L");
        NIF miDNIsinLetra = new NIF(12345678);

        //probar metodos:
        System.out.println("Leer dni");
        midni.leer();

        System.out.println("Metodo String DNI");
        String dniString1= midni.toString();
        System.out.println(dniString1);
        String dniString2 = miDNIsinLetra.toString();
        System.out.println(dniString2);
    }
}
class NIF{
    int numeroDNI;
    String letra;
    static  Scanner scanner = new Scanner(System.in);
    public NIF(int numeroDNI, String letra){
        this.numeroDNI=numeroDNI;
        this.letra=letra;
    }
    public NIF(int numeroDNI){
        this.numeroDNI=numeroDNI;
        this.letra = obtenerLetra(numeroDNI);
    }
    public void leer(){
        System.out.println("Introduce el numero sin letra del DNI");
        int dni = scanner.nextInt();
        String letra= obtenerLetra(dni);
        System.out.println(letra);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(numeroDNI);
        sb.append("-");
        sb.append(letra);
        return sb.toString();
    }
    private String obtenerLetra(int numeroDNI){
        int numeroLetraDNI = numeroDNI%23;
        String letraDNI;
        switch(numeroLetraDNI){
            case 0:
                letraDNI="T";
                break;
            case 1:
                letraDNI="R";
                break;
            case 2:
                letraDNI="W";
                break;
            case 3:
                letraDNI="A";
                break;
            case 4:
                letraDNI="G";
                break;
            case 5:
                letraDNI="M";
                break;
            case 6:
                letraDNI="Y";
                break;
            case 7:
                letraDNI="F";
                break;
            case 8:
                letraDNI="P";
                break;
            case 9:
                letraDNI="D";
                break;
            case 10:
                letraDNI="X";
                break;
            case 11:
                letraDNI="B";
                break;
            case 12:
                letraDNI="N";
                break;
            case 13:
                letraDNI="J";
                break;
            case 14:
                letraDNI="Z";
                break;
            case 15:
                letraDNI="S";
                break;
            case 16:
                letraDNI="Q";
                break;
            case 17:
                letraDNI="V";
                break;
            case 18:
                letraDNI="H";
                break;
            case 19:
                letraDNI="L";
                break;
            case 20:
                letraDNI="C";
                break;
            case 21:
                letraDNI="K";
                break;
            case 22:
                letraDNI="E";
                break;
            default:
                throw new IllegalArgumentException("numero de dni no valido");
        }
        return letraDNI;
    }

}