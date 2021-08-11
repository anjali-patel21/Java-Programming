// writing data in file and reading it

package com.company;

import java.io.*;

public class file {
    public static void main(String[] args) throws Exception
    {
        File f = new File("demo.txt");
        FileOutputStream fos = new FileOutputStream(f);
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF("This is first line in demo.txt file");

        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);

        String text = dis.readUTF();
        System.out.println(text);

    }
}
