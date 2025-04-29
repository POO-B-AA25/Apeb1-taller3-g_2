public class problema10_Presidencia {
    private String nombre;
    private int edad;
    private String partidoPolitico;
    private String planGobierno;
    private int numPropuestas;

    public problema10_Presidencia(String nombre, String partidoPolitico) {
        this.nombre = nombre;
        this.partidoPolitico = partidoPolitico;
    }

    public problema10_Presidencia(String nombre, int edad, String partidoPolitico, String planGobierno, int numPropuestas) {
        this(nombre, partidoPolitico);
        this.edad = edad;
        this.planGobierno = planGobierno;
        this.numPropuestas = numPropuestas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean validarEdadMinima() {
        return this.edad >= 35; // edad mínima para presidencia en Ecuador
    }

    @Override
    public String toString() {
        return "CandidatoPresidencial[nombre=" + nombre + ", edad=" + edad + ", partido=" + partidoPolitico +
                ", propuestas=" + numPropuestas + ", mayorEdad?=" + validarEdadMinima() + "]";
    }
}

