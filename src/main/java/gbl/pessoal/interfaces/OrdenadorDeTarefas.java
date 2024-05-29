package gbl.pessoal.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenadorDeTarefas {

    public static void main(String[] args) {
        List<Tarefa> tarefas = new ArrayList<>();
        tarefas.add(new Tarefa(1, "Run away from killer rabbit", 4));
        tarefas.add(new Tarefa(2, "Answer the bridgekeeper", 2));
        tarefas.add(new Tarefa(3, "Defeat the Black Knight", 1));
        tarefas.add(new Tarefa(4, "Give a shrubbery to the Knights Who Say Ni!", 4));
        tarefas.add(new Tarefa(5, "Lobbeth thou thy Holy Hand Grenade", 3));


        System.out.println("Antes da ordenação: ");
        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa);
        }

        
        Collections.sort(tarefas);
        System.out.println("Após a ordenação: ");
        tarefas.forEach(System.out::println); 

        

    }

}
