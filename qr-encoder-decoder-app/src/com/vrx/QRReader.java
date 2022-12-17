package com.vrx;

import java.io.File;
import javax.imageio.ImageIO;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class QRReader {
	public QRReader() {
		try {
			File file = new File("Z:\\GITHUB\\Learn code with durgesh\\qr-encoder-decoder-app\\qrfile.png");
			Result result = new MultiFormatReader().decode(
					new BinaryBitmap(new HybridBinarizer(new BufferedImageLuminanceSource(ImageIO.read(file)))));
			System.out.println("--------------------------------");
			System.out.println("MESSAGE:" + result.getText());
			System.out.println("--------------------------------");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
