package a_module4.FinalProjectMazeRunner;

public class MazeRunner {

	public static void main(String[] args) {
		Maze myMap = new Maze();
		myMap.printMap();
		System.out.println(myMap.canIMoveRight());
		
		myMap.moveRight();

		
		myMap.printMap();
	}

}
