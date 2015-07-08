package br.com.ews.nio.file;

import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ExampleWriteFile implements Examples {
	
	public static void main(String[] args) throws Exception {
		
		URL url = new URL("http://192.168.20.10/sped/SEF2.zip"); 
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				
		byte[] buffer = new byte[2048];
		while (conn.getInputStream().read(buffer) != -1) {
			Files.write(Paths.get(DIR.concat("ews.zip")), buffer, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
		}
		
	}
	
}