import java.util.Random;

public class problema8_chequeEjecutor {
    public static void main(String[] args) {
        Random r = new Random();
        problema8_cheque c = new problema8_cheque("Cliente" + r.nextInt(100), "Banco" + r.nextInt(5), 1000 + r.nextDouble() * 9000);
        System.out.println(c);
    }
}
