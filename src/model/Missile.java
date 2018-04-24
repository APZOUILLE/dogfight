package model;

public class Missile {
	private static final int SPEED = 4;
	private static final int WIDTH = 30;
	private static final int HEIGHT = 10;
	private static final int MAX_DISTANCE_TRAVELED = 1400;
	private static final String IMAGE = "missile";
	private int distanceTraveled = 0;
	
	public Missile(Drection direction, Dimension dimension){}
	public static int getWidthWithADirection(Direction direction){}
	public static int getHeightADirection(Direction direction){}
	public void move(){}
	public boolean isWeapon(){}
	
}
