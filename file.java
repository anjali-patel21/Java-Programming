// writing data in file and reading it

package com.company;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class file {
    public static void main(String[] args) throws Exception
    {
        FileOutputStream fos = new FileOutputStream("demo.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF("This is first line in demo.txt file");

        FileInputStream fis = new FileInputStream("demo.txt");
        DataInputStream dis = new DataInputStream(fis);

        String text = dis.readUTF();
        System.out.println(text);

    }
}
