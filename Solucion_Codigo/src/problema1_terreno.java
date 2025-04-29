public class problema1_terreno {
    private double ancho;
    private double largo;
    private double valorMetroCuadrado;
    private double area;
    private double costoTerreno;

    public problema1_terreno() {
    }

    public problema1_terreno(double ancho, double largo, double valorMetroCuadrado) {
        this.ancho = ancho;
        this.largo = largo;
        this.valorMetroCuadrado = valorMetroCuadrado;
        calcularArea();
        calcularCosto();
    }

    public void calcularArea() {
        this.area = this.ancho * this.largo;
    }

    public void calcularCosto() {
        this.costoTerreno = this.area * this.valorMetroCuadrado;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setValorMetroCuadrado(double valorMetroCuadrado) {
        this.valorMetroCuadrado = valorMetroCuadrado;
    }

    public double getAncho() {
        return ancho;
    }

    public double getLargo() {
        return largo;
    }

    public double getValorMetroCuadrado() {
        return valorMetroCuadrado;
    }

    public double getArea() {
        return area;
    }

    public double getCostoTerreno() {
        return costoTerreno;
    }

    @Override
    public String toString() {
        return "Terreno[ancho=" + ancho + ", largo=" + largo + ", area=" + area +
                ", valor/m2=" + valorMetroCuadrado + ", costo=" + costoTerreno + "]";
    }
}