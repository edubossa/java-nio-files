package br.com.ews.nio.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static br.com.ews.nio.file.Examples.*;

public class ExamplePathRelative implements Examples {
	
	
	public static void main(String[] args) throws IOException {
		
		/*
		 Unico ponto:representa o diretorio atual
		 Dois pontos: representa o diretorio pai	
		 */
		log("Obtendo diretorio atual");
		Path path = Paths.get(".");
		log(path.toAbsolutePath().toString());
		log("isAbsolute: "+ path.isAbsolute());
		
		printLines();
		log("lista os diretorios atuais");
		Files.list(Paths.get(".")).forEach(System.out::println);
		
		printLines();
		log("lista um nivel acima do diretorio atual todas as pastas contidos no diretorio target");
		Files.list(Paths.get("./target")).forEach(System.out::println);
		
		printLines();
		log("lista um nivel abaixo do diretorio atual, todas as pastas");
		Files.list(Paths.get("..")).forEach(System.out::println);
		
		printLines();
		log("lista um nivel abaixo do diretorio atual, todas as pastas contidas no diretorio vaccine ");
		Files.list(Paths.get("../vaccine")).forEach(System.out::println);
		
		printLines();
		/*
		  Caminho que começa com delimitador: caminhos declaradas desta forma sao sempre relativo ao diretorio raiz do sistema de arquivos
		  Caminho que começa sem delimitador: caminhos declaradas desta forma sao sempre relativo ao diretório atual
		 */
		Path pathRelativeToCurrentDirectoryFed = Paths.get("src/main/java");
		Path pathRelativeToRootFSLocationFed = Paths.get("/src/main/java");
		System.out.println("Relative to current directory: " + pathRelativeToCurrentDirectoryFed.toAbsolutePath());
		System.out.println("Path relative to root file system location: " + pathRelativeToRootFSLocationFed.toAbsolutePath());

		
	}
	
}