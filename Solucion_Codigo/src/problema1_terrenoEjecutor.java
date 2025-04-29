import java.util.Random;

public class problema1_terrenoEjecutor {
    public static void main(String[] args) {
        Random r = new Random();
        problema1_terreno t = new problema1_terreno();
        t.setAncho(1 + r.nextDouble() * 9);
        t.setLargo(1 + r.nextDouble() * 9);
        t.setValorMetroCuadrado(10 + r.nextDouble() * 90);
        t.calcularArea();
        t.calcularCosto();
        System.out.println(t);
    }
}