public class problema8_cheque {
    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comision;

    public problema8_cheque(String nombreCliente, String nombreBanco, double valorCheque) {
        this.nombreCliente = nombreCliente;
        this.nombreBanco = nombreBanco;
        this.valorCheque = valorCheque;
        calcularComision();
    }

    private void calcularComision() {
        this.comision = valorCheque * 0.00003;
    }

    @Override
    public String toString() {
        return "Cheque[cliente=" + nombreCliente + ", banco=" + nombreBanco + ", valor=" + valorCheque + ", comision=" + comision + "]";
    }
}

