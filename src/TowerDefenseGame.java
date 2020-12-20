import java.util.ArrayList;

public class TowerDefenseGame {
	ArrayList<Tower> towers;
	ArrayList<Ballon> ballons;
	public TowerDefenseGame() {
		towers = new ArrayList<Tower>();
		ballons = new ArrayList<Ballon>();
	}
	public void start() {
		GameWindow w = new GameWindow(1000,1200);
		w.setVis(true);
	}
}
