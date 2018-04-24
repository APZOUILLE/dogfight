package model;
import java.awt.color.*;

public class Mobile {
	private int speed;
	private Direction direction;
	private Images images;
	private Dimension dimension;
	private Position position;
	private IDogfightModel iDogfightModel;
	
	public Mobile(Direction direction, Position position, Dimension dimension, int speed, String image){
		
	}
	public void move(){}
	public void placeInArea(IArea area){}
	public boolean isPlayer(int player){}
	private void moveUp(){}
	private void moveRight(){}
	private void moveLeft(){}
	private void moveDown(){}
	public boolean hit(){}
	public boolean isWeapon(){}
	
	
	
	//------------GETTERS-------------
	public int getSpeed() {
		return speed;
	}
	public Direction getDirection() {
		return direction;
	}
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	public Images getImages() {
		return images;
	}
	public Dimension getDimension() {
		return dimension;
	}
	public Position getPosition() {
		return position;
	}
	public IDogfightModel getIDogfightModel(){
		return iDogfightModel;
	}
	public void setIDogfightModel(){
		this.iDogfightModel = iDogfightModel;
	}
Test;

}
