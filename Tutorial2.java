package org.example.learn;

public class Tutorial2 {
	public static void main(String[] args) {
	int lives = 3;
	boolean isGameOver = (lives < 1);
	System.out.println(isGameOver);
	if(isGameOver)
		System.out.println("Game is over");
	else
		System.out.println("Game continues");
}
}