package Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadRunner {

	public static void main(String[] args) throws IOException {

		Path pathFileToRead = Paths.get("./resources/data.txt");
		//here we read all the data with one line
		/*
		 * List<String>lines=Files.readAllLines(pathFileToRead);
		 * 
		 * System.out.println(lines);
		 */
		//here we read all the data with line by line 
		Files.lines(pathFileToRead).forEach(System.out::println);
		
		System.out.println("::");
		Files.lines(pathFileToRead).map(String::toLowerCase).filter(str -> str.contains("a"))
				.forEach(System.out::println);

	}

}
