package test;

import java.security.KeyPair;

import security.RSA_2048;

public class RSA_2048Test {

	public static void main(String[] args) {
		KeyPair key = RSA_2048.createKey();
		
		String plainText = "hello world";
		String encryptedText = RSA_2048.encrypt(plainText, RSA_2048.keyToString(key.getPublic()));
		
		System.out.println("encrypted >> " + encryptedText);
		System.out.println(key.getPublic());
		System.out.println("encryption key >> " + RSA_2048.keyToString(key.getPublic()));
		
		String decryptedText = RSA_2048.decrypt(encryptedText,RSA_2048.keyToString(key.getPrivate()));
		System.out.println();
		
		System.out.println("decrypted >> " + decryptedText);
		System.out.println(key.getPrivate());
		System.out.println("decryption key >> " + RSA_2048.keyToString(key.getPrivate()));
	}

}
