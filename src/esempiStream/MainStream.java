package esempiStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainStream {

    public static void main(String[] args) {

        List<Integer> interi = new ArrayList<>();
        interi.add(10);
        interi.add(7);
        interi.add(-5);
        interi.add(18);

        int somma = interi.stream().reduce(0, (a, b) -> a+b);
        System.out.println(somma);

        int prodotto = interi.stream().reduce(1, (a,b) -> a*b);

        List<String> parole = new ArrayList<>();
        parole.add("ciao");
        parole.add("marco");
        parole.add("coding");
        parole.add("programming");
        parole.add("AsRoma");

        // voglio salvare in una lista tutte le lunghezze delle parole
        List<Integer> lunghezze = parole.stream().map(s -> s.length()).collect(Collectors.toList());
        System.out.println(lunghezze);

        // voglio salvare tutte le parole maiuscole con lunghezza > 5
        List<String> paroleCaps = parole.stream().filter(s -> s.length() > 5).map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(paroleCaps);

    }

}
