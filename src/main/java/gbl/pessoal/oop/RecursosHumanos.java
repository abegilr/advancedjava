package gbl.pessoal.oop;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class RecursosHumanos {

    private List<Empregado> empregados = new ArrayList<>();

    public void contratar(Empregado e){
        empregados.add(e);
    }

    public void demitir(Empregado e){
        empregados.remove(e);
    }

    public List<Empregado> obterlistaDeEmpregados(){
        return empregados;
    }

    public void listarEmpregados(){
        empregados.forEach(System.out::println);
    }

    public void processarPagamentos(){
        for (Empregado empregado : empregados) {
            System.out.printf("Pagamento para: %s %s%n", empregado.getNome(), 
            NumberFormat.getCurrencyInstance()
            .format(empregado.getPagamento()));
        }
    }

}
