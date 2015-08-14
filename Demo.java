package org.example.learn;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testMessage = "This is an another test message";
		String mySecondMessage = " demo";
		System.out.println("This is a test message");
		System.out.println(testMessage+mySecondMessage);
		
		int firstNumber = 55;
		int secondNumber = 5;
		int result = (firstNumber + secondNumber) * 5;
		System.out.println(result);
		
		double myValue = 1234.56789;
		double mySecondValue = 3.145689874652354376;
		System.out.println(myValue + mySecondValue);
		
		player tim = new player();
		System.out.println(tim.getHandleName());
		System.out.println(tim.getLives());
		System.out.println(tim.getLevel());
		System.out.println(tim.getScore());
		
		tim.setHandleName("Swa");
		System.out.println(tim.getHandleName());
		
		player tim2 = new player();
		tim2.setNameAndLevel("SWa", 5);
		System.out.println(tim2.getHandleName());
		System.out.println(tim2.getLevel());
		
		player tim3 = new player("Swass");
		System.out.println(tim3.getHandleName());
		
		System.out.println(tim.getWeapon().getName());
		
		Weapon myAxe = new Weapon("Axe",10,35);
		tim.setWeapon(myAxe);
		System.out.println(tim.getWeapon().getName());
		
		InventoryItem redPotion = new InventoryItem(ItemType.POTION, "Red Potion");
		tim.addInventoryItem(redPotion);
		tim.addInventoryItem(new InventoryItem(ItemType.ARMOR,"+3 Chest Armor"));
		tim.addInventoryItem(new InventoryItem(ItemType.RING, "Ring of protection +2"));
		tim.addInventoryItem(new InventoryItem(ItemType.POTION, "Invisibility Potion"));
		
		InventoryItem bluePotion = new InventoryItem(ItemType.POTION,"Blue Potion");
		tim.addInventoryItem(bluePotion);
		boolean wasDeleted = tim.dropInventoryItem(redPotion);
		System.out.println(wasDeleted);
		
		ArrayList<InventoryItem> allItems = tim.getInventoryItems();
		for(InventoryItem item : allItems) {
			System.out.println(item.getName());
		}
<<<<<<< HEAD
=======
		
		System.out.printl("From git repo");
>>>>>>> timjava/working
	}

}
