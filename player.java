package org.example.learn;

import java.util.ArrayList;

public class player {
	private String handleName;
	private int lives;
	private int level;
	private int score;
	private Weapon weapon;
	private ArrayList<InventoryItem> inventoryItems;
	public player() {
		setHandleName("Unknown Player");	
		setLives(3);
		setLevel(1);
		setScore(0);
		setDefaultWeapon();
		setInventoryItems(new ArrayList<InventoryItem>());
	}
	public player(String string) {
		// TODO Auto-generated constructor stub
		this();
		setHandleName(string);
		
	}
	public player(String string, int level) {
		this();
		setNameAndLevel(string, level);
	}
	private void setDefaultWeapon() {
		// TODO Auto-generated method stub
		this.setWeapon(new Weapon("Sword",34,50));
	}
	public String getHandleName() {
		return handleName;
	}
	public void setHandleName(String handleName) {
		if(handleName.length() < 4)
			return;
		this.handleName = handleName;
	}
	public void setNameAndLevel(String name, int level) {
		setLevel(level);
		setHandleName(name);
	}
	public int getLives() {
		return lives;
	}
	public void setLives(int lives) {
		this.lives = lives;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Weapon getWeapon() {
		return weapon;
	}
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	public ArrayList<InventoryItem> getInventoryItems() {
		return inventoryItems;
	}
	public void setInventoryItems(ArrayList<InventoryItem> inventoryItems) {
		this.inventoryItems = inventoryItems;
	}
	public void addInventoryItem(InventoryItem inventoryItem) {
		inventoryItems.add(inventoryItem);
	}
	public boolean dropInventoryItem(InventoryItem inventoryItem) {
		if(this.inventoryItems.contains(inventoryItem)) {
			inventoryItems.remove(inventoryItem);
			return true;
		}
		return false;
	}
} 
