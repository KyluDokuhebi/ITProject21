
public class Equipable extends Item {
private ItemType itemType;

public Equipable(String name, String desc, ItemType type) {
	super(name, desc);
	this.itemType = type;
}

public ItemType getItemType() {
	return itemType;
}

public void setItemType(ItemType itemType) {
	this.itemType = itemType;
}

@Override
public String toString() {
	return itemType+": "+name + " - " + description;
}


}
