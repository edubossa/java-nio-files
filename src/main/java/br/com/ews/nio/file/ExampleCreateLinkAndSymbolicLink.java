package br.com.ews.nio.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static br.com.ews.nio.file.Examples.*;

/* http://jakubstas.com/links-nio-2/#.VZbtYXUVhBc */
public class ExampleCreateLinkAndSymbolicLink implements Examples {
	
	public static void main(String[] args) throws IOException {
		
		Path link = Files.createLink(Paths.get("/tmp/".concat(getRandomNameFile())), Paths.get(DIR.concat("03650.txt"))); 
		boolean exists = Files.exists(link);
		log("Link criado: " + exists);
		log(link.toFile().getAbsolutePath());
		
		printLines();
		
		log("Criando SymbolicLink - diretorio");
		Path symbolicLinkDir = Files.createSymbolicLink(Paths.get("/home/wallace/copy/conf/"), Paths.get(DIR));
		log(symbolicLinkDir.toFile().getAbsolutePath()); 
		
		printLines();
		
		log("Criando SymbolicLink - arquivo");
		Path symbolicLinkFile = Files.createSymbolicLink(Paths.get("/home/wallace/copy/".concat(getRandomNameFile())), Paths.get(DIR.concat("03650.txt")));
		log(symbolicLinkFile.toFile().getAbsolutePath());
		
		printLines();
		
		log("Lendo Link SymbolicLink");
		
		Path linkSimbolic = Paths.get("/home/wallace/copy/conf/");
		
		//OBS: evita exception
		if(Files.isSymbolicLink(linkSimbolic)) {			
			Path readSymbolicLink = Files.readSymbolicLink(linkSimbolic);
			System.out.println(readSymbolicLink.toFile().getAbsolutePath()); 
		}
		
	}

}