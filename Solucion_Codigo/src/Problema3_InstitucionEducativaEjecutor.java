// Archivo: Ejecutor3.java
public class Problema3_InstitucionEducativaEjecutor {
    public static void main(String[] args) {
        Problema3_InstitucionEducativa inst = new Problema3_InstitucionEducativa("Loja Tech", "Tecnológica", 200, 20, 2, 150.0);
        Problema3_InstitucionEducativaInstitucionView view = new Problema3_InstitucionEducativaInstitucionView();
        Problema3_InstitucionEducativaInstitucionController ctrl = new Problema3_InstitucionEducativaInstitucionController(inst, view);
        ctrl.actualizarView();
        ctrl.actualizarGastoPorEstudiante(200.0);
        ctrl.actualizarView();
    }
}
