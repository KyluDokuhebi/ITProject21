
public class NPC extends Person {
private String description;

public NPC(String name, String desc) {
	super(name);
	description = desc;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String toString() {
	return name + System.lineSeparator() + description + System.lineSeparator();
}

}
