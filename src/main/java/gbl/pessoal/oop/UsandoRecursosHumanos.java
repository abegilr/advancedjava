package gbl.pessoal.oop;

public class UsandoRecursosHumanos {

    public static void main(String[] args) {
        RecursosHumanos rh = new RecursosHumanos();

        rh.contratar(new Assalariado("Frederico"));
        rh.contratar(new Horista("Carlos"));
        rh.contratar(new Assalariado());
        rh.contratar(new Horista());
        rh.listarEmpregados();
        rh.processarPagamentos();
    }

}
