public class Problema4_EquipoCelular {
    private String sistemaOperativo;
    private double tamanoPantalla;
    private double costoInicial;
    private double ivaPorcentaje;
    private double ivaCostoInicial;
    private double costoFinal;
    private String direccionMAC;
    private String imei;

    public Problema4_EquipoCelular(String sistemaOperativo, double tamanoPantalla, double costoInicial, double ivaPorcentaje, String direccionMAC, String imei) {
        this.sistemaOperativo = sistemaOperativo;
        this.tamanoPantalla = tamanoPantalla;
        this.costoInicial = costoInicial;
        this.ivaPorcentaje = ivaPorcentaje;
        this.direccionMAC = direccionMAC;
        this.imei = imei;
        calcularIva();
        calcularCostoFinal();
    }

    public void calcularIva() {
        this.ivaCostoInicial = this.costoInicial * ivaPorcentaje / 100;
    }

    public void calcularCostoFinal() {
        this.costoFinal = this.costoInicial + this.ivaCostoInicial;
    }

    @Override
    public String toString() {
        return "EquipoCelular[S.O.=" + sistemaOperativo + ", pantalla=" + tamanoPantalla + "\"" +
                ", costoInit=" + costoInicial + ", IVA%=" + ivaPorcentaje + ", IVAvalor=" + ivaCostoInicial +
                ", costoFinal=" + costoFinal + ", MAC=" + direccionMAC + ", IMEI=" + imei + "]";
    }
}

