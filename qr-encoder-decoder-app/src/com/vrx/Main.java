package com.vrx;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class Main {

	public static void main(String[] args) {
		System.out.println("Encoding the message to QR Image");
		QREncoder encoder = new QREncoder();
		System.out.println("Encoding Successful");
		System.out.println();
		System.out.println("Decoding qr image to fetch message");
		QRReader reader = new QRReader();
		System.out.println("Message fetched successfully");

	}

}
