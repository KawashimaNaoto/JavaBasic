package practice13.common;

public class SuperHero extends Hero{
	
	private Item equipment;

	public SuperHero () {
		super();
		
	Item equipment;	
	
	}
	
	public int attack() {
		return super.attack()+equipment.getAdditionalDamage();
		
	}
	public Item getEquipment() {
		return this.equipment;
	}
	public void setEquipment(Item equipment) {
		this.equipment = equipment;
	}
}
