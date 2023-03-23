package esempiFile;

import java.io.*;
import java.util.Arrays;

public class MainDue {

    public static void main(String[] args) throws IOException {

        readMyFile("resources/roba.txt");
        writeMyFile("resources/ciccio.txt", "Pippo va in città");

    }

    public static void readMyFile(String pathname) throws IOException {
        File file = new File(pathname);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        // BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        while (bufferedReader.ready()) {
            String line = bufferedReader.readLine();
            String[] parole_linea = line.split(" ");
            Arrays.stream(parole_linea).forEach(System.out::println);
        }
        bufferedReader.close();
    }

    public static void writeMyFile(String pathname, String txt) throws IOException {
        File file = new File(pathname);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        bufferedWriter.write(txt);
        bufferedWriter.close();


    }

}
