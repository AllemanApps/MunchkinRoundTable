package com.allemanapps.munchkinrt;

public class User {
	//holds the user's level
	private int level;
	public User() {
		level = 1;
	}
	/**
	 * This levels up the user
	 */
	public void lvlup() {
		level ++;
	}
	/**
	 * This levels the user down
	 */
	public void lvldown() {
		level --;
	}
	public int getLevel() {
		return level;
	}
}
