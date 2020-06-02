package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String path="/home/yarik/Загрузки/Copy.zip (Unzipped Files)/Copy/Laba6/";
        FileReader fileReader = new FileReader(path+"original.text");
        FileWriter fileWriter = new FileWriter(path+"encrypted.text");
        FileReader fileReader1 = new FileReader(path+"encrypted.text");
        FileWriter fileWriter1 = new FileWriter(path+"decrypted_text.text");
        ThreadCipher.encryptDate(fileReader,fileWriter);
        ThreadCipher.decreptedDate(fileReader1, fileWriter1);
    }
}
