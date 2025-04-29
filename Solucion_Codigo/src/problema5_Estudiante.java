import java.util.Random;

public class problema5_Estudiante {
    private String nombre;
    private double calif1, calif2, calif3;
    private double promedio;
    private String estado;

    public problema5_Estudiante(String nombre) {
        this.nombre = nombre;
        Random r = new Random();
        this.calif1 = 0 + r.nextDouble() * 10;
        this.calif2 = 0 + r.nextDouble() * 10;
        this.calif3 = 0 + r.nextDouble() * 10;
        calcularPromedio();
        determinarEstado();
    }

    private void calcularPromedio() {
        this.promedio = (calif1 + calif2 + calif3) / 3;
    }

    private void determinarEstado() {
        this.estado = promedio >= 6.5 ? "Aprobado" : "Reprobado";
    }

    @Override
    public String toString() {
        return "Estudiante[nombre=" + nombre + ", c1=" + calif1 + ", c2=" + calif2 + ", c3=" + calif3 +
                ", promedio=" + String.format("%.2f", promedio) + ", estado=" + estado + "]";
    }
}