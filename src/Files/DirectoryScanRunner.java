package Files;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryScanRunner {

	public static void main(String[] args) throws IOException {

		// here we display the all files in the project

		// so that we use "."

		Path CurrentDirectory = Paths.get(".");

		// Files.list(Paths.get(".")).forEach(System.out::println);

		// here we can get all files in a specifed number

		// here we can also search through the file
		// here we use filter for filtering the files(.java)

		/*
		 * Predicate<? super Path>
		 * predicate=path->String.valueOf(path).contains(".java");
		 * Files.walk(CurrentDirectory,
		 * 5).filter(predicate).forEach(System.out::println);
		 */

		// another method to search the files

		/*
		 * BiPredicate<Path, BasicFileAttributes>
		 * matcher=(path,attributes)->String.valueOf(path).contains(".java");
		 * Files.find(CurrentDirectory,4,matcher).forEach(System.out::println);
		 */

		// to get all the files in the directory we use isDirectory

		BiPredicate<Path, BasicFileAttributes> directoryMatcher = (path, attributes) -> attributes.isDirectory();
		Files.find(CurrentDirectory, 4, directoryMatcher).forEach(System.out::println);

	}

}
