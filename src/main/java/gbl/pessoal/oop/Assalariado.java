package gbl.pessoal.oop;

public class Assalariado extends Empregado{

   
        public static final double SALARIO_DEFAULT = 12000;
    
        private double salario = SALARIO_DEFAULT;
    
        public Assalariado() {

        }
    
        public Assalariado(String nome) {
            this(nome, SALARIO_DEFAULT);
        }
    
        public Assalariado(String nome, double salario) {
            super(nome);
            this.salario = salario;
        }
    
        public double getSalario() {
            return salario;
        }
    
        public void setSalario(double salario) {
            this.salario = salario;
        }
    
        @Override
        public double getPagamento() {
            return this.salario;
        }
    

}
