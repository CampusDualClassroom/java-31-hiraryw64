package com.campusdual.classroom;

import java.io.*;

public class Exercise31 {

    public static void main(String[] args) {
        try {
            File file = new File("src/main/resources/lorem.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.err.println("No se pudo leer el archivo.\n" + e.getMessage());
        }
    }
}
