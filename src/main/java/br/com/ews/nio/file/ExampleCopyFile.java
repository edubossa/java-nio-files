package br.com.ews.nio.file;

import static br.com.ews.nio.file.Examples.getRandomNameFile;
import static br.com.ews.nio.file.Examples.log;
import static br.com.ews.nio.file.Examples.printLines;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleCopyFile implements Examples {
	
	public static void main(String[] args) throws Exception {
		
		OutputStream os = Files.newOutputStream(Paths.get("/home/wallace/copy/".concat(getRandomNameFile())), StandardOpenOption.CREATE);
		
		long size = Files.copy(Paths.get("/home/wallace/files/03649.txt"), os);
		log("Copiando arquivo, tamanho: " + size + " bytes");
		
		printLines();
		log("copiar todos os arquivos do diretorio");
		printLines();
		
		List<Path> files = Files.list(Paths.get(DIR)).collect(Collectors.toList());
		for (Path path : files) {
			log(path.toFile().getAbsolutePath());
			Files.copy(Paths.get(path.toFile().getAbsolutePath()), new FileOutputStream("/home/wallace/copy/"+path.getFileName()));
		}
		
	
	}
	
}
