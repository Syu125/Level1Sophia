import org.jointheleague.graphical.robot.Robot;
public class House {
	static Robot houseDrawer=new Robot();
	
	public static void main(String[] args) {
		houseDrawer.moveTo(10, 500);
		drawHouse("small");
		houseDrawer.turn(-90);
		drawHouse("medium");
		houseDrawer.turn(-90);
		drawHouse("small");
		houseDrawer.turn(-90);
		drawHouse("large");
		houseDrawer.turn(-90);
		drawHouse("medium");
		houseDrawer.turn(-90);
		drawHouse("medium");
		houseDrawer.turn(-90);
		drawHouse("large");
		houseDrawer.turn(-90);
		drawHouse("small");
		houseDrawer.turn(-90);
		drawHouse("medium");
		houseDrawer.turn(-90);
		drawHouse("large");
	}
	static void drawHouse(String x) {
		int i=0;
		String color="white";
		if(x.equals("small")) {
				i=60;
				
			}
			if(x.equals("medium")) {
				i=120;
			
			}
			if(x.equals("large")) {
				i=250;
			}
			houseDrawer.setSpeed(26);
			houseDrawer.penDown();
			houseDrawer.move(i);;
			houseDrawer.turn(90);
			houseDrawer.move(40);
			houseDrawer.turn(90);
			houseDrawer.move(i);
			houseDrawer.turn(-90);
			houseDrawer.move(30);
		 }
}
