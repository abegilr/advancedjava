package gbl.pessoal.oop;

//import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Empregado {

    public static final String NOME_DEFAULT = "UNKNOWN";
    public static int nextId;

    private Integer id;
    private String nome;
    private LocalDateTime dataContratacao;

    public Empregado() {
        this(NOME_DEFAULT);
    }

    public Empregado(String nome) {
        this.id = nextId++;
        this.nome = nome;
        this.dataContratacao = LocalDateTime.now();
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getDataContratacao() {
        return this.dataContratacao;
    }

    public void setDataContratacao(LocalDateTime dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public abstract double getPagamento();

    @Override
    public String toString() {
        return new StringBuilder().append("\nID: ").append(this.id)
                .append("\nNome: ").append(this.nome)
                .append("\nContratado em: ").append(DateTimeFormatter.ofPattern("dd-MMMM-yyyy à's' HH:mm:ss")
                        .format(this.dataContratacao))
                .toString();
    }

}
