import java.io.Serializable;

public class Local implements Serializable {
private String name;
private int id;

int[] directions = new int[4];

public Local(int id, String name) {
	this.id = id;
	this.name = name;
}

public void nextLocal(int dir, int to) {
	
}

NPC[] npc = new NPC[3];
Item[] items = new Item[3];


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String toString() {
	return this.name + System.lineSeparator() + "You can see someone: " + npc;
}


}
