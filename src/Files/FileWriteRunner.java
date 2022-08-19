package Files;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteRunner {

	public static void main(String[] args) throws IOException {
		
		Path pathFileToWrite=Paths.get("./resources/fileWrite.txt");
		
		List<String>list=List.of("Apple,Orange,Elephant,Cat,Boy,Dog");
		
		
		//here we write the file in a folder
		Files.write(pathFileToWrite,list);
		
		
		
	

	}

}
