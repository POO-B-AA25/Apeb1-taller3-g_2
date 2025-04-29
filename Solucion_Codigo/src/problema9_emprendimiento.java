import java.time.LocalDate;

public class problema9_emprendimiento {
    private String nombreComercial;
    private String RUC;
    private String sectorEconomico;
    private String propietario;
    private String ubicacion;
    private LocalDate fechaInicio;
    private double capitalInicial;

    public problema9_emprendimiento(String nombreComercial, String RUC, String sectorEconomico, String propietario, String ubicacion, LocalDate fechaInicio, double capitalInicial) {
        this.nombreComercial = nombreComercial;
        this.RUC = RUC;
        this.sectorEconomico = sectorEconomico;
        this.propietario = propietario;
        this.ubicacion = ubicacion;
        this.fechaInicio = fechaInicio;
        this.capitalInicial = capitalInicial;
    }

    public void actualizarInfo(String nombre, String sector, String ubicacion) {
        this.nombreComercial = nombre;
        this.sectorEconomico = sector;
        this.ubicacion = ubicacion;
    }

    public int calcularAntiguedad() {
        return LocalDate.now().getYear() - fechaInicio.getYear();
    }

    public String determinarTamano() {
        if (capitalInicial < 10000) return "Micro";
        if (capitalInicial < 100000) return "Pequeño";
        return "Mediano";
    }

    @Override
    public String toString() {
        return "Emprendimiento[nombre=" + nombreComercial + ", RUC=" + RUC + ", sector=" + sectorEconomico +
                ", propietario=" + propietario + ", ubicacion=" + ubicacion + ", inicio=" + fechaInicio +
                ", capital=" + capitalInicial + ", antiguedad=" + calcularAntiguedad() + ", tamano=" + determinarTamano() + "]";
    }
}