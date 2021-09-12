package com.greatlearning.example;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class EncryptAndDecryptStringDemo {

	private static final String UNICODE_FORMAT = "UTF-8";

	public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, UnsupportedEncodingException, IllegalBlockSizeException, BadPaddingException {
		String text = "Welcome To Great Learning";
			//AES Stands for Advanced Encryption standards
			SecretKey myKey = generateKey("AES");
			Cipher cipher  = Cipher.getInstance("AES");
			byte[] encryptedString = encryptString(text, myKey, cipher);
			System.out.println("Encrypted text: "+ encryptedString);
			String decryptedString = decryptString(encryptedString, myKey, cipher);
			System.out.println("Decrypted Text: "+ decryptedString);
	
	}

	public static SecretKey generateKey(String encrypionType) throws NoSuchAlgorithmException {
		KeyGenerator keyGenerator = KeyGenerator.getInstance(encrypionType);
		SecretKey myKey = keyGenerator.generateKey();
		return myKey;
	}

	public static byte[] encryptString(String dataToEncrypt, SecretKey myKey, Cipher cipher) throws UnsupportedEncodingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
		// We are using UTF-8 becz otherwise getBytes() method will use default format of your computer
		byte[] bytes = dataToEncrypt.getBytes(UNICODE_FORMAT);
		cipher.init(Cipher.ENCRYPT_MODE, myKey);
		byte[] encryptedText = cipher.doFinal(bytes);
		return encryptedText;
	}

	public static String decryptString(byte[] dataToDecrypt, SecretKey myKey, Cipher cipher) throws InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
		cipher.init(Cipher.DECRYPT_MODE, myKey); 
		byte[] decryptedData = cipher.doFinal(dataToDecrypt);
		String originalText =  new String(decryptedData);
		return originalText;
	}

}
