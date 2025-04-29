public class Problema3_InstitucionEducativa {
    private String nombre;
    private String tipo;
    private int numAlumnos;
    private int numDocentes;
    private int numSedes;
    private double gastoPorEstudiante;
    private double presupuesto;

    public Problema3_InstitucionEducativa() {
    }

    public Problema3_InstitucionEducativa(String nombre, String tipo, int numAlumnos, int numDocentes, int numSedes, double gastoPorEstudiante) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.numAlumnos = numAlumnos;
        this.numDocentes = numDocentes;
        this.numSedes = numSedes;
        this.gastoPorEstudiante = gastoPorEstudiante;
        calcularPresupuesto();
    }

    public void calcularPresupuesto() {
        this.presupuesto = this.numAlumnos * this.gastoPorEstudiante;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNumAlumnos(int numAlumnos) {
        this.numAlumnos = numAlumnos;
    }

    public void setNumDocentes(int numDocentes) {
        this.numDocentes = numDocentes;
    }

    public void setNumSedes(int numSedes) {
        this.numSedes = numSedes;
    }

    public void setGastoPorEstudiante(double gastoPorEstudiante) {
        this.gastoPorEstudiante = gastoPorEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNumAlumnos() {
        return numAlumnos;
    }

    public int getNumDocentes() {
        return numDocentes;
    }

    public int getNumSedes() {
        return numSedes;
    }

    public double getGastoPorEstudiante() {
        return gastoPorEstudiante;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    @Override
    public String toString() {
        return "InstitucionEducativa[nombre=" + nombre + ", tipo=" + tipo + ", alumnos=" + numAlumnos +
                ", docentes=" + numDocentes + ", sedes=" + numSedes + ", gasto/xAl=" + gastoPorEstudiante +
                ", presupuesto=" + presupuesto + "]";
    }
}

