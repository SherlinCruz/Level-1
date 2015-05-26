import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
	public static void main(String[] args) {
		World world = new World();
		world.show();
		double random = Math.random();
		Location loc = new Location((int) (Math.random() * 10 - 1),
				(int) (Math.random() * 10 - 1));

		Location loca2 = new Location((int) (Math.random() * 10 - 1),
				(int) (Math.random() * 10 - 1));

		Bug bug = new Bug();
		Location location = new Location(5, 5);

		Flower flower = new Flower();

		Flower flower2 = new Flower();

		Location location1 = new Location(2, 3);
		Location location2 = new Location(1, 4);

		Location loc2 = new Location(5, 4);

		world.add(location, bug);

		bug.setColor(Color.blue);

		bug.setDirection(90);

		flower.setColor(Color.magenta);

		flower.setColor(Color.pink);

		world.add(loc, flower);

		world.add(loc2, flower2);

		for (int i = 0; i < 100; i++) {
			world.add(loc, flower);
			for (int j = 0; j < args.length; j++) {
					
				(i,j);

			}
			
			
			
		}

	}
}
