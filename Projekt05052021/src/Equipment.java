import java.util.HashMap;

public class Equipment {
private HashMap<ItemType, Equipable> equipment = new HashMap<>();

public Equipment() {
	equipment.put(ItemType.Weapon, null);
	equipment.put(ItemType.Shield, null);
	equipment.put(ItemType.Armor, null);
	equipment.put(ItemType.Boots, null);
	equipment.put(ItemType.Gauntlets, null);
}



public String toString() {
	return "Weapon: " + equipment.containsKey(ItemType.Weapon) + System.lineSeparator() + "Shield: " + equipment.containsKey(ItemType.Shield)+ System.lineSeparator()+"Armor: "+equipment.containsKey(ItemType.Armor)+System.lineSeparator()+"Boots: "+equipment.containsKey(ItemType.Boots)+System.lineSeparator()+"Gauntlets: "+equipment.containsKey(ItemType.Gauntlets);
}

}
