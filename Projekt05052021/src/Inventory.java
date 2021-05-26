
public class Inventory {
Consumable[] consumables = new Consumable[10];

public Inventory() {
	
}

pubic void pickUp(Consumable c) {
	for(int i;i<consumables.lenght,i++) {
		if(consumables[i]==null) {
			consumables[i]=c;
			break;
		}
	}
}


public String toString() {
	return "Inventory: "+ consumables;
}




}
