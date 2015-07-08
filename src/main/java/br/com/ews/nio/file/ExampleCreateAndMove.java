package br.com.ews.nio.file;

import static br.com.ews.nio.file.Examples.log;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class ExampleCreateAndMove implements Examples {
	
	
	public static void main(String[] args) throws Exception {
		
		Path tmp = Files.createTempDirectory("EWS");
		log("Dirtorio temporarios criado: " + tmp.toFile().getAbsolutePath());
		log("Movendo os arquivos..");
		Files.move(Paths.get(DIR), tmp, StandardCopyOption.REPLACE_EXISTING);
	
	}
	
}