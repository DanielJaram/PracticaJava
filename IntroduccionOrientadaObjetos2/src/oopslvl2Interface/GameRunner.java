package oopslvl2Interface;

public class GameRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MarioGame game = new MarioGame();
		//ChessGame game = new ChessGame();
		GamingConsole games[] = {new ChessGame(), new MarioGame()};
		
		for(GamingConsole game: games) {
			game.up();
			game.down();
			game.left();
			game.right();
		}
		/*
		GamingConsole game = new ChessGame();
		game.up();
		game.down();
		game.left();
		game.right();
		*/
	}

}
