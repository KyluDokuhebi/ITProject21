
public class Inventory {
Consumable[] consumables = new Consumable[10];

public Inventory() {
	
}

pubic String pickUp(Consumable c) {
	for(int i;i<consumables.lenght,i++) {
		if(consumables[i]==null) {
			consumables[i]=c;
			return "You have picked up " + c;
			break;
		}else {
			return "You can't pick up "+ c + ", you have full inventory. Drop something to make some space."
		}
	}
}

public String drop() {
	
}


public String toString() {
	return "Inventory: "+ consumables;
}




}
