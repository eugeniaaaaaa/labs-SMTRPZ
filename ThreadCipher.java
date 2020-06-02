package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class ThreadCipher {

    static void encryptDate(FileReader fileReader, FileWriter fileWriter) throws IOException {
        int letter;
        while ((letter = fileReader.read()) != -1) {
            fileWriter.write(letter * 2);
        }
        fileReader.close();
        fileWriter.close();
    }

    static void decreptedDate(FileReader fileReader, FileWriter fileWriter) throws IOException {
        int letter;
        while ((letter = fileReader.read()) != -1) {
            fileWriter.write(letter / 2);
        }
        fileReader.close();
        fileWriter.close();
    }

}
