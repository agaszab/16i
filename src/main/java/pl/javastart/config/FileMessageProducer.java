package pl.javastart.config;

import java.io.*;

public class FileMessageProducer implements Producer {

    public String getMessage ()  {

    try {
        File file = new File("/home/at/Pulpit/test.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader br = new BufferedReader(fileReader);

        String line = null;

        StringBuilder stringBuilder = new StringBuilder();

        while ((line = br.readLine()) != null) {  //wczytaj linie daj do zmiennej line i zobaczy czy nie jest nullem dokłada kawałki
            stringBuilder.append(line);
        }
        return stringBuilder.toString();  // przekształca to co ma w sobie na string
    }
catch
        (IOException e) {
        return "Błąd odczytu z pliku: "+ e.getMessage();
    }

    }

}
