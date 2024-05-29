package gbl.pessoal.interfaces.defaults;

public interface Empregado {

    String obterPrimeiroNome();
    String obterUltimoNome();
    void fazerTrabalho();

    default String getNome(){
        return String.format("%s %s", obterPrimeiroNome(), obterUltimoNome());
    }

}
