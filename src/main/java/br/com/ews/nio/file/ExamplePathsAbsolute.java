package br.com.ews.nio.file;

import java.nio.file.Path;
import java.nio.file.Paths;
import static br.com.ews.nio.file.Examples.*;

public class ExamplePathsAbsolute implements Examples {
	
	public static void main(String[] args) {
		
		Path path1 = Paths.get("/home/wallace/copy/conf/");
		path1.forEach(System.out::println); 
		
		printLines();
		log("-----------------[OR]----------------");
		
		Paths.get("/home/wallace/", "copy", "conf").forEach(System.out::println); 
		
		printLines();
		log("-----------------[OR]----------------");
		
		//TODO OBS: a prinmeira barra e necessario para indicar a raiz do sistema o que no windows seria C:
		Paths.get("/", "home", "wallace", "copy", "conf").forEach(System.out::println); 
		
	}
	
}