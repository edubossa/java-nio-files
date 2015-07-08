package br.com.ews.nio.file;

import java.util.UUID;

/**
 * Java NIO Files
 * <p>
 * http://jakubstas.com/java-nio-2/#.VZeHYXUVhBc
 * <p>
 * http://tutorials.jenkov.com/java-nio/files.html
 * <p>
 * http://docs.oracle.com/javase/7/docs/api/java/nio/file/package-summary.html
 * 
 * @author Eduardo Wallace
 *
 */
public interface Examples {
	
	String DIR = "/home/wallace/files/";
	
	static void printLines() {
		System.out.println();
		System.out.println("-------------------------------------------------");
		System.out.println();
	}
	
	static String getRandomNameFile() {
		return UUID.randomUUID().toString().concat(".txt");
	}
	
	static void log(String s) {
		System.out.println(s);
	}
}