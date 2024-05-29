package gbl.pessoal.interfaces.defaults;

public class EmpregadoDaEmpresa implements Empresa, Empregado {

    private String primeiroNome;
    private String ultimoNome;

    @Override
    public String getNome() {
        // TODO Auto-generated method stub
        return String.format("Empregado %s trabalhando para a empresa %s.",
                Empregado.super.getNome(),
                Empresa.super.getNome());
    }

    @Override
    public String obterPrimeiroNome() {
        return this.primeiroNome;
    }

    @Override
    public String obterUltimoNome() {
        return this.ultimoNome;
    }

    @Override
    public void fazerTrabalho() {
        System.out.println("\nTrabalhando...");
    }

}
