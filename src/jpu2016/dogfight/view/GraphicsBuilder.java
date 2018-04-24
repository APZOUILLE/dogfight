package jpu2016.dogfight.view;
import jpu2016.dogfight.controller.*;
import jpu2016.dogfight.model.*;

public class GraphicsBuilder
{
	private int globalWidth;
	
	public GraphicsBuilder(IDogfightModel dogfightModel) {
		super();
		this.dogfightModel = dogfightModel;
	}
	
	public void applyMode (Graphics graphics, ImageObserver observer)
	{
		
	}
	
	private void buildEmptySky()
	{
		
	}
	
	private void drawMobile(Imobile mobile, Graphics graphics, ImageObserver observer)
	{
		
	}

	public int getGlobalWidth()
	{
		return globalWidth;
	}

	public void setGlobalWidth(int globalWidth)
	{
		this.globalWidth = globalWidth;
	}
	
	
}
