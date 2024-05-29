package gbl.pessoal.oop;

import java.text.NumberFormat;
import java.util.Locale;

public class ImpressaoFormatadaDeDeMoeda {
    public static void main(String[] args) {
        double valor = 12345.45755;
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println("\nO tipo do formatador (variável nf) é " + nf.getClass().getSimpleName());
        System.out.println(new StringBuilder().append("Montante impresso no formato local de moeda: ")
                .append(nf.format(valor)));

        nf = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("\nO tipo do formatador (variável nf) é " + nf.getClass().getName());
        System.out.println(
                "Montante impresso no formato "
                        + Locale.US.getDisplayLanguage(Locale.forLanguageTag("pt-BR"))
                        + " de "
                        + Locale.US.getDisplayCountry(Locale.forLanguageTag("pt-BR"))
                        + ": "
                        + nf.format(valor));
    }
}
