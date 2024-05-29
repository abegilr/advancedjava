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
        return new StringBuilder().append("ID: ").append(this.id)
                .append("\tNome: ").append(this.nome)
                .append("\tContratado em: ").append(DateTimeFormatter.ofPattern("dd-MMMM-yyyy à's' HH:mm:ss")
                        .format(this.dataContratacao))
                .toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((dataContratacao == null) ? 0 : dataContratacao.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Empregado other = (Empregado) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (dataContratacao == null) {
            if (other.dataContratacao != null)
                return false;
        } else if (!dataContratacao.equals(other.dataContratacao))
            return false;
        return true;
    }

    

}
