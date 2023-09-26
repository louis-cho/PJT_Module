package test;

import security.SHA_512;

public class SHA_512Test {

	public static void main(String[] args) {
		String plainText = "hello world";
		System.out.println("origin text >> " + plainText);
		for(int i=0; i<10; i++) {
			String salt = SHA_512.getSalt();
			String result = SHA_512.SHA512(plainText, salt);
			
			System.out.println("hash result >> " + result);
		}
	}
}
