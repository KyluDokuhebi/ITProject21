
public class Item {
protected String name;
protected String description;

public Item() {
	
}

public Item(String name, String desc) {
	this.name = name;
	this.description = desc;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String toString() {
	return name + System.lineSeparator() + description;
}

}
