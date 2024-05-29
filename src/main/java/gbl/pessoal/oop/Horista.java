package gbl.pessoal.oop;

public class Horista extends Empregado{

    public static final double VALOR_HORA_DEFAULT = 100;
    public static final int HORAS_TABALHADAS_DEFAULT = 80;

    private double valorHora = VALOR_HORA_DEFAULT;
    private double horasTrabalhadas = HORAS_TABALHADAS_DEFAULT;

    public Horista() {
        this(NOME_DEFAULT, VALOR_HORA_DEFAULT);
    }

    public Horista(String nome) {
        this(nome, VALOR_HORA_DEFAULT);
    }

    public Horista(String nome, double valorHora) {
        super(nome);
        this.valorHora = valorHora;
    }

    public double getValorHora() {
        return this.valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double getPagamento() {
        return valorHora * horasTrabalhadas;
    }


}
