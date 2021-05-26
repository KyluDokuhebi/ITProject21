
public class Person {
protected String name;
protected Inventory inv = new Inventory();
protected int hp;


public Person(String name, int hp) {
	this.name=name;
	this.hp = hp;
}
public Person() {
	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String toString() {
	return name + System.lineSeparator();
}




}
