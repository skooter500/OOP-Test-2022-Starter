package ie.tudublin;

import java.util.ArrayList;
import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{
	ArrayList<Nematode> nematodes = new ArrayList<Nematode>();

	public void printNematodes()
	{
		for(Nematode a:nematodes)
		{
			System.out.println(a);
		}
	}

	public void loadNematodes()
	{
		Table NemaTable = loadTable("nematodes.csv", "header");

		for (TableRow n:NemaTable.rows())
		{
			Nematode a = new Nematode(n);
			nematodes.add(a);
		}
	}

	public void keyPressed()
	{		
		if (keyCode == LEFT)
		{
		}		
	}


	public void settings()
	{
		size(800, 800);
	}

	public void setup() 
	{
		colorMode(HSB);
		background(0);
		loadNematodes();
		printNematodes();			
	}
	
	public void drawNematodes()
	{
		for(Nematode a:nematodes)
		{
			a.render(this);
		}
	}

	public void draw()
	{	
		background(0);
		fill(150);
		drawNematodes();
	}
}
