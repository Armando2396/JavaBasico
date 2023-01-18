public class Main {
    public static void main(String[] args) {

        double precioProd = 10.50;

        System.out.println(precioConImpuesto(precioProd));
    }
    static double precioConImpuesto(double precio){
        double res = precio * 0.07;
        double resultado = precio + res;
        return  resultado;
    }
}