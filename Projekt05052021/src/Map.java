import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileReader;

public class Map extends HashMap<Integer, Local> implements Serializable{
private int start = 6;
private int nowAt = start;

public String nowAt() {
	return Local.toString();
}

public static Map load(String file) throws IOException{
	return null;
}


public boolean goTo(int dir) {
	return true;
}


}
