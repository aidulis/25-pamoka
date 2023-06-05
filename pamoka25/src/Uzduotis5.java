public class Uzduotis5 {
    public static void main(String[] args) {
        int a = 20, b = 25;

        System.out.println(percentage(a, b) + "%");
    }
    public static int percentage(int a, int b){
        float result = 0;
        result = (((b - a) * 100) / a);
        return (int)result;
    }
}
