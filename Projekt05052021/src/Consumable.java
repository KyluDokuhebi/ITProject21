
public class Consumable extends Item {
private int quantity;


public Consumable(String name, String desc, int quant) {
	super(name, desc);
	this.quantity=quant;
}


public String toString() {
	return name +"("+quantity+")"+ " - "+description; 
}

}
