package App;

import java.io.File;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// instancia o metodo scanner
		Scanner sc = new Scanner(System.in);
		
		// pede para o usuario digitar um caminho
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		// define na variavel 'path' o conteudo armazenado na variavel strPath instanciando o arquivo.
		File path = new File(strPath);
		// cria uma lista para imprimir todas as pastas no caminho especificado
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDERS:");
		
		// percorre a lista folders e imprime todas as pastas
		for (File folder : folders) {
		System.out.println(folder);
		}
		
		// cria uma lista para imprimir todos os arquivos no caminho especificado
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		// percorre a lista file e imprime todos os arquivos nela
		for (File file : files) {
		System.out.println(file);
		}
		// variavel boolean que cria uma pasta no destinatorio strPath com o nome de "subdir" e retorna true se realmente tiver sido criado, ou false.
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created successfully: " + success);
		sc.close();
		
	}

}
