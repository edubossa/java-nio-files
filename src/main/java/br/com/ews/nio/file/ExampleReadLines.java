package br.com.ews.nio.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static br.com.ews.nio.file.Examples.*;

public class ExampleReadLines implements Examples {
	
	public static void main(String[] args) throws IOException {
		
		List<String> lines = Files.readAllLines(Paths.get(DIR.concat("03650.txt")));
		log("Qtde linhas: " + lines.size());
		
		printLines();
		
		lines.forEach(System.out::println); 
		
	}
	
}