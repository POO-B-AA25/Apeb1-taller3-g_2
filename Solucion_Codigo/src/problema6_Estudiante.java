public class problema6_Estudiante {
    private String nombre;
    private String apellido;
    private String cedula;
    private double sueldoBasico;
    private double sueldoTotal;

    public problema6_Estudiante(String nombre, String apellido, String cedula, double sueldoBasico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.sueldoBasico = sueldoBasico;
        calcularSueldoTotal();
    }
    private void calcularSueldoTotal() {
        this.sueldoTotal = sueldoBasico * 1.2;
    }
    @Override
    public String toString() {
        return "Profesor[nombre="+nombre+" "+apellido+", cedula="+cedula+", basico="+sueldoBasico+", total="+sueldoTotal+"]";
    }
}

