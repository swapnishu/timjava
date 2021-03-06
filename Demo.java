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

		
		System.out.println("From git repo");
		
		Enemy enemy = new Enemy(10,3);
		System.out.println("Hitpoints: " + enemy.getHitPoints()+ " Lives: "+enemy.getLives());
		enemy.takeDamage(3);
		System.out.println("Hitpoints: " + enemy.getHitPoints()+ " Lives: "+enemy.getLives());

		Soldier soldier = new Soldier(25,1);
		System.out.println("Hitpoints: " + soldier.getHitPoints()+ " Lives: "+soldier.getLives());
		soldier.takeDamage(4);
		System.out.println("Hitpoints: " + soldier.getHitPoints()+ " Lives: "+soldier.getLives());
		
		SuperSoldier superSoldier = new SuperSoldier(50, 1);
		System.out.println("Hitpoints: " + superSoldier.getHitPoints()+ " Lives: "+superSoldier.getLives());
		superSoldier.takeDamage(4);
		System.out.println("Hitpoints: " + superSoldier.getHitPoints()+ " Lives: "+superSoldier.getLives());
		soldier.takeDamage(4);
		System.out.println("Hitpoints: " + soldier.getHitPoints()+ " Lives: "+soldier.getLives());
		
		float theDamage = 9.0f;
		superSoldier.takeDamage(theDamage);
		
		int [] element = {5,8,7,111,11,-1,2,4,6};
		
		int sumTotal = 0;
		//while(indexPos<element.length) {
		for(int indexPos = 0;indexPos < element.length;indexPos++) {
			System.out.println("Processing: "+indexPos);
			if(element[indexPos] < 0){
				System.out.println("Break");
				break;
			}
			if(element[indexPos] > 99) {
				System.out.println("Continue");
				//indexPos += 1;
				continue;
			}
			sumTotal = sumTotal + element[indexPos];
			//indexPos += 1;
		}
		System.out.println("SumTotal was = "+sumTotal);
		
		//foreach example
		sumTotal = 0;
		for(int elementContent: element) {
			System.out.println("Processing: "+ elementContent);
			if(elementContent < 0){
				System.out.println("Break");
				break;
			}
			if(elementContent > 99) {
				System.out.println("Continue");
				//indexPos += 1;
				continue;
			}
			sumTotal = sumTotal + elementContent;
			//indexPos += 1;
		}
		System.out.println("SumTotal was = "+sumTotal);
	}

}
