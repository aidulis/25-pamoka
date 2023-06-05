import javax.lang.model.SourceVersion;
import java.util.Scanner;

public class Uzduotis1 {
    public static void main(String[] args) {
        Scanner skait = new Scanner(System.in);

        System.out.println("Įveskite apskritimo spindulį: ");
        int r = skait.nextInt();
        double S = plotas(r);
        double C = apskritimoIlgis(r);
        double D = diametras(r);
        System.out.println("Apskritimo plotas S = " + S);
        System.out.println("Apskritimo ilgis C = " + C);
        System.out.println("Apskritimo diametras D = " + D);
    }
    public static double plotas(int r){
        double S =  (Math.PI * r * r);
        return S;

}

    public static double apskritimoIlgis(int r) {
        double C = 2 * Math.PI * r;
        return C;
    }

    public static double diametras(int r){
        double D = 2 * r;
        return D;
    }
}

