package gbl.pessoal.interfaces;

import java.time.LocalDateTime;

public class Tarefa implements Comparable<Tarefa>{

    private int id;
    private String nome;
    private LocalDateTime dataInicio = LocalDateTime.now();
    private LocalDateTime dataFim = LocalDateTime.now();
    private int prioridade;
    private boolean completa;
    
    public Tarefa() {
    }

    public Tarefa(int id, String nome, int prioridade) {
        this.id = id;
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public Tarefa(int id, String nome, LocalDateTime dataInicio, LocalDateTime dataFim, int prioridade,
            boolean completa) {
        this.id = id;
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.prioridade = prioridade;
        this.completa = completa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDateTime getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDateTime dataFim) {
        this.dataFim = dataFim;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public boolean isCompleta() {
        return completa;
    }

    public void setCompleta(boolean completa) {
        this.completa = completa;
    }

    @Override
    public String toString() {
        return "Tarefa [id=" + id + ", nome=" + nome + ", dataInicio=" + dataInicio + ", dataFim=" + dataFim
                + ", prioridade=" + prioridade + ", completa=" + completa + "]";
    }

    @Override
    public int compareTo(Tarefa o) {
        return this.nome.compareTo(o.getNome());
    }

    

}
