package gbl.pessoal.interfaces.defaults;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoMetodosDefaultEmInterfaces {

    public static void main(String[] args) {
        List<Integer> numeros = Stream.of(-4, 1, 2, -1, -3, 3, -4, 4, -2, 5, 6).collect(Collectors.toList());
        System.out.println("Lista de números: " + numeros );

        boolean removidos = numeros.removeIf(n -> n<0);
        System.out.println((removidos? "Houve ": "Não houve ") + "remoção de elementos!");

        System.out.println("Lista atualizada de números: ");
        numeros.forEach(System.out::println);

    }

}
