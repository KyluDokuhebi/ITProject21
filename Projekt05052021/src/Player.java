
public class Player extends Person {
private String description="This is your player character, play as if it is yourself.";
private Equipment equip;



public Player(String name) {
	super(name);
	equip=new Equipment();
	
}

public String getDescription() {
	return description;
}



public void setDescription(String description) {
	this.description = description;
}



public Equipment getEquip() {
	return equip;
}



public void setEquip(Equipment equip) {
	this.equip = equip;
}

public String toString() {
	return name + System.lineSeparator() + description+ System.lineSeparator() + System.lineSeparator() + "You are equipped with: "+System.lineSeparator()+equip+System.lineSeparator()+System.lineSeparator()+"Inventory: "+inv;
}


}
