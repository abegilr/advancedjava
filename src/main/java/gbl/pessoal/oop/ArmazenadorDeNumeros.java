package gbl.pessoal.oop;

import java.io.Console;

public class ArmazenadorDeNumeros {

    private boolean[] numeros = new boolean[100];

    public void armazenar(int num) {
        this.numeros[num] = true;
    }

    public boolean estaArmazenado(int num) {
        return this.numeros[num];
    }

    

    public static void main(String[] args) {
        ArmazenadorDeNumeros armazenadorDeNumeros = new ArmazenadorDeNumeros();

        
        
        
        Console console = System.console();
        String linha;
        int numero;
        // boolean resposta;

        coleta: {
            do {
                linha = "";
                linha = console.readLine("Informe um número de 0 a 99 para incluir <Tecle ENTER para sair>");
                if (linha.isBlank()) {
                    System.out.println("Saindo");
                    break;
                }
                numero = Integer.parseInt(linha);
                if (99 < numero || numero < 0) {
                    System.out.println("Informe um número válido!");
                    continue;
                }
                armazenadorDeNumeros.armazenar(numero);

            } while (true);

        }

        do {
            linha = "";
            linha = console.readLine("Informe um número de 0 a 99 para pesquisar <Tecle ENTER para encerrar>");
            if (linha.isBlank()) {
                System.out.println("Saindo");
                break;
            }
            numero = Integer.parseInt(linha);
            if (99 < numero || numero < 0) {
                System.out.println("Informe um número válido!");
                continue;
            }
            System.out.println(numero + (armazenadorDeNumeros.estaArmazenado(numero)?" está, SIM, armazenado!":" NÃO está armazenado!"));

        } while (true);



    }

}
