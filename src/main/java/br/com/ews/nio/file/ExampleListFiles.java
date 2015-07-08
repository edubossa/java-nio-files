package br.com.ews.nio.file;

import static br.com.ews.nio.file.Examples.printLines;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleListFiles implements Examples {
	
		
	public static void main(String[] args) throws IOException {
		
		List<Path> files = Files.list(Paths.get(DIR)).collect(Collectors.toList());
		files.forEach(f -> System.out.println(f.toFile().getAbsolutePath())); 
				
		printLines();
		
		//-- OR
		
		Files.list(Paths.get(DIR)).forEach(System.out::println); 
		
		
	}

}