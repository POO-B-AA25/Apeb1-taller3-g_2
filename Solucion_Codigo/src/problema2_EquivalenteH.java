public class problema2_EquivalenteH {
    private int horas;
    private int minutos;
    private int segundos;
    private int dias;

    public problema2_EquivalenteH(int horas) {
        this.horas = horas;
        calcularEquivalencias();
    }

    public problema2_EquivalenteH(int horas, int minutos, int segundos, int dias) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        this.dias = dias;
    }

    public void calcularEquivalencias() {
        this.minutos = horas * 60;
        this.segundos = horas * 3600;
        this.dias = horas / 24;
    }

    @Override
    public String toString() {
        return "EquivalenteHora[horas=" + horas + ", minutos=" + minutos + ", segundos=" + segundos + ", dias=" + dias + "]";
    }
}
