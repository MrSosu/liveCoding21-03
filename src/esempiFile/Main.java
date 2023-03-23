package esempiFile;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Map<Character, Set<String>> inizialiParole = new HashMap<>();
        File file = new File("roba.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        while (bufferedReader.ready()) {
            String line = bufferedReader.readLine();
            String[] parole = line.split(" ");
            for (String parola : parole) {
                Character start = parola.charAt(0);
                if (!inizialiParole.containsKey(start)) { // se la mappa ancora non contiene la chiave
                    Set<String> paroleIniziale = new HashSet<>();
                    paroleIniziale.add(parola);
                    inizialiParole.put(start, paroleIniziale);
                }
                else {
                    Set<String> paroleIniziale = inizialiParole.get(start);
                    paroleIniziale.add(parola);
                    inizialiParole.put(start, paroleIniziale);
                }
            }
        }
        System.out.println(inizialiParole );


    }

}
