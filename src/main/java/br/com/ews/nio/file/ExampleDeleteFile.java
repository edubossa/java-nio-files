package br.com.ews.nio.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static br.com.ews.nio.file.Examples.*;

public class ExampleDeleteFile implements Examples {
	
	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get(DIR.concat("1722a126-252d-4a42-93bc-a463d02970b0.txt"));
		boolean deleteIfExists = Files.deleteIfExists(path);
		log("Is file delete: " + deleteIfExists);
	
	}
	
}