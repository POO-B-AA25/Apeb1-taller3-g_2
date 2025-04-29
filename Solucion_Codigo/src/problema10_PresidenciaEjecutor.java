public class problema10_PresidenciaEjecutor {
    public static void main(String[] args) {
        problema10_Presidencia c1 = new problema10_Presidencia("Luis Gomez", "Partido Verde");
        problema10_Presidencia c2 = new problema10_Presidencia("Ana Castillo", 40, "Partido Azul", "Plan 2025", 10);
        System.out.println(c1);
        System.out.println(c2 + ", cumple edad? " + c2.validarEdadMinima());
    }
}
