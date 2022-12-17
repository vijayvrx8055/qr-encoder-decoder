package com.vrx;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class QREncoder {

	public QREncoder() {
		try {
			File file = new File("qrfile.png");
			String content = "This is Content inside QR CODE";
			ByteArrayOutputStream arrayOutputStream = QRCode.from(content).to(ImageType.PNG).stream();
			FileOutputStream fos = new FileOutputStream(file);
			fos.write(arrayOutputStream.toByteArray());
			fos.close();
			System.out.println("Success!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
