package com.company;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class qrcode {
    public static void main(String[] args) throws Exception
    {
        String details = "Name: Anjali Patel, ID: 18DCS064";
        ByteArrayOutputStream out = QRCode.from(details).to(ImageType.PNG).stream();

        File f = new File("MyQrCode.png");
        FileOutputStream fos =  new FileOutputStream(f);

        fos.write(out.toByteArray());
        fos.flush();

    }
}
