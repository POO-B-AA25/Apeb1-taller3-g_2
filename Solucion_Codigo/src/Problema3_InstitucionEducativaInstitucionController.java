public class Problema3_InstitucionEducativaInstitucionController {
    private Problema3_InstitucionEducativa model;
    private Problema3_InstitucionEducativaInstitucionView view;

    public Problema3_InstitucionEducativaInstitucionController(Problema3_InstitucionEducativa m, Problema3_InstitucionEducativaInstitucionView v) {
        this.model = m;
        this.view = v;
    }

    public void actualizarGastoPorEstudiante(double g) {
        model.setGastoPorEstudiante(g);
        model.calcularPresupuesto();
    }

    public void actualizarNumAlumnos(int n) {
        model.setNumAlumnos(n);
        model.calcularPresupuesto();
    }

    public void actualizarView() {
        view.mostrarDetalles(model.toString());
    }
}
