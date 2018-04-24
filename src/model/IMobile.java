package model;

public interface IMobile {
	public Direction getDirection();
	public void setDirection(Direction direction);
	public Point getPosition();
	public Dimension getDimension();
	public int getWidth();
	public int getHeight();
	public int getSpeed();
	public Image getImage();
	public void move();
	public void placeInArea(Iarea area);
	public boolean isPlayer(int player);
	public DoghtfightModel setDoghtfightModel(DoghtfightModel : doghtfightModel);
	public boolen hit();
	public boolean isWeapon();
	
}
