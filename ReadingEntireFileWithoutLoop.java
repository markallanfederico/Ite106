import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingEntireFileWithoutLoop
{
	public static void main(String [] args) throws FileNotFoundException{
		File file = new File("txt.file");
		Scanner sc = new Scanner(File);
		
		sc.userDelimiter("\\z");
		
		System.out.println(sc.next());
	}
}