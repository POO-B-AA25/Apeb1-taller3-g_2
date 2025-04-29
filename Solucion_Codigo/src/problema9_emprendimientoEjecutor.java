import java.time.LocalDate;

public class problema9_emprendimientoEjecutor {
    public static void main(String[] args) {
        problema9_emprendimiento emp = new problema9_emprendimiento("LojaEmprende", "1234567890", "Gastronomia", "Maria Diaz", "Loja", LocalDate.of(2020, 5, 1), 5000);
        System.out.println(emp);
        emp.actualizarInfo("LojaTech", "Tecnologia", "Loja Centro");
        System.out.println(emp);
    }
}
