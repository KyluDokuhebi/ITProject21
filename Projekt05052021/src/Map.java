import java.io.IOException
import java.io.Serializable;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileReader;

public class Map extends HashMap<Integer, Local> implements Serializable{
	
private final String FILE_PATH = M:\IT\ITProject21\ITProject21\ITProject21\Projekt05052021\src\TheMap;	

BufferedReader reader = new BufferedReader(FileReader(FILE_PATH));


	
private int start = 6;
private int nowAt = start;

public String nowAt() {
	return Local.toString();
}




public boolean goTo(int dir) {
	return true;
}


}
