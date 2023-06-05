import java.util.Scanner;
public class Uzduotis4 {
    public static void main(String[] args) {
        Scanner skait = new Scanner(System.in);
        System.out.println("Įveskite skaičių, kurį norite keisti procentine dalimi");
        double skaicius = skait.nextDouble();
        System.out.println("Įveskite procentuis kiek didinti (teigiamą) arba mažinti (neigiamą)");
        double procentas = skait.nextDouble();
        System.out.println("Pakeistas skaičius: " + pakeltiProcentais(skaicius, procentas));
    }

    public static double pakeltiProcentais(double x, double p) {
        return x + x * p / 100;
    }
}