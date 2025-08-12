package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}

}


@RestController
class ServerController{
	@RequestMapping("/hash")
	public String hash() {
		String data = "Tanner Hunt's Hello World Check Sum!";
		String cypher = "SHA3-256";
		
		try {
			//generate the hash
			MessageDigest crypter = MessageDigest.getInstance(cypher);
			crypter.update(data.getBytes());
			byte[] digest = crypter.digest();
			
			//generate the checksum value
			String hashValue = "";
			for(int i = 0; i < digest.length; i++) {
				hashValue = hashValue + (Integer.toHexString(0xFF & digest[i]));
			}
			
			//format the string to be returned
			return "<p>Original Message: " 
			+ data 
			+ "</p> <p>encryption algorithm: " 
			+ cypher
			+ ": "
			+ hashValue
			+ "</p>";
		}
		// an incorrect cypher was chosen
		catch(NoSuchAlgorithmException e) {
			e.printStackTrace();
			return "<p>Oops, something seems to have gone wrong on our end.</p>";
		}
	}
}