package mainPackage;

import displayPackage.Display;
import gameStatePacakge.GameGraphicsManagement;

public class MainClass {
	public static void main(String [] args){
		new GameGraphicsManagement(1000, 900, "Gomoku-AI").start();
	}
}
