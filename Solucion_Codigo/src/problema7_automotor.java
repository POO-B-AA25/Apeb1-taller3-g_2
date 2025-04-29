import java.time.LocalDate;

public class problema7_automotor {
    private String cedulaDueno;
    private String marca;
    private int anoFabricacion;
    private double valorVehiculo;
    private double valorMatricula;

    public problema7_automotor(String cedulaDueno, String marca, int anoFabricacion, double valorVehiculo) {
        this.cedulaDueno = cedulaDueno;
        this.marca = marca;
        this.anoFabricacion = anoFabricacion;
        this.valorVehiculo = valorVehiculo;
        calcularValorMatricula();
    }

    private int calcularAntiguedad() {
        return LocalDate.now().getYear() - anoFabricacion;
    }

    private void calcularValorMatricula() {
        int antig = calcularAntiguedad();
        this.valorMatricula = valorVehiculo * 0.00002 * antig;
    }

    @Override
    public String toString() {
        return "Automotor[dueno=" + cedulaDueno + ", marca=" + marca + ", año=" + anoFabricacion +
                ", valor=" + valorVehiculo + ", matricula=" + valorMatricula + "]";
    }
}

