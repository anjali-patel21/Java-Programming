package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class propertyFile {
    public static void main(String[] args) throws Exception {
        Properties pt = new Properties();

        OutputStream os = new FileOutputStream("data.properties");
        InputStream is = new FileInputStream("data.properties");
        pt.load(is);

        pt.setProperty("uname", "abcde");
        pt.setProperty("url", "www.abcde.com");
        pt.setProperty("password", "1234567");

        pt.store(os,null);

        System.out.println(pt.getProperty("uname"));
        System.out.println(pt.getProperty("password"));
        
         pt.list(System.out);     // to list out all the properties

    }
}
