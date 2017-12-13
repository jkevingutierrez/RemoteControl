package com.leanfactory.remote.app;

import java.util.List;
import java.util.Scanner;

import com.leanfactory.remote.core.Board;
import com.leanfactory.remote.core.Command;
import com.leanfactory.remote.core.CommandsBuilder;
import com.leanfactory.remote.core.Menu;
import com.leanfactory.remote.core.Vehicle;
import com.leanfactory.remote.helpers.SyntaxHelper;

public class Application {

	private static Scanner in;

	public static void main(String[] args) {
		Menu.start();

		in = new Scanner(System.in);

		System.out.println(
				"| 1. Ingrese las dimensiones del tablero (n x m)                                            |");
		System.out.println(
				"| 1.1 Ingrese n                                                                             |");

		int n = in.nextInt();

		System.out.println(
				"| 1.1 Ingrese m                                                                             |");

		int m = in.nextInt();

		Board board = new Board(n, m);
		Vehicle vehicle = new Vehicle(board);

		Menu.explain();

		String sentence;
		do {
			System.out.println("\tIngrese un comando o una lista de comandos:");
			sentence = in.next();
			if (SyntaxHelper.hasAValidSyntax(sentence)) {
				List<Command> commands = CommandsBuilder.buildCommands(sentence);
				for (Command command : commands) {
					if (!command.execute(vehicle)) {
						System.out.println("\n-- Se ha detenido el avance por salirse de los límites --\n");
						break;
					}
				}
			} else if (!sentence.toLowerCase().equals("c")) {
				System.out.println("\n-- Error en formato de comando --\n");
			}

		} while (!sentence.toLowerCase().equals("c"));

		Menu.finish();
	}

}
